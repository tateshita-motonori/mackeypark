<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="create_user_completion" /></title>
<link rel="stylesheet" type="text/css" href=".//css/botan.css">
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
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main">
			<h1><s:text name="create_user_completion_thanks"/></h1><br>
			<h1><s:text name="create_user_completion_ok" /></h1>
			<s:a href="GoMainAction">
				<button class="button9" type="submit">
					<s:text name="create_user_completion_gotop" />
				</button>
			</s:a>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>