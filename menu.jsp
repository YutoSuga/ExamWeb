<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
  <p>${userName}さん、こんにちは</p>

  <p>
    <a href="select.jsp">検索</a>
  </p>
  <p>
    <a href="insert.jsp">登録</a>
  </p>
  <form action="logout.jsp" method="post">
    <button type="submit">ログアウト</button>
  </form>
</body>
</html>
