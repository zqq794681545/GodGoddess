$(document).ready(function(){
	
	layout();
	 $(window).resize(function(){
		 layout(); 
	 });
	 
	 $('#_go_back').click(function(){
		 location.href = "login.jsp";
	 });
	 
	 
});
function layout(){
	$(".header").css("height",($(window).height()-270)/2);
	$(".footer").css("height",($(window).height()-270)/2);
}