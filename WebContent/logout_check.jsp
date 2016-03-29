<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><s:text name="%{getText('user_logout.title')}"/></title>
<link rel="stylesheet" type="text/css" href="./css/botan.css">
</head>
<body>
	<jsp:include page="header.jsp" />
		<div id="main">
			<h1><s:text name="%{getText('user_logout.ask')}" /></h1>
		</div>
	<!-- ログアウト判別  [ログアウトしてメインページに遷移するボタン] -->
	<div align="center">
		<s:a href="LogoutAction">
			<button class="button9" type="submit">
				<s:text name="%{getText('user_logout.yes')}"/>
			</button>
		</s:a>
		<s:a href="GoMainAction">
			<button class="button8" type="submit">
				<s:text name="%{getText('user_logout.no')}"/>
			</button>
		</s:a>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
