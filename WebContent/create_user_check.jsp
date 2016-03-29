<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/03.13.css">
<link rel="stylesheet" type="text/css" href="./css/botan.css">
<link rel="stylesheet" type="text/css" href="./css/20.Login.css">
<title><s:text name="create_user_check.title" /></title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="main"></div>

	<p class="form-title"><s:text name="create_user_check.title" /></p>

	<div id="form" align="center">
		<table>

  		<tr>
    		<td><s:text name="create_user_check.naem" /></td>
    		<td><%= request.getParameter("userName") %></td>
  		</tr>
  		<tr>
    		<td><s:text name="create_user_check.kana" /></td>
    		<td><%= request.getParameter("nameKana") %></td>
  		</tr>
			<tr>
				<td><s:text name="create_user_check.pass" /></td>
				<td><s:text name="create_user_check.passSec" /></td>
			</tr>
			<tr>
				<td><s:text name="create_user_check.id" /></td>
				<td><%= request.getParameter("email") %></td>
			</tr>
			<tr>
				<td><s:text name="create_user_check.cardInf" /></td>
				<td><%= request.getParameter("card") %></td>
			</tr>
			<tr>
				<td><s:text name="create_user_check.num" /></td>
				<td><s:text name="create_user_check.passSec" /></td>
			</tr>
			<tr>
				<td><s:text name="create_user_check.limit" /></td>
				<td><%= request.getParameter("cardMonth") %>/<%= request.getParameter("cardYear") %></td>
			</tr>
		</table>



	<h4 align="center">
	<s:text name="create_user_check.agree" /><br>
	<s:text name="create_user_check.ok" />
	</h4>
	<div align="center">
		<s:a href="GoCreateUserCompletionAction" ><button class="button9" type="submit"><s:text name="create_user_check.reg" /></button></s:a>
		<s:a href="ForwardCreateUserAction" ><button class="button8" type="submit"><s:text name="create_user_check.return" /></button></s:a>
	</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>