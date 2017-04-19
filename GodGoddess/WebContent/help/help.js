$(document).ready(function(){
	$('#_help_treegrid').treegrid({   
	    url:'../tBaseHelp/select.action',   
	    idField:'id',
	    treeField:'name',
	    parentField:'pid',
	    singleSelect:true,
	    height:$(window).height(),
	    border:false,
		fit:true,
		onCheck:function(rowData){
			initRole(rowData.id);
		},
	    columns:[[   
			{field:'ck',checkbox:true},
			{field:'name',title:'名称',width:150},  
			{field:'id',title:'编号',width:120,hidden:true},
			{field:'pid',title:'父节点',width:200,hidden:true},
			{field:'url',title:'链接地址',width:180}, 
			{field:'updatetime',title:'更新时间',width:130} 
	    ]],
	    toolbar: [{
			iconCls:'i_app_add',
			text:"增加",
			handler:function(){
				var data=$('#_help_treegrid').treegrid('getSelections');
				if(data.length > 1){
					$.messager.alert('警告','最多只能选择一个父节点！');
					return;			
				}
				if(data.length == 1){
					$('#_pid').val(data[0].id);
				}
				openWindow("_add_window","新增节点","[$('#_add_window')]");
			}
			},{
				iconCls:'i_app_edit',
				text:"编辑",
				handler:function(){
					var data=$('#_help_treegrid').treegrid('getSelections');
					if(validateOneRecord(data)){
						openWindow("_add_window","修改节点","[$('#_add_window')]");
						$('#_add_window').form('clear');
						$('#_name').val(data[0].name);
						$('#_id').val(data[0].id);
						$('#_pid').val(data[0].pid);
						$('#_url').val(data[0].url);
						
					}
				}
			},{
				iconCls:'i_app_delete',
				text:"删除",
				handler:function(){
					var data=$('#_help_treegrid').treegrid('getSelections');
					if(validateOneRecord(data)){
						//判断有没有子节点
						var childrens = $("#_help_treegrid").treegrid("getChildren",data[0].id);
						if(childrens.length > 0){
							$.messager.alert('警告','您选择的节点下还有子节点，请删除该子节点后再删除该节点！');
							return;
						}
						deleteBatch("../tBaseHelp/delete.action",{'e.id':data[0].id},function(result){
							var menuid = {'e.menuid':data[0].id};
							$.ajax({
								url:"../tHelpRoleMapping/deleteByMenuid.action",
								data:menuid,
								type:"post",
								dataType:"json",
								async: false,
								success: function(result){
									$('#base_role').tree('reload');
								}	
							});
							if(result == 1){
								$.messager.show({title:'系统消息',msg:'删除记录成功！',showType:'slide'});
								$('#_help_treegrid').treegrid('reload');
							}else{
								$.messager.alert('警告','删除记录失败！');
							}
						});
					}
				}
			},
			{
				iconCls: 'i_up',
				text:"上移",
				handler: function(){
					var data=$('#_help_treegrid').treegrid('getSelections');
					if(validateOneRecord(data)){
						var root = $('#_help_treegrid').treegrid('getRoot');
						if(root.id == data[0].id){
							$.messager.alert('系统消息','选中的节点为根节点，无法移动！');
							return false ;
						}
						var parent = $('#_help_treegrid').treegrid('getParent', data[0].id);
						var childrens = parent.children;
						if(childrens.length == 1){
							$.messager.alert('系统消息','没有同级节点，无法上移！');
							return false ;
						}	
						var previous = null;
						for(var i = 0;i<childrens.length;i++){
							if(childrens[i].id == data[0].id){
								if(i == 0){
									$.messager.alert('警告','该节点已为最顶层节点，无法移动。');   
									return;
								}
								previous = childrens[i-1];
								break;
							}
						}
						moveUpOrDown(data[0],previous);
					}
				}
			},
			{
				iconCls: 'i_down',
				text:"下移",
				handler: function(){
					var data=$('#_help_treegrid').treegrid('getSelections');
					if(validateOneRecord(data)){
						var root = $('#_help_treegrid').treegrid('getRoot');
						if(root.id == data[0].id){
							$.messager.alert('系统消息','选中的节点为根节点，无法移动！');
							return false ;
						}
						var parent = $('#_help_treegrid').treegrid('getParent', data[0].id);
						var childrens = parent.children;
						if(childrens.length == 1){
							$.messager.alert('系统消息','没有同级节点，无法下移！');
							return false ;
						}	
						var next = null;
						for(var i = 0;i<childrens.length;i++){
							if(childrens[i].id == data[0].id){
								if(i == childrens.length-1){
									$.messager.alert('警告','该节点已为最底层节点，无法移动。');   
									return;
								}
								next = childrens[i+1];
								break;
							}
						}
						moveUpOrDown(data[0],next);	
					}
				}
			}
		]
	});
}); 

