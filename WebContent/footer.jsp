<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href=".//css/23.24.header_footer.css">
<title>Insert title here</title>
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
<!--フッター全部ここから-->
	<!--ログアウト時フッター-->
<%if(LoginState==false){ %>
	<div id="footer">
		<div class="footer-right">
			<ul>
					<li><s:a href="GoCompanyAction"><s:text name="%{getText('header_footer.company')}"/></s:a></li>
					<li><s:a href="GoTermsOfServiceAction"><s:text name="%{getText('header_footer.term')}"/></s:a></li>
					<li><s:a href="GoHelpAction">Q&A</s:a></li>
			</ul>
		</div>
	</div>
<%} %>
	<!--ログイン時フッター-->
<%if(LoginState==true){ %>
	<div id="footer">
		<div class="footer-right">
			<ul>
					<li><s:a href="GoWithdrawalCheckAction"><s:text name="%{getText('header_footer.withdrawal')}"/></s:a></li>
					<li><s:a href="GoCompanyAction"><s:text name="%{getText('header_footer.company')}"/></s:a></li>
					<li><s:a href="GoTermsOfServiceAction"><s:text name="%{getText('header_footer.term')}"/></s:a></li>
					<li><s:a href="GoHelpAction">Q&A</s:a></li>
			</ul>
		</div>
	</div>
<%} %>
<!--フッター全部ここまで-->
</body>
</html>