<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name ="withdrawal_check_Title"/></title>

<link rel="stylesheet"  href="css/botan.css">
</head>
<body>
	<jsp:include page="header.jsp" />
		<div id="main">
			<h1><s:text name ="withdrawal_check_Title"/></h1>
			<h1><s:text name ="withdrawal_check_really"/></h1>

       		<s:a href ="WithdrawalAction" >
				<button class="button9"  type="submit"><s:text name ="withdrawal_check_yes"/> </button>
	   		</s:a>

	  		<s:a href = "GoMainAction">
	   			<button class="button8" type="submit"><s:text name ="withdrawal_check_no"/></button>
	  		</s:a>
		</div>
	<jsp:include page="footer.jsp" />
</body>
</html>