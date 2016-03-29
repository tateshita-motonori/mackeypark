<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang = "ja">
<head>
<title><s:text name="edit_user.title"/></title>
  <link rel="stylesheet" type="text/css" href="./css/botan.css" media="all" >
  <link rel="stylesheet" type="text/css" href="./css/02.Shinnki-Touroku.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<script>
function checkPassword(e) {
    pass = document.getElementById("password");
    pass1 = document.getElementById("password1");
    if (e.checked) {
        pass.setAttribute("type", "text");
        pass1.setAttribute("type","text");
    } else {
        pass.setAttribute("type", "password");
        pass1.setAttribute("type", "password")
    }
}
</script>
<jsp:include page="header.jsp" />
	<div class="all">
		<div class="title">
			<p class="form-title"><s:text name="edit_user.title"/></p>
		</div>
		<font color ="red"><s:property value="emailConfirmErrorMessage"/></font>
<div id="form">
			<div class="sub2-title">
				<h4><s:text name="edit_user.inf"/></h4>
			</div>

 <s:form action="GoEditUserCheckAction">
		<div class="nyuryoku">
			<h4><span class="komezirushi">※</span><s:text name="edit_user.his"/></h4>

			<h4><span class="komezirushi">※</span><s:text name="edit_user.pas"/></h4>
			<s:password type="password" id="password" name="password"/>
			<font color="red"><s:fielderror><s:param value="%{'password'}" /></s:fielderror></font>

			<h4><span class="komezirushi">※</span><s:text name="edit_user.pass"/></h4>
			<s:password type="password" id="password1" name="reTypePassword"/>
			<font color="red"><s:fielderror><s:param value="%{'reTypePassword'}" /></s:fielderror></font>

			<h4><input type="checkbox" onclick="checkPassword(this)" /><s:text name="edit_user.passShow"/></h4>

			<h4 style="color:red"><s:text name="edit_user.mail"/></h4>
			<h4><span class="komezirushi">※</span><s:text name="edit_user.newMail"/></h4>
			<s:textfield name="email"/>
			<font color="red"><s:fielderror><s:param value="%{'email'}" /></s:fielderror></font>

			<h4><span class="komezirushi">※</span><s:text name="edit_user.knewMail"/></h4>
			<s:textfield name="reTypeEmail"/>
			<font color="red"><s:fielderror><s:param value="%{'reTypeEmail'}" /></s:fielderror></font>

	 <br><br><br><br><br><br>
	 <h4><s:text name="edit_user.cardReg"/></h4>



	 <h4><span class="akamozi"><s:text name="edit_user.req"/></span></h4>
	 <h4><s:text name="edit_user.card"/></h4>

	 <s:select name="card" list = "#{'':'入力してください','VISA':'VISA', 'JCB':'JCB','MASTER':'MASTER'}"/>



	 <h4><s:text name="edit_user.cardNum"/></h4>
	 <s:password type="password" name="cardNumber"/>
	<font color="red"><s:fielderror><s:param value="%{'cardNumber'}" /></s:fielderror></font>

	 <h4><s:text name="edit_user.limit"/></h4>
	 <div class="yukoukigenn">
		 <ul>
		　　<li>
				<h4>MONTH</h4>
				<s:select name="cardMonth" list ="#{'':'','1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7','8':'8','9':'9','10':'10','11':'11','12':'12'} "/>
			 </li>
			 <li><h4> / </h4></li>
			 <li>
				 <h4>YEAR</h4>
				<s:select name="cardYear" list="#{'':'','2017':'17','2018':'18','2019':'19','2020':'20','2021':'21','2022':'22'}"/>

			 </li>
		 </ul>
	 </div>
 			 <br><br><br><br><br><br><br>
			 <h4><s:text name="edit_user.cardName"/></h4>
			<s:textfield label="cardHolder" name="cardHolder"/>
			<font color="red"><s:fielderror><s:param value="%{'cardHolder'}" /></s:fielderror></font>

			 <h4><s:text name="edit_user.cardSec"/></h4>
			 <s:textfield label="securityCode" name="securityCode"/>
		     <font color="red"><s:fielderror><s:param value="%{'securityCode'}" /></s:fielderror></font>
	</div>
	<div align="center">
     <button class="button9" type="submit"><s:text name="edit_user.kan"/></button>
	</div>
 </s:form>
		</div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>
