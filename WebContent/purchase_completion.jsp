<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="%{getText('purchase_completion.title')}"/></title>
<link rel="stylesheet" type="text/css" href=".//css/botan.css">
</head>
<body>
	<jsp:include page="header.jsp" />
		<div id="main">
			<div class="kan"align="center">
				<h1><s:text name="%{getText('purchase_completion.title')}"/></h1>
				<h1><s:text name="%{getText('purchase_completion.thank')}"/></h1>
				<br>
				<s:form action="GoMainAction">
					<button class="button9" type="submit"><s:text name="%{getText('purchase_completion.top')}"/></button>
				</s:form>
			</div>
		</div>
	<jsp:include page="footer.jsp" />
</body>
</html>