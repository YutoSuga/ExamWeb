<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>

	<c:if test="${not empty errorMessage }">
		<p class="error">${errorMessage}</p>
	</c:if>


	<form action="login" method="POST">
		<fieldset>
			<div>
				<label>ID</label> <input type="text" name="loginId" value="">
				<c:if test="${not empty idMessage}">
 					<span class="error">${idMessage} </span>
				</c:if>

			</div>
			<div>
				<label>PASS</label> <input type="password" name="pass" value="">
				<c:if test="${not empty passMessage }">
					<span class="error">${passMessage}</span>
				</c:if>
			</div>
		</fieldset>
		<button type="submit">ログイン</button>
	</form>
	<div>
		<a href="index.jsp">TOP画面に戻る</a>
	</div>
</body>
</html>
