<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name ="help.title"/></title>
<link rel="stylesheet" type="text/css" href="css/botan.css" media="all" />
<link rel="stylesheet" type="text/css" href="css/17.QA.css">
<link type="text/css" rel="stylesheet"
  href="http://code.jquery.com/ui/1.10.3/themes/cupertino/jquery-ui.min.css" />
</head>
<body>
<jsp:include page="header.jsp" />
<h1 align="center"><s:text name ="help.title"/></h1>
	<div id=form>
		<div class="main-form">
			<p><s:text name = "%{getText('help.disply')}"/></p>

			<table class="main-formin">
				<tr>
					<th>
						<div
							onclick="obj=document.getElementById('open').style; obj.display=(obj.display=='none')?'block':'none';">
							<a style="cursor: pointer;"><s:text name = "%{getText('help.question1')}"/></a>
						</div>
					</th>
				</tr>
				<tr>
					<td>
						<div id="open" style="display: none; clear: both;"><s:text name = "%{getText('help.answer1')}"/></div>
					</td>
				</tr>
				<tr>
					<th>
						<div
							onclick="obj=document.getElementById('open1').style; obj.display=(obj.display=='none')?'block':'none';">
							<a style="cursor: pointer;"><s:text name = "%{getText('help.question2')}"/></a>
						</div>
					</th>
				</tr>
				<tr>
					<td>
						<div id="open1" style="display: none; clear: both;"><s:text name = "%{getText('help.answer3')}"/></div>
					</td>
				</tr>
				<tr>
					<th>
						<div
							onclick="obj=document.getElementById('open2').style; obj.display=(obj.display=='none')?'block':'none';">
							<a style="cursor: pointer;"><s:text name = "%{getText('help.question3')}"/></a>
						</div>
					</th>
				</tr>
				<tr>
					<td>
						<div id="open2" style="display: none; clear: both;"><s:text name = "%{getText('help.answer4')}"/></div>
					</td>
				</tr>
				<tr>
					<th>
						<div
							onclick="obj=document.getElementById('open3').style; obj.display=(obj.display=='none')?'block':'none';">
							<a style="cursor: pointer;"><s:text name = "%{getText('help.question5')}"/></a>
						</div>
					</th>
				</tr>
				<tr>
					<td>
						<div id="open3" style="display: none; clear: both;"><s:text name = "%{getText('help.answer6')}"/></div>
					</td>
				</tr>
				<tr>
					<th>
						<div
							onclick="obj=document.getElementById('open4').style; obj.display=(obj.display=='none')?'block':'none';">
							<a style="cursor: pointer;"><s:text name = "help.question6"/></a>
						</div>
					</th>
				</tr>
				<tr>
					<td>
						<div id="open4" style="display: none; clear: both;">
							<s:text name="%{getText('help.answer7')}" />
							<br>
							<s:text name="%{getText('help.answer8')}" />
						</div>
					</td>
				</tr>
				<tr>
					<th>
						<div
							onclick="obj=document.getElementById('open5').style; obj.display=(obj.display=='none')?'block':'none';">
							<a style="cursor: pointer;"><s:text name = "%{getText('help.question7')}"/></a>
						</div>
					</th>
				</tr>
				<tr>
					<td>
						<div id="open5" style="display: none; clear: both;"><s:text name = "%{getText('help.answer9')}"/>
						</div>
					</td>
				</tr>
				<tr>
					<th>
						<div
							onclick="obj=document.getElementById('open6').style; obj.display=(obj.display=='none')?'block':'none';">
							<a style="cursor: pointer;"><s:text name = "%{getText('help.question8')}"/></a>
						</div>
					</th>
				</tr>
				<tr>
					<td>
						<div id="open6" style="display: none; clear: both;"><s:text name = "%{getText('help.answer10')}"/>
						</div>
					</td>
				</tr>
			</table>
		</div>

		<div class="fields">
			<p>
				<label><s:text name = "%{getText('help.form')}"/></label>
			</p>
			<h4><s:text name = "%{getText('help.form_ans')}"/> </h4>

			<div class="QAform">
				<table>

					<s:form action="InsertInquiryAction">
					<div align="center">
					<font color="red"> <br> <br> <s:property
						value="insertCheckMessage" />
				          </font>
				          </div>
						<table>
							<tr>
								<td>
									<span class="hoshi">☆</span> <s:text name="%{getText('help.form_name')}"></s:text>
								</td>
							</tr>
							<tr>
								<td>
									<s:textfield name="formName" cssClass="textarea"></s:textfield>
								</td>
							</tr>
							<tr>
								<td>
									<span class="hoshi">☆</span> <s:text name="%{getText('help.form_mail')}"></s:text>
								</td>
							</tr>
							<tr>
								<td>
									<s:textfield name="formAddress" cssClass="textarea"></s:textfield>
								</td>
							</tr>
							<tr>
								<td>
									<h4><s:fielderror><s:param value="%{'formAddress'}" /></s:fielderror></h4>
								</td>
							</tr>
							<tr>
								<td><span class="hoshi">☆</span> <s:text name="%{getText('help.form_content')}"></s:text></td>
							</tr>
							<tr>
								<td>
									<s:textarea name="formContents" cssClass="textarea1"></s:textarea>
								</td>
							</tr>
						</table>
						<div class="transmissionalign" align="center">
							<s:submit cssClass="button9" type="button" label="%{getText('help.transmission')}" />
						</div>
					</s:form>
				</table>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
