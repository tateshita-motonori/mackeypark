<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="././css/bootstrap.min.css">
<script type="text/javascript" src="./js/jquery-1.12.0.min.js"></script>
<script type="text/javascript" src="./js/jPages.js"></script>
<s:if test="%{result.equals('ERROR')}">
	<script type="text/javascript">
window.alert("ユーザーが存在しません");
</script>

</s:if>
<script>

$(function(){
    $(".List").jPages({
        containerID : "CList",
            previous : " ← ", //前へのボタン
                next : " → ", //次へのボタン
                    perPage : 10, //1ページに表示する個数
                        delay : 0, //要素間の表示速度

      });
});

</script>

<title><s:text name="%{getText('admin_user.title')}" /></title>
<link rel="stylesheet" type="text/css" href=".//css/21.22.25.css">
</head>
<body>

	<div id="site-box">
		<div id="b-box">
			<s:form action="AdminLogoutAction" cssStyle="display: inline">
				<s:submit label="%{getText('admin_user.logout')}" type="button" />
			</s:form>
		</div>
		<div id="a-box">
			<h3>
				<s:text name="%{getText('admin_user.screen')}" />
			</h3>
			<table>
				<tr>
					<th><s:form action="GoAdminItemAction"
							cssStyle="display: inline">
							<s:submit type="button"
								value="%{getText('admin_user.goods')}" />
						</s:form></th>
					<th><s:form action="GoAdminUserAction"
							cssStyle="display: inline">
							<s:submit type="button" value="%{getText('admin_user.user')}" />
						</s:form></th>
					<th><s:form action="GoAdminPurchaseHistoryAction"
							cssStyle="display: inline">
							<s:submit label="%{getText('admin_user.history')}"
								type="button" />
						</s:form></th>
				</tr>
			</table>
		</div>

		<div id="c-box">
			<h2>
				<s:text name="%{getText('admin_user.title')}" />
			</h2>
			<ul style="list-style: none">
			</ul>
			<br>

			<ul style="list-style: none">
				<s:form action="AdminSelectUsersAction">

					<li style="float: right"><s:submit
							value="%{getText('admin_user.search')}" style="width:120px" /></li>
					<li style="float: right"><s:textfield name="userName"
							placeholder="%{getText('admin_user.name_enter')}" size="25" /></li>

				</s:form>
			</ul>
			<br>

			<ul style="list-style: none">
				<s:form action="AdminDeleteUserAction">
					<li style="float: right"><s:submit
							value="%{getText('admin_user.remove')}" style="width:120px" />
					</li>
					<li style="float: right"><s:textfield name="id"
							placeholder="%{getText('admin_user.id_enter')}" size="25" /></li>
				</s:form>

			</ul>
			<br>

			<ul style="list-style: none">
				<s:form action="GoAdminUserAction">
					<li style="float: right"><s:submit
							value="%{getText('admin_user.display')}" style="width:120px" />
					</li>
				</s:form>

			</ul>




			<div align="center">
			<s:property value = "errorMessage"/>
				<table>
					<thead>
						<tr>
							<th class="border"><s:text name="ID" /></th>
							<th class="border"><s:text
									name="%{getText('admin_user.password')}" /></th>
							<th class="border"><s:text
									name="%{getText('admin_user.user_name')}" /></th>
							<th class="border"><s:text
									name="%{getText('admin_user.mail_address')}" /></th>
						</tr>
					</thead>

					<tbody id="CList">
						<s:iterator value="userList">
							<tr>
								<td class="border"><s:property value="id" /></td>

								<td class="border"><s:property value="password" /></td>

								<td class="border"><s:property value="UserName" /></td>

								<td class="border"><s:property value="email" /></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>

				<div class="List"></div>
			</div>
		</div>

	</div>



</body>
</html>
