<!-- mackey -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title><s:text name ="create_user.title"/></title>
    <link rel="stylesheet" type="text/css" href="./css/botan.css" media="all" >
    <link rel="stylesheet" type="text/css" href="./css/02.Shinnki-Touroku.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style type="text/css">
	.errorMessage {
		color: red;
		list-style-type: none;
		font-family:'Meiryo';
		font-size:14px;
	}
	</style>
</head>

<body>
<jsp:include page="header.jsp" />
	<div id="main"></div>
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
	<div class="all">
		<div class="title">
			<p class="form-title"><s:text name ="create_user.title"/></p>
		</div>
	<div id="form">
			<div class="sub-title">
				<h3><s:text name ="create_user.logout"/></h3>
			</div>
			<div class="sub2-title">
				<h4><s:text name ="create_user.kaiin"/></h4>
			</div>
			<div class="aikon">
				<h4><s:text name ="create_user.sns"/></h4>
	<ul>
			<!-- フェイスブック  -->
			<li><s:url var="facebook" action="login-facebook"/>
	       	<s:a href="%{facebook}" ><img src="img/Facebook.jpg" style="zoom: 40%;"></s:a></li>

	        <!-- ツイッター -->
	        <li><s:url var="twitter" action="login-twitter" />
	        <s:a href="%{twitter}"><img src="img/twitter.jpg" style="zoom: 20%;"></s:a></li>

			<!-- グーグル  -->
			<li><s:url var="google" action="login-google" />
	        <s:a href="%{google}"><img src="img/GooglePlusIcon.jpg" style="zoom: 32%;"></s:a></li>
	        </ul>
		 </div>
		 <br><br><br><br><br><br><br><br><br><br>
		 <s:iterator value="termsOfServiceErrorMessage"><br><font color ="red"><s:property value="termsOfServiceErrorMessage"/></font><br></s:iterator>
		 <s:iterator value="cardInformationErrorMessage"><br><font color ="red"><s:property value="cardInformationErrorMessage"/></font><br></s:iterator>
		 <s:iterator value="emailConfirmErrorMessage"><br><font color ="red"><s:property value="emailConfirmErrorMessage"/></font><br></s:iterator>

	 <s:form action="GoCreateUserCheckAction">
			<div class="nyuryoku">
				<h4><span class="komezirushi">※</span><s:text name ="create_user.inp"/></h4>
				<br>
				<h4><span class="komezirushi">※</span><s:text name ="create_user.name"/></h4>
				<s:textfield name="userName"/>
				<s:fielderror><s:param value="%{'userName'}" /></s:fielderror>

				<h4><span class="komezirushi">※</span><s:text name ="create_user.kana"/></h4>
				<s:textfield name="nameKana"/>
				<s:fielderror><s:param value="%{'nameKana'}" /></s:fielderror>


				<h4><span class="komezirushi">※</span><s:text name ="create_user.pas"/></h4>
				<s:password type="password" id="password" name="password"/>
				<s:fielderror><s:param value="%{'password'}" /></s:fielderror>

				<h4><span class="komezirushi">※</span><s:text name ="create_user.paskaku"/></h4>
				<s:password type="password" id="password1" name="reTypePassword"/>
				<s:fielderror><s:param value="%{'reTypePassword'}" /></s:fielderror>
				<h4><input type="checkbox" onclick="checkPassword(this)" /><s:text name ="create_user.showpas"/></h4>

				<h4 style="color:red"><s:text name ="create_user.mailID"/></h4>

				<h4><span class="komezirushi">※</span><s:text name ="create_user.mailadd"/></h4>
				<s:textfield name="email"/>
				<s:fielderror><s:param value="%{'email'}" /></s:fielderror>

				<h4><span class="komezirushi">※</span><s:text name ="create_user.mailspen"/></h4>
				<s:textfield name="reTypeEmail"/>
				<s:fielderror><s:param value="%{'reTypeEmail'}" /></s:fielderror>

		 <br><br><br><br><br><br>
		 <h4><s:text name ="create_user.card"/></h4>
		 <h4><span class="akamozi"><s:text name ="create_user.cardH"/></span></h4>
		 <h4><s:text name ="create_user.cardif"/></h4>
		 <s:select name="card" list = "#{'':'入力してください','VISA':'VISA', 'JCB':'JCB','MASTER':'MASTER'}"/>
		 <h4><s:text name ="create_user.cardNum"/></h4>
		 <s:password type="password" name="cardNumber"/>
		<s:fielderror><s:param value="%{'cardNumber'}" /></s:fielderror>
		 <h4><s:text name ="create_user.limit"/></h4>
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
				 <h4><s:text name ="create_user.cardName"/></h4>
				<s:textfield name="cardHolder"/>
				<s:fielderror><s:param value="%{'cardHolder'}" /></s:fielderror>

				 <h4><s:text name ="create_user.ceq"/></h4>
				 <s:textfield name="securityCode"/>
				<s:fielderror><s:param value="%{'securityCode'}" /></s:fielderror>
						 <h4>
								 <s:checkbox name="termsOfService" /><s:text name ="create_user.agree"/>
						 </h4>
		</div>
	     <div align="center"><button class="button9" type="submit"><s:text name ="create_user.ok"/></button></div>
	 </s:form>
	</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
