<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
	<p>
		登録情報を入力してください<br> <span class="required"></span>は必須です
	</p>
	<c:if test="${not empty errorMessage }">
		<p class="error">${errorMessage}</p>
	</c:if>

	<form action="insert" method="POST">
		<fieldset class="label-60">
			<div>
				<label class="required">ID</label> <input type="text" name="loginId"
					value="">
				<c:if test="${not empty idMessage}">
					<span class="error">${idMessage} </span>
				</c:if>
			</div>
			<div>
				<label class="required">名前</label> <input type="text"
					name="userName" value="">
				<c:if test="${not empty userMessage}">
					<span class="error">${userMessage} </span>
				</c:if>
			</div>
			<div>
				<label class="required">TEL</label> <input type="text" name="tel"
					value="">
				<c:if test="${not empty telMessage}">
					<span class="error">${telMessage} </span>
				</c:if>
			</div>
			<div>
				<label class="required">権限</label> <select name="roleId">
					<option value="管理者">管理者</option>
					<option value="一般" selected>一般</option>
				</select>
			</div>
			<div>
				<label class="required">PASS</label> <input type="password"
					name="pass" value="">
				<c:if test="${not empty passMessage}">
					<span class="error">${passMessage} </span>
				</c:if>
			</div>
		</fieldset>
		<button type="submit">確認</button>
	</form>
	<div>
		<a href="menu.jsp">メニューに戻る</a>
	</div>
</body>
</html>
