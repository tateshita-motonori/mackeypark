<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="UTF-8">
	<title><s:text name = "%{getText('admin_item.title')}"/></title>
	<link rel="stylesheet" type="text/css" href="./css/21.22.25.css">
	<link rel="stylesheet" href="././css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./js/modal-window.css">
	<script type="text/javascript" src="./js/jquery-1.12.0.min.js"></script>
	<script type="text/javascript" src="./js/modal-window.js"></script>
</head>
<body>

	<div id="site-box">
		<div id="b-box">
			<s:form action="AdminLogoutAction" style="display: inline"><s:submit label="%{getText('admin_item.logout')}" type="button" /></s:form>
		</div>
		<div id="a-box">
			<h3><s:text name = "%{getText('admin_item.title')}"/></h3>
			<table>
				<tr>
					<th>
						<s:form action="GoAdminItemAction" cssStyle="display: inline"><s:submit type="button" value="%{getText('admin_item.item')}"/></s:form>
					</th>
					<th>
			            <s:form action="GoAdminUserAction" cssStyle="display: inline"><s:submit type="button" value="%{getText('admin_item.user')}"/></s:form>
					</th>
					<th>
						<s:form action="GoAdminPurchaseHistoryAction" cssStyle="display: inline"><s:submit label="%{getText('admin_item.history')}" type="button" /></s:form>
					</th>
				</tr>
			</table>
		</div>


		<div id="c-box">
			<h2><s:text name = "%{getText('admin_item.title')}"/></h2>

			<!-- クリックでモーダルウィンドウ（商品入力フォーム）が出るボタン -->
			<div class="modal-open">
				<ul style="list-style: none">
					<li style="float: right"><s:submit type="button" value="%{getText('admin_item.add1')}" /></li>
				</ul>
			</div>

			<br>

			<!-- 商品名で検索 -->
			<s:form action="GoAdminItemAction">
				<s:hidden name="page" value="1" />
				<ul style="list-style: none">
					<li style="float: right">
						<s:submit type="button" value="%{getText('admin_item.search')}" />
					</li>
					<li style="float: right">
						<s:textfield name="selectItem" size="30" placeholder="%{getText('admin_item.input')}" value='%{selectItem}' />
					</li>
				</ul>
			</s:form>

			<!-- 商品削除（検索時は商品名とID、検索していない時は商品名で削除） -->
			<br>
			<s:form action="AdminDeleteItemAction">
				<s:hidden name="page" value="1" />
				<s:hidden name="selectItem" value="%{selectItem}" />
				<ul style="list-style: none">
					<li style="float: right">
						<s:submit type="button" value="%{getText('admin_item.remove')}" /></li>
					<li style="float: right">
						<s:textfield name="deleteItem" size="30"
										placeholder="%{getText('admin_item.name_id')}" />
					</li>
				</ul>
			</s:form>

			<br>

			<!-- 検索中に表示する検索結果リセット -->
			<s:if test="%{selectItem.length()>0}">
				<s:form action="GoAdminItemAction">
					<s:hidden name="selectItem" value="" />
					<s:hidden name="page" value="1" />
					<li style=""><s:submit value="%{getText('admin_item.reset')}" /></li>
				</s:form>
			</s:if>

			<!-- 各種メッセージ -->
			<s:property value="%{deleteMessage}" />
			<s:property value="%{insertMessage}" />
			<s:property value="%{errorMessage}" />
			<s:property value="%{nullErrorMessage}" />
			<s:property value="%{intErrorMessage}" />



			<!-- 商品テーブル -->
			<table>
				<tr>
					<th class="border"><s:text name = "%{getText('admin_item.id')}"/></th>
					<th class="border"><s:text name = "%{getText('admin_item.name')}"/></th>
					<th class="border"><s:text name = "%{getText('admin_item.deadline')}"/></th>
					<th class="border"><s:text name = "%{getText('admin_item.type')}"/></th>
					<th class="border"><s:text name = "%{getText('admin_item.explanation')}"/></th>
					<th class="border"><s:text name = "%{getText('admin_item.picture')}"/></th>
					<th class="border"><s:text name = "%{getText('admin_item.price')}"/></th>
				</tr>

				<s:iterator value="itemList">
					<tr>
						<td class="border"><s:property value="itemId" /></td>
						<td class="border"><s:property value="itemName" /></td>
						<td class="border"><s:property value="period" /></td>
						<td class="border"><s:property value="division" /></td>
						<td class="border"><s:property value="explanation" /></td>
						<td class="border"><s:property value="design" /></td>
						<td class="border"><s:property value="price" /></td>
					</tr>
				</s:iterator>
			</table>

			<!-- 検索結果がない時のメッセージ -->
			<s:property value="noResultMessage" />
		</div>
		<br>

		<!-- 商品リストのページリンク -->
		<div style="text-align: center">
			<s:iterator value="pageList">
            	<a href="	<s:url action="GoAdminItemAction">
            					<s:param name="page"><s:property/></s:param>
            					<s:param name="selectItem"><s:property value="%{selectItem}"/></s:param>
            				</s:url> ">
            				<s:property/>
            	</a>
			</s:iterator>
		</div>
	</div>

	<!-- 以下モーダルウィンドウの中身 (商品追加入力フォーム)-->
	<div id="modal" class="modal-content">
		<h4><s:text name = "%{getText('admin_item.information')}"/></h4>

		<s:form action="AdminInsertItemAction">
		 	<label><s:text name = "%{getText('admin_item.type')}"/></label><br>
  			<s:textfield cssStyle="width:300px;" cssClass="form-contorol" placeholder="%{getText('admin_item.type_enter')}" name="division"/><br><br>
			<label><s:text name = "%{getText('admin_item.deadline')}"/></label><br>
  			<s:select name="period" list="#{ '1日':'1day','1週間':'week','1ヶ月':'month','1年':'year'}"/><br><br>
  			<label><s:text name = "%{getText('admin_item.explanation')}"/></label><br>
  			<s:textfield cssStyle="width:300px;" cssClass="form-contorol" placeholder="%{getText('admin_item.input2')}" name="explanation"/><br><br>
			<label><s:text name = "%{getText('admin_item.price')}"/></label><br>
  			<s:textfield cssStyle="width:300px;" cssClass="form-contorol" placeholder="%{getText('admin_item.integer')}" name="price"/><br><br>

 			<s:hidden name="page" value="1" />
			<s:hidden name="selectItem" value="%{selectItem}" />

			<!-- 送信ボタンで送信を行い、モーダルウィンドウを閉じます。 -->
 			<div class="modal-close">
 				<s:submit type="button" value="%{getText('admin_item.add2')}"/>
 			</div>
		</s:form>

		<!-- キャンセルでモーダルウィンドウを閉じます。 -->
	 	<div class="modal-close">
 			<s:submit type="button" value="%{getText('admin_item.cancel')}"/>
 		</div>
 	</div>
</body>
</html>