function moveUpOrDown(current,np){
	var data={'e.id':current.id,'e.sequ':current.sequ,'np.id':np.id,'np.sequ':np.sequ};
	$.ajax({
		url:"../tBaseHelp/moveUpOrDown.action",
		data:data,
		type:"post",
		dataType:"json",
		async: false,
		success: function(result){ 
			if(result == 2){
				$.messager.show({title:'系统消息',msg:'移动成功！',showType:'slide'});
				$('#_help_treegrid').treegrid('reload');
				$('#_help_treegrid').treegrid('select',current.id);
			}else{
				$.messager.alert('警告','移动失败！');
			}
		}	
	});
	
	
}

//編輯页面保存按钮事件
function addSave(){   
	$('#_addForm').form('submit', {   
		url:"../tBaseHelp/save.action",
		async: true,
		onSubmit: function(){
			var _name = $("#_name").val();
			if(_name == ""){
				$.messager.alert('警告','名称不能为空！');   
				return false ;
			}
		},
		success:function(){ 
			$.messager.show({title:'系统消息',msg:'保存数据成功！',showType:'slide'});
			$('#_add_window').window('close');
			$('#_help_treegrid').treegrid('reload');
		}	
	});   
}  

//编辑窗体取消按钮事件
function addClose(){
	$('#_add_window').window('close');
} 

//帮助文档授权
var isExecuteChecked = true;
function initRole(menuid){
	$('#base_role').tree({
		url:"../tBaseRole/tBaseRoleAction-select.action",
	    idField:'id',
        textField: 'rolename',
        parentField: 'pid',
        cascadeCheck:false,
        checkbox:true,
        onLoadSuccess:function(node, data){
        	$.ajax({
				type: "POST",
				dataType: "json",
				url:"../tBaseRole/selectAddedHelpRoles.action",
				data: {"tBaseRoleEntity.menuid":menuid},
				success: function(data){		
					if(data !=null && data.length>0){
							for(var i=0;i<data.length;i++)  
							{  
									var node = $('#base_role').tree('find',data[i].id);  
									isExecuteChecked =false;
									$('#base_role').tree('check',node.target);  
									isExecuteChecked = true;
							}  
					}
				}
			});
        },
        onCheck:function(node, checked){
        	if(isExecuteChecked){
	        		if(checked){
	        			$.ajax({
	    					type: "POST",
	    					dataType: "json",
	    					url:"../tHelpRoleMapping/insert.action",
	    					data: {"e.menuid":menuid,"e.roleid":node.id},
	    					success: function(data){
	    						if(data !=null ){
	    							if(data == 1){
	    				   	    		$.messager.show({title:'系统消息',msg:'添加角色成功！',showType:'slide'});
	    				   	    	}else{
	    				   	    		$.messager.alert('警告','添加角色失败!'); 
	    				   	    		$('#base_role').tree('uncheck',node.target);
	    				   	    	}
	    						}
	    					}
	    				});
	        		}else{
	        			$.ajax({
	    					type: "POST",
	    					dataType: "json",
	    					url:"../tHelpRoleMapping/delete.action",
	    					data: {"e.menuid":menuid,"e.roleid":node.id},
	    					success: function(data){
	    						if(data !=null ){
	    							if(data == 1){
	    				   	    		$.messager.show({title:'系统消息',msg:'删除角色成功！',showType:'slide'});
	    				   	    	}else{
	    				   	    		$.messager.alert('警告','添加角色失败!'); 
	    				   	    		$('#base_role').tree('check',node.target);
	    				   	    	}
	    						}
	    					}
	    				});
	        		}	
        	}
        }      
	});
}
