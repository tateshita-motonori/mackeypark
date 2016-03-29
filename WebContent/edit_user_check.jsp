<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/03.13.css">
<link rel="stylesheet" type="text/css" href="./css/botan.css">
<link rel="stylesheet" type="text/css" href="./css/20.Login.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="edit_user_check_title"/></title>
</head>
<body>
<jsp:include page="header.jsp" />
	<div id="main"></div>
	<p class="form-title"><s:text name="%{getText('edit_user_check__cheak')}"/></p>

	<div id="form" align="center">
		<table>
			<tr>
				<td><s:text name="%{getText('edit_user_check__pas')}"/></td>
				<td><s:text name="%{getText('edit_user_check__pashiddn')}"/></td>
			</tr>
			<tr>
				<td><s:text name="%{getText('edit_user_check__id')}"/></td>
				<td><%= request.getParameter("email") %></td>
			</tr>
			<tr>
				<td><s:text name="%{getText('edit_user_check__cardinf')}"/></td>
				<td><%= request.getParameter("card") %></td>
			</tr>
			<tr>
				<td><s:text name="%{getText('edit_user_check__cardnum')}"/></td>
				<td><s:text name="%{getText('edit_user_check__pashiddn')}"/></td>
			</tr>
			<tr>
				<td><s:text name="%{getText('edit_user_check__kigen')}"/></td>
				<td><%= request.getParameter("cardMonth") %>/<%= request.getParameter("cardYear") %></td>
			</tr>
		</table>
	</div>


	<h4 align="center">
		<s:text name="%{getText('edit_user_check__agree')}"/><br>
		<s:text name="%{getText('edit_user_check__ok')}"/>
	</h4>
	<div align="center">
		<s:a href="GoEditUserCompletionAction" ><s:submit type ="button"  cssClass ="button9"  value ="%{getText('edit_user_check__Purchase')}" /></s:a>
		<s:a href="ForwardEditUserAction" ><s:submit type ="button"  cssClass ="button8"  value ="%{getText('edit_user_check__return')}"  /></s:a>
	</div>
<jsp:include page="footer.jsp" />
</body>
</html>