<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
	<p>
		検索したいデータ情報を入力してください<br> ※全て空白の場合は全検索を行います
	</p>
	<c:if test="${not empty errorMessage }">
		<p class="error">${errorMessage}</p>
	</c:if>


	<form action="select" method="POST">
		<fieldset>
			<div>
				<label>名前</label> <input type="text" name="userName" value="">
			</div>
			<div>
				<label>TEL</label> <input type="text" name="tel" value="">
			</div>
		</fieldset>
		<button type="submit">検索</button>
	</form>
	<div>
		<a href="menu.jsp">メニューに戻る</a>
	</div>
</body>
</html>
