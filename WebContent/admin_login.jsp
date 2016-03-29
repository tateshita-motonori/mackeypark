<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/20.Login.css" />
<link rel="stylesheet" type="text/css" href="css/botan2.css">
<title><s:text name="%{getText('admin_login.title')}"/></title>
</head>
<body>




		<div class="form-title" align="center">
			<p><s:text name="%{getText('admin_login.title')}"/></p>
		</div>
		<div id="form" align="center">
			<s:form action="AdminLoginAction">
				<h2>
					<s:text name="%{getText('admin_login.message')}"/>
				</h2>

            <table>
                <tr>
                   <td>
                       <h4>　　<s:text name="%{getText('admin_login.id')}"/>　　:<s:textfield name="id" /></h4>
                   </td>
                </tr>

                <tr>
                    <td>
                        <h4 ><s:text name="%{getText('admin_login.password')}"/>:<s:password  name="password" /></h4>
                    </td>
                </tr>

            </table>
				<s:submit align="center" cssClass="button9" type="button" value="%{getText('admin_login.login')}"/>
				<br>
				<br>

			</s:form>
		</div>


</body>
</html>