$(document).ready(function(){
	$('#_help_tree').tree({   
			url:"../tBaseHelp/selectByRole.action",
		    idField:'id',
	        textField:'name',
	        parentField:'pid',
	        attributes: ['url','pid','state','name','sequ','updatetime','id'],
	        dnd:true,
	        onClick: function(node){
	        	var url = node.attributes.url;
	        	if(url != null && url != ""){
	        		doLoad(url);
	        	 }
	        }
	});   
});

//窗体载入事件
function doLoad(url){
	$('#_help_panel').panel({
		href : 'pages/'+url,
		height : $(window).height(),
		onLoad : function() {
		}
	});
}  

// 查询按钮事件
function doSearch(){
	var data = {'e.name':$('#_name_tree').val()};
	if($('#_name_tree').val() != "" && $('#_name_tree').val() != null){
		$.ajax({
			url:"../tBaseHelp/selectIdByName.action",
			data:data,
			type:"post",
			dataType:"json",
			async: false,
			success: function(result){
				if(result != null && result.length > 0){
					var target = $('#_help_tree').tree('find',result[0]);
					$('#_help_tree').tree('select',target.target);
				}
			}	
		});
	}
}