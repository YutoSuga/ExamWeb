<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	/*ログイン画面 */
%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>WSWebHost</title>
<link rel="stylesheet" href="css/host.css">
<style>
header{
	padding: auto auto;
	margin: 20px auto;
	color: #fff;
	background: #CCC;

}
* {
	padding: 0 auto;
	margin: 0 auto;
	text-align: center;
}
</style>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js">
	$(document).ready(function() {
		$("p.question").on("click", function() {
			$(this).next().slideToggle(fast);
		});
	});
</script>

</head>
<body>

	<header>
		<h1 class="">WSチャンネル管理者サイト</h1>
	</header>

	<div>
		<c:if test="${not empty errMsg}">
			<p class="error">${fn:escapeXml(errMsg)}</p>
		</c:if>
		<c:if test="${not empty idErrMsg}">
			<p class="error">${fn:escapeXml(idErrMsg)}</p>
		</c:if>
		<c:if test="${not empty passErrMsg}">
			<p class="error">${fn:escapeXml(passErrMsg)}</p>
		</c:if>
	</div>
	<div class="loginform">
		<form action="hostLogin" method="post">
			<table>
				<tr>
					<td><p>ID</p></td>
					<td><input name="loginId" type="text" maxlength="20" size="16"></td>

					<td></td>
				</tr>
				<tr>
					<td><p>パスワード</p></td>
					<td><input name="pass" type="password" maxlength="20"
						size="16"></td>
					<td><input type="submit" value="ログイン"></td>
				</tr>
			</table>
		</form>
	</div>
	<footer></footer>
</body>
</html>
