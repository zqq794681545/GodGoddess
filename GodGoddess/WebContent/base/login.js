var login = getParameter("login");
$(document).ready(function(){
	
//	if(login == "1"){
////		$("#check_zp").show();
//		$('#_password').val("");
//		$('#_username').val("");
//	}
//	
//	layout();
//	
	var account = $.cookie('_account');
	if(null != account){
		$('#_username').val(account);
	}
//	
//	if($.cookie('_rememberpassword') == 1){
//		$("#_rememberpassword").attr("checked",'true');
//		$('#_password').val($.cookie('_password'));
//	}
    
	//登录
	$('#_login').submit(function(){
		var _pw = $('#_password').val();
		var _user = $('#_username').val();
		if(trim(_user) == "" || trim(_user) == null)
		{	
////			$("#check_zp").hide();
////			$("#check_empty").show();
			return false;
		}else{
			if(trim(_pw) == "" || trim(_pw) == null)
			{	
////				$("#check_zp").hide();
////				$("#check_empty").show();
				return false;
			}
			else
			{
				$('#_password').val($.md5(_pw));
				$.cookie("_account", $('#_username').val(), {expires:30,path:'/'});
				if($('#_rememberpassword').is(':checked')){
					$.cookie("_rememberpassword", 1, {expires:30,path:'/'});
					$.cookie("_password", _pw, {expires:30,path:'/'});
				}else{
					$.cookie("_rememberpassword", 0, {expires:30,path:'/'});
					$.cookie("_password", '', {expires:30,path:'/'});
				}
				return true;
			}
		}
//	
	});
	
});
