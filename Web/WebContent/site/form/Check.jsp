<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%/*
セッションチェック用jsp
*/%>
<%@ page import="util.ParamUtil.*"%>

<!DOCTYPE html>
<html>
<body>

<%
//loginIdを受け取る
String loginId = (String)session.getAttribute("loginId");
String roleId = (String)session.getAttribute("roleId");
//loginId = (String) request.getAttribute("loginId");
if (loginId == null) {
	//ゲスト想定
	loginId = "guest"; //ログインID
	roleId = "0"; //権限のチェック

	//<meta http-equiv="refresh" content=" 0; url=http://localhost:8080/Web/site/Login.jsp">
}

%>


</body>
</html>