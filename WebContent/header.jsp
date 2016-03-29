<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href=".//css/23.24.header_footer.css">
<link rel="stylesheet" type="text/css"
	href="/*ここに作成したcssファイルのURLを入れてみてください*/">
<title><s:text name="%{getText('header_footer.title')}"/></title>
</head>
<body>
<!--ログイン非ログインの判別-->
<%
boolean LoginState;
if(session.getAttribute( "id" )==null){
	LoginState=false;
}else{
	LoginState=true;
}
	%>
<!--ヘッダー全部ここから-->
	<!--ログアウト時ヘッダー-->
<%if(LoginState==false){ %>
	<div id="header">

		<a href="#" class="header-left">
		<img src="http://free-illustrations-ls01.gatag.net/images/lgi01a201409170000.jpg"
			class="sample"></a>

		<div class="ribbon">
				<s:a href="GoMainAction"><span><s:text name="%{getText('header_footer.top')}"/></span></s:a>
			 	<s:a href="GoCreateUserAction"><span><s:text name="%{getText('header_footer.newcreate')}"/></span></s:a>
			 <s:a href="GoLoginAction"><span><s:text name="%{getText('header_footer.login')}"/></span></s:a>
		</div>
	</div>
<%} %>



	<!--ログイン時ヘッダー-->
<% if(LoginState==true){%>
	<div id="header">

		<a href="#" class="header-left"><img
			src="http://free-illustrations-ls01.gatag.net/images/lgi01a201409170000.jpg"
			class="sample"></a>

		<div class="ribbon">
				<s:a href="GoMainAction"><span><s:text name="%{getText('header_footer.top')}"/></span></s:a>
				<s:a href="GoMyPageAction"><span><s:text name="%{getText('header_footer.mypage')}"/></span></s:a>
				<s:a href="GoLogoutCheckAction"><span><s:text name="%{getText('header_footer.logout')}"/></span></s:a>
		</div>
	</div>
<%} %>
<!--ヘッダー全部ここまで-->


</body>
</html>