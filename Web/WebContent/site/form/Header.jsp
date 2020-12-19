<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	/* 共通ヘッダー */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/host.css">
<style>
/* リセット */
.header {
	margin: auto auto;
	padding: 10px auto;
	display: block;
	color: #fff;
	background-color: rgba(0, 0, 0, .8);
}

.left {
	margin: 10px;
	float: left;
}

.right {
	margin: 10px;
	float: right;
}
.user{
	margin: auto;
	float: right;

}

.center {
	margin: 0px auto;
	clear: left;
	clear: right;
}
</style>
</head>
<body>

	<div class="header">

		<div class="left">

			<b><a href="Home.jsp">WS EDC</a></b>
		</div>

		<div class="left">
			<form>
				<input class="cardName" value="カードを検索"></input>
				<submit>検索</submit>

			</form>
		</div>

		<div class="right">
			<a class="headerRight" href="#">アイコン <img
				src="../images/logo.gif"></a>
		</div>

		<div class="user">
			<a class="" href="#">ユーザー名</a><br> <a>ユーザーステータス</a>
		</div>


		<div class="right">
			<button class="headerRight">
				<a href="https://www.youtube.com/channel/UCXa5HnPub0vJGfiiNzGDWpA"
					target="_blank">WSチャンネル</a>
			</button>
		</div>
		<div class="right">
			<a href="mailto:MELON6SODA4@gmail.com">お問い合わせはこちらから</a>
		</div>

		<div class="center"></div>

	</div>
</body>
</html>
