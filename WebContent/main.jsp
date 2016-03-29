<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="main.title" /></title>



<link rel="stylesheet" type="text/css" href="css/06.select.css">
<link rel="stylesheet" type="text/css" href="css/botan.css">
<link type="text/css" rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/cupertino/jquery-ui.min.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>
<!--1国際化対応のライブラリをインポート-->
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript">
	$(function() {
		// 2日本語を有効化
		$.datepicker.setDefaults($.datepicker.regional['ja']);
		// 3日付選択ボックスを生成
		$('#date').datepicker({
			dateFormat : 'yy/mm/dd'
		});
	});
</script>
<%
    boolean loginState;
    if (session.getAttribute("id") == null) {
        loginState = false;
    } else {
        loginState = true;
    }
%>

</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main">
		<img src="img/themepark.jpg" class="themepark">
		<div id="main_contents">
			<div class="checkbox">
				<table>
					<tr>
						<th><s:text name="%{getText('main.type')}" /></th>
						<th><s:text name="%{getText('main.remarks')}" /></th>
						<th><s:text name="%{getText('main.price')}" /></th>
					</tr>
					<s:iterator value="itemList">
						<tr>
							<td><s:property value="division" /></td>
							<td><s:property value="explanation" /></td>
							<td><s:property value="price" /></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</div>
		<%
		    if (loginState) {
		%>
		<div id="main_checkbox">
			<div class="checkboxright">
				<s:form action="GoSelectConditionAction.action">
					<button class="button9" type="submit">
						<s:text name="%{getText('main.purchase')}" />
					</button>
				</s:form>
			</div>
		</div>

		<%
		    } else {
		%>
		<div id="main_checkbox">
			<div class="checkboxright">
				<s:form action="GoSelectConditionAction.action">
					<button class="button9" type="submit">
						<s:text name="%{getText('main.purchase')}" />
					</button>
				</s:form>
				<s:form action="GoCreateUserAction.action">
					<button class="button8" type="submit">
						<s:text name="%{getText('main.newcreate')}" />
					</button>
				</s:form>
				<s:form action="GoMainToLoginAction.action">
					<button class="button7" type="submit">
						<s:text name="%{getText('main.login')}" />
					</button>
				</s:form>
			</div>
		</div>
		<% } %>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>