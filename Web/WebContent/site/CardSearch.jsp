<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
/*Home.jsp */
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
<%@ include file="Nav.jsp"%>

<%@ include file="Header.jsp"%>


<%
/*メインの枠組み */
%>

<%@ include file="CardSearchDtl.jsp"%>


<%@ include file="Footer.jsp"%>
</body>
</html>
