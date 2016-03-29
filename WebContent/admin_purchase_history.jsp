<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="./js/jquery-1.12.0.min.js"></script>
<script type="text/javascript" src="./js/jPages.js"></script>
<link rel="stylesheet" type="text/css" href="./css/21.22.25.css">
<link rel="stylesheet" href="././css/bootstrap.min.css">
<script>

$(function(){
	$(".List").jPages({
		containerID : "CList",
            previous : "←", //前へのボタン
        	    next : "→", //次へのボタン
        	    	perPage : 5, //1ページに表示する個数
        	    		delay : 0, //要素間の表示速度
                    		animation: "" //アニメーションAnimate.cssを参考に
      });
});

</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><s:text name="%{getText('admin_purchase_history_buyhistry')}"/></title>

</head>

<body>

	<div id="site-box">
		<div id="b-box">
			<s:form action="AdminLogoutAction" cssStyle="display: inline"><s:submit label="%{getText('admin_purchase_history_Logout')}" type="button" /></s:form>
		</div>
		<div id="a-box">
			<h4><s:text name="%{getText('admin_purchase_history_kannri')}"/></h4>
			<table>
				<tr>
					<th>
						<s:form action="GoAdminItemAction" cssStyle="display: inline"><s:submit type="button" value="%{getText('admin_purchase_history_goods')}"/></s:form>
					</th>
					<th>
			            <s:form action="GoAdminUserAction" cssStyle="display: inline"><s:submit type="button" value="%{getText('admin_purchase_history_user')}"/></s:form>
					</th>
					<th>
						<s:form action="GoAdminPurchaseHistoryAction" cssStyle="display: inline"><s:submit label="%{getText('admin_purchase_history_buyhistry')}" type="button" /></s:form>
					</th>
				</tr>
			</table>
		</div>

		<div id="c-box">

			<h2><s:text name="%{getText('admin_purchase_history_buyhis')}"/></h2>

			<ul style="list-style: none">
				<li style="float: right">
					<s:form action="AdminSelectPurchaseHistoryAction">
						<li style="float: right">
							<s:submit type="button"  value="%{getText('admin_purchase_history_search')}"  />
						</li>
						<li style="float: right">
							<s:textfield name="selectCondition" placeholder="%{getText('admin_purchase_history_input')}"></s:textfield>
						</li>
						<li style="float: right"><s:select
								list="#{

										'sales_id':'購入ID',

										 'user_id':'ユーザーID',

										  'item_id':'商品ID',

										     'date':'購入日'
								}"
								name="selectDivision" /></li>
					</s:form></li>
			</ul>
			<table>
				<thead>
					<tr>
						<th class="border"><s:text name="%{getText('admin_purchase_history_buyid')}"/></th>
						<th class="border"><s:text name="%{getText('admin_purchase_history_useid')}"/></th>
						<th class="border"><s:text name="%{getText('admin_purchase_history_goodsID')}"/></th>
						<th class="border"><s:text name="%{getText('admin_purchase_history_buynum')}"/></th>
						<th class="border"><s:text name="%{getText('admin_purchase_history_date')}"/></th>
					</tr>
				</thead>
				<tbody id="CList">
					<s:iterator value="historyList">
						<tr>
							<td class="border"><s:property value="salesId"></s:property></td>
							<td class="border"><s:property value="userId"></s:property></td>
							<td class="border"><s:property value="itemId"></s:property></td>
							<td class="border"><s:property value="numberOfItems"></s:property></td>
							<td class="border"><s:property value="date"></s:property></td>
						</tr>
					</s:iterator>

				</tbody>
			</table>
		</div>
	</div>
	<div class="List"></div>
</body>
</html>