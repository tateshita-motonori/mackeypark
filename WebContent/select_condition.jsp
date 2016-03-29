<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name = "select_condition_Title"></s:text></title>
<link rel="stylesheet" type="text/css" href="css/10.Design.css">
<link rel="stylesheet" type="text/css" href="css/botan.css">
<link type="text/css" rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/cupertino/jquery-ui.min.css" />
<script type="text/javascript"
  src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
  src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript">
$(function() {
  $.datepicker.setDefaults($.datepicker.regional['ja']);
  $('#date').datepicker({ dateFormat: 'yy/mm/dd' });
});
</script>
<s:if test="%{popup == 1}">
    <script type="text/javascript">alert("購入画面に遷移します。");</script>
</s:if>
</head>
<body>

<jsp:include page="header.jsp" />
	<s:property value="errorMessage"/>
    <s:form method="POST" action="GoPurchaseCheckAction">

	    <div id="main">
		  <div id="contents">
			<div class="checkbox">
<h2 align="center"><s:text name="select_condition_Title"/></h2>
		<table>
			<tr>
				<th><s:text name="%{getText('select_condition_Thekind')}"/></th>
				<th><s:text name="%{getText('select_condition_Description')}"/></th>
                <th><s:text name="%{getText('select_condition_Amountofmoney')}"/></th>
                <th><s:text name="%{getText('select_condition_Numberofsheets')}"/></th>

			</tr>
	     <s:iterator value="itemList">
			<tr>
				<td><s:property value="division" /></td>
					<s:hidden name="division" value="%{division}"/>
 				<td><s:property value="explanation" /></td>

<%-- 				<td><s:property value="price" /><s:text name="%{getText('select_condition_en')}"/></td> --%>
                <td><s:select list="periodList" name = "periodList"  value="%{periodList.get(0)}"/></td>

                <td><s:if test="%{division.equals('団体')}"><s:textfield name="numberOfItems" value="0" size="1"
                       					onKeyup="this.value=this.value.replace(/[^0-9]+/,'')"
                       					minlength="1" maxlength="2"/><s:text name="%{getText('select_condition_Ticket')}"/></s:if><s:else><select name="numberOfItems">
                <option value="0">0</option>
                <option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option></select><s:text name="%{getText('select_condition_Ticket')}"/></s:else></td>

			</tr>

	     </s:iterator>
        </table>



			</div>
			<div class="pass" >
               <font color="#ff0000"><s:property value="#session.tans"/></font>
               <br>
               <font color="#ff0000"><s:property value="#session.tans2"/></font>


               <br>


					<table>
						<tr>
							<th><img src="img/mackey.jpg"></th>
							<th><img src="img/mannie.jpg"></th>
							<th><img src="img/dolnad.jpg"></th>
							<th><img src="img/doisy.jpg"></th>
							<th><img src="img/gufy.png"></th>
							<th><img src="img/poluto.jpg"></th>
						</tr>
						<tr>
							<td><s:radio list="#{'マッキー':'マッキー'}" name="design" checked="checked"/></td>
							<td><s:radio list="#{'マニー':'マニー'}" name="design" /></td>
							<td><s:radio list="#{'ドルナド':'ドルナド'}" name="design"/></td>
							<td><s:radio list="#{'ドイジー':'ドイジー'}" name="design"/></td>
							<td><s:radio list="#{'グッフィー':'グッフィー'}" name="design"/></td>
							<td><s:radio list="#{'ポルート':'ポルート'}" name="design"/></td>
						</tr>
</table>



			<div id="cal1" class="cal_wrapper">

  <h3><s:text name="%{getText('select_condition_date')}"/></h3>

            <br>
            <s:property value="errorMessage2"/>
            <br>

            <s:textfield type="text" id="date" name="date" placeholder="%{getText('select_condition_select')}" />

            <br>

            <font color="#ff0000"><s:property value="#session.dans"/></font>

            <br>

			<div align="center"><s:submit type="button" cssClass="button9" value="%{getText('select_condition_next')}"/></div>
			<br><br><br><br>

			      </div>
                </div>
	          </div>
            </div>
      </s:form>
      <jsp:include page="footer.jsp" />
</body>
</html>