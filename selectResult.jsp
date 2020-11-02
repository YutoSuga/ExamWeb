<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
  <table>
    <caption>検索結果</caption>
    <thead>
      <tr>
        <th>ID</th>
        <th>名前</th>
        <th>TEL</th>
        <th>権限</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach var="user" items="${list}">
      <tr>
        <td>${fn:escapeXml(user.loginId)}</td>
        <td>${fn:escapeXml(user.userName)}</td>
        <td>${fn:escapeXml(user.telephone)}</td>
        <td>${fn:escapeXml(user.roleName)}</td>

      </tr>
    </c:forEach>
    </tbody>
  </table>
  <div>
    <a href="menu.jsp">メニューに戻る</a>
  </div>
</body>
</html>
