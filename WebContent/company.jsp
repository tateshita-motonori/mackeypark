<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href=".//css/19.kaisya.css">
<link rel="stylesheet" type="text/css" href=".//css/01.Login.css">
<title><s:text name ="company.title"/></title>
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
	<jsp:include page="header.jsp" />
	<div id="main"></div>
	<p class="form-title" align="center"><s:text name = "company.title"/></p>

	<div id="form" align="center">
		<table>
			<tr>
				<td><s:text name = "company.name"/></td>
				<td><s:text name = "company.name_ans"/></td>
			</tr>
			<tr>
				<td><s:text name = "company.establishment"/></td>
				<td><s:text name = "company.establishment_ans"/></td>
			</tr>
			<tr>
				<td><s:text name = "company.capital"/></td>
				<td><s:text name = "company.capital_ans"/></td>
			</tr>
			<tr></tr>
			<tr>
				<td><s:text name = "company.representative"/></td>
				<td><s:text name = "company.representative_ans"/></td>
			</tr>
			<tr>
				<td><s:text name = "company.employees"/></td>
				<td><s:text name = "company.employees_ans"/></td>
			</tr>
			<tr>
				<td><s:text name = "company.business"/></td>
				<td><s:text name = "company.business_ans"/></td>
			</tr>
			<tr>
				<td><s:text name = "company.address"/></td>
				<td><s:text name = "company.address_ans"/></td>
			</tr>
			<tr>
				<td><s:text name = "company.tellnumber"/></td>
				<td>379-4879-3837</td>
			</tr>
			<tr>
				<td><s:text name = "company.url"/></td>
				<td>http://mackeypark/kyodai/</td>
			</tr>
			<tr>
				<td><s:text name = "company.mail_address"/></td>
				<td>makeypark@gmail.com</td>
			</tr>
		</table>

		<div align="center">
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d681.1085567083752!2d139.76682280225296!3d35.70367070461558!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188c18b82a5b79%3A0xf4b11fd9c5add54c!2z44CSMTEzLTAwMzQg5p2x5Lqs6YO95paH5Lqs5Yy65rmv5bO277yT5LiB55uu77yS4oiS77yR77ySIOW-oeiMtuODjuawtOWkqeelnuODk-ODqw!5e0!3m2!1sja!2sjp!4v1455249753971"
				width="600" height="450" frameborder="0" style="border: 0"></iframe>
		</div>
	</div>
	<br>
	<br>
	<jsp:include page="footer.jsp" />

</body>
</html>

