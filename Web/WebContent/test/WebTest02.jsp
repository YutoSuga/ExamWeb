<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>瞬間計算サイト</title>

</head>


<body>
	<header>
		<h1>瞬間計算サイト</h1>
	</header>
	<div>

		<a>☆入力フォーム☆</a><br>入力欄には数字だけをいれてね
		<form action="/Web/test/test02" method="POST">
			<input type="text" name="num1" value="${param.num1}"> <select
				name="calc">
				<option value="sum">+</option>
				<option value="del">-</option>
				<option value="mul">×</option>
				<option value="div">÷</option>
			</select> <input type="text" name="num2" value="${param.num2}"> <br>
			<input type="submit" value="計算する">
		</form>
	</div>

	<div>
		<c:if test="${not empty result}">
		<h2>❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏</h2><br>
			<p>☆計算結果☆</p><br>
			${param.num1} ${param.calc} ${param.num2} = ${result}
		</c:if>
	</div>
	<div>
		<c:if test="${not empty msg }">
			${msg}
		</c:if>
	</div>
	<footer>
		<h2>❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏❏</h2>

	<a href = "/Web/test/">rootページ</a><br>

	<a href = "/Web/test/WebTest01.jsp"> Web/test/WebTest01.jsp</a><br>
<a href = "/Web/test/WebTest02.jsp"> Web/test/WebTest02.jsp</a>

	</footer>


</body>

</html>