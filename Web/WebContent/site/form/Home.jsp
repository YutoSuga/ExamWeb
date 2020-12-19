<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
/*
Webの基本となるページ
Home.jsp
*/
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WSWebHost</title>
<link rel="stylesheet" href="css/host.css">
</head>
<body>


<%@ include file="Check.jsp"%>
<%
/*左側ナビゲーション */
%>
<%@ include file="Header.jsp"%>
<%@ include file="Nav.jsp"%>




<%
/*メインの枠組み */
%>



<%@ include file="Footer.jsp"%>
</body>
</html>
