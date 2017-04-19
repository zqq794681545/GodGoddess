var src = "";
var kgtxCount = 0;//开工提醒
var kglyCount = 0;//开工履约
var jgtxCount = 0;//竣工提醒
var jglyCount = 0;//竣工履约
var kgsbspCount = 0;//开工申报审批
var jgsbspCount = 0;//竣工申报审批
var tdfhysspCount = 0;//土地复核验收审批
var tdfhyssbCount = 0;//土地复核验收申报
var kgsbCount = 0;//开工申报
var jgsbCount = 0;//竣工申报
var thlybzjCount = 0;//退还履约保证金
var thlybzjspCount = 0;//退还履约保证金审批
var xztdclcxCount = 0;//闲置土地处理程序
$(document).ready(function(){
	//项目提醒
	$.ajax({
		url:"../phjgXmxx/selectTxSum.action",
		type:"post",
		dataType:"json",
		async:false,//先查询 项目提醒    同步操作，查询完再进行加载页面
		success:function(map){
			if(map != null){
				kgtxCount = parseInt(map.kgtxCount);//开工提醒
				kglyCount = parseInt(map.kglyCount);//开工履约
				jgtxCount = parseInt(map.jgtxCount);//竣工提醒
				jglyCount = parseInt(map.jglyCount);//竣工履约
				kgsbspCount = parseInt(map.kgsbspCount);//开工申报审批
				jgsbspCount = map.jgsbspCount;//竣工申报审批
				tdfhysspCount = map.tdfhysspCount;//土地复核验收审批
				tdfhyssbCount = map.tdfhyssbCount;//土地复核验收申报
				kgsbCount = map.kgsbCount;
				jgsbCount = map.jgsbCount;
				thlybzjCount = map.thlybzjCount;
				thlybzjspCount = map.thlybzjspCount;
				xztdclcxCount = map.xztdclcxCount;
			}
		}
	});
	//根据角色查询菜单
	$.ajax({
		url:'../tBaseMenu/tBaseMenuAction-selectByRole.action',
		type:"post",
		dataType:"json",
		success: function(result){
			var _key = true;
			$.each(result,function(t,m){
				if(t != 0){
					_key = false;
				}
				if(m.pid == undefined || m.pid == ""){
					src += "<div  style='width:100%;text-align: center;'>";
					src += "<ul class='mainmenu' >";
					$.each(result,function(i,n){
						if(m.id == n.pid){
							src += "<li>";
							//获取二级菜单的地址 url 
							src += "<a class='_systen_menu' url='"+n.url+"' value='"+n.name+"'id='"+n.id+"' href='#' >";
							//获取固定文件夹 images/底下的图标    图标名称为数字字典配置
							src += "<div><img src='../images/"+n.icon+"'/>";
							//二级菜单名
							if(n.name == "开工提醒"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_kgtxCount'>"+kgtxCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></apan>";
							}
							else if(n.name == "开工履约"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_kglyCount'>"+kglyCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "竣工提醒"){
								src+="<span style='float:left; padding-top: 0em;'><font id='jgtxCount'>"+jgtxCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "竣工履约"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_jglyCount'>"+jglyCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "开工申报审批"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_kgsbspCount'>"+kgsbspCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "竣工申报审批"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_jgsbspCount'>"+jgsbspCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "土地复核验收审批"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_tdfhysspCount'>"+tdfhysspCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "土地复核验收申报"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_tdfhyssbCount'>"+tdfhyssbCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "开工申报"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_kgsbCount'>"+kgsbCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "竣工申报"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_jgsbCount'>"+jgsbCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "退还履约保证金"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_thlybzjCount'>"+thlybzjCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "退还履约保证金审批"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_thlybzjspCount'>"+thlybzjspCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}else if(n.name == "闲置土地处理程序"){
								src+="<span style='float:left; padding-top: 0em;'><font id='_xztdclcxCount'>"+xztdclcxCount+"条</font>"
								src += "<span style='padding-top:1.5em;'>"+n.name+"</span></span>";
							}
							else{
								src += "<span style='float:left;'>"+n.name+"</span>";
							}
							
							src += "</div></a>";
							src += "</li>";
						}
					})
					src += "</ul>";
					src += "</div>";
					$('#main_tabs').tabs('add',{   
					    title:m.name,
					    content:src,
					    closable:false
					});
					src = "";
				}
			});
			$('._systen_menu').on("click",function(){
				var _url = $(this).attr('url');
				$("#_wininput").val($(this).attr('id'));
				var _title = $(this).attr('value');
				if("undefined" != typeof(_url) && '-' != _url){
					$('#win').window({
						href:_url,
						title:_title,
					}).window('open');
				}
			});
			//固定添加一个
//			$('#main_tabs').tabs('add',{   
//			    title:"业务办理",
//			    content:"<iframe name='xxx' src='../phjg/dbxx_list.jsp' frameborder='0' style='height:100%;width:100%;'></iframe>",
//			    closable:false
//			});
		}
	});
	
	$("#_exit_system").click(function(){
		
	});
	
	//帮助
	$('#_help').bind('click', function(){
		window.open('../help/helpDoc.jsp', '帮助文档');
	}); 
	
	$('#win').window({
		onClose:function(){ 
			$.ajax({
				url:"../phjgXmxx/selectTxSum.action",
				type:"post",
				dataType:"json",
				async:false,//先查询 项目提醒    同步操作，查询完再进行加载页面
				success:function(map){
					if(map != null){
						kgtxCount = parseInt(map.kgtxCount);//开工提醒
						kglyCount = parseInt(map.kglyCount);//开工履约
						jgtxCount = parseInt(map.jgtxCount);//竣工提醒
						jglyCount = parseInt(map.jglyCount);//竣工履约
						kgsbspCount = parseInt(map.kgsbspCount);//开工申报审批
						jgsbspCount = map.jgsbspCount;//竣工申报审批
						tdfhysspCount = map.tdfhysspCount;//土地复核验收审批
						tdfhyssbCount = map.tdfhyssbCount;//土地复核验收申报
						kgsbCount = map.kgsbCount;
						jgsbCount = map.jgsbCount;
						thlybzjCount = map.thlybzjCount;
						thlybzjspCount = map.thlybzjspCount;
						xztdclcxCount = map.xztdclcxCount;
						
						$("#_kgtxCount").html(kgtxCount+"条");
						$("#_kglyCount").html(kglyCount+"条");
						$("#_jgtxCount").html(jgtxCount+"条");
						$("#_jglyCount").html(jglyCount+"条");
						$("#_kgsbspCount").html(kgsbspCount+"条");
						$("#_jgsbspCount").html(jgsbspCount+"条");
						$("#_tdfhysspCount").html(tdfhysspCount+"条");
						$("#_tdfhyssbCount").html(tdfhyssbCount+"条");
						$("#_kgsbCount").html(kgsbCount+"条");
						$("#_jgsbCount").html(jgsbCount+"条");
						$("#_thlybzjCount").html(thlybzjCount+"条");
						$("#_thlybzjspCount").html(thlybzjspCount+"条");
						$("#_xztdclcxCount").html(xztdclcxCount+"条");
					}
				}
			});
       }
	});
	
});
//子页面传值父页面，然后打开窗口  当固定添加一个页面的时候
function setHref(_url,_title){
	$('#win').window({
		href:_url,
		title:_title,
	}).window('open');
}


