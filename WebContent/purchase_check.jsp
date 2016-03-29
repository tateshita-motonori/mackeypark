<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="%{getText('purchase_check.title')}"/></title>

<link rel="stylesheet" type="text/css" href="./css/08.kakuninn.css">
<link rel="stylesheet" type="text/css" href="./css/botan.css">
</head>
<body>
<jsp:include page="header.jsp" />
<div id=main>
		<h1><s:text name="%{getText('purchase_check.title')}"/></h1>

	<div align="center">
		<table class="riigai">
			<tbody>
				<tr>
					<th><s:text name="%{getText('purchase_check.day1')}"/></th>
					<td class="#"><s:property value="%{perchaseDate}"/></td>
				</tr>
				<tr>
					<th><s:text name="%{getText('purchase_check.day2')}"/></th>
					<td class="#"><s:property value="%{date}"/></td>
				</tr>
				<tr>
                    <th><s:text name="%{getText('purchase_check.picture')}"/></th>
                    <td class="#"><s:property value="%{design}"/></td>
                </tr>
			</tbody>
		</table>

		<table class="allTiketto">
			<tbody>
				<tr>
					<th><s:text name="%{getText('purchase_check.type')}"/></th>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                </tr>
                <s:iterator value="itemList">
				    <tr>
				    <th></th>
				    <td><s:property value="division"/></td>
				    <td><s:property value="period"/></td>
				    <td><s:property value="numberOfItems"/><s:text name="%{getText('purchase_check.ticket')}"/></td>
				    <td><s:property value="subTotal"/><s:text name="%{getText('purchase_check.yen')}"/></td>
				    </tr>
				</s:iterator>
			</tbody>
		</table>

		<table class="allAll">
			<tbody>
				<tr>
					<th><s:text name="%{getText('purchase_check.total')}"/><br><s:text name="%{getText('purchase_check.tickets')}"/>
					</th>
					<td class=""><s:property value="%{sumOfItems}"/><s:text name="%{getText('purchase_check.tickets2')}"/></td>
				</tr>
				<tr>
					<th><s:text name="%{getText('purchase_check.total')}"/><br><s:text name="%{getText('purchase_check.price')}"/>
					</th>
					<td class=""><s:property value="%{totalPrice}"/><s:text name="%{getText('purchase_check.yen')}"/></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div align="center">
		<s:form action="GoPurchaseCompletionAction">
			<s:submit type="button" cssClass="button9" value="%{getText('purchase_check.confirm')}"/>
		&nbsp;&nbsp;&nbsp;&nbsp;
			<s:submit type="button" cssClass="button8" value="%{getText('purchase_check.return')}" formaction="ListSelectConditionItemsAction"/>
		</s:form>
	</div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>