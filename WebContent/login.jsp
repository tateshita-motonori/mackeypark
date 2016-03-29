<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/01.Login.css" />
<title><s:text name = "user_login.title"/></title>
<s:if test="%{popup == 1}">
    <script type="text/javascript">alert("ログインしてないのでログイン画面に遷移します。");</script>
</s:if>
<s:if test="%{popup == 2}">
    <script type="text/javascript">alert("ログイン画面に遷移します。");</script>
</s:if>
</head>
<body>
	<h1><s:text name = "user_login.title"/></h1>
	<%-- スキンここから --%>
	<div class="skin">
		<h4><s:text name = "user_login.massage"/></h4>
		<%-- ログインエラー時に表示されるメッセージ --%>
		<div class="errorMsg">
			<s:property value="errorMessage" />
		</div>
		<%--  ログイン --%>
		<s:form action="LoginAction" namespace="/" theme="simple">
			<table>
				<tr>
					<td><s:text name = "user_login.id"/></td>
					<td>：<s:textfield name="email" /></td>
				</tr>
				<tr>
					<td><s:text name = "user_login.password"/></td>
					<td>：<s:password name="password" /></td>
				<tr>
			</table>
			<s:submit cssClass="loginBtn" value="%{getText('user_login.login')}"  />
		</s:form>
		<%--OAuth認証 --%>
		<ul>
			<li><s:text name = "user_login.sns"/></li>
			<%-- フェイスブック  --%>
			<li><s:url var="facebook" action="login-facebook" /> <s:a
					href="%{facebook}">
					<img src="img/Facebook.jpg">
				</s:a></li>
			<%-- ツイッター --%>
			<li><s:url var="twitter" action="login-twitter" /> <s:a
					href="%{twitter}">
					<img src="img/twitter.jpg">
				</s:a></li>
			<%--  グーグル --%>
			<li><s:url var="google" action="login-google" /> <s:a
					href="%{google}">
					<img src="img/GooglePlusIcon.jpg">
				</s:a></li>
		</ul>
	</div>
	<%-- スキンここまで --%>
	<p><s:text name = "user_login.new"/></p>
	<%-- 新規登録 --%>
	<s:form action="GoCreateUserAction" namespace="/">
		<s:submit cssClass="registBtn" value="%{getText('user_login.registration')}" />
	</s:form>
</body>
</html>