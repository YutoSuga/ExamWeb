<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	/* 共通ナビ */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
/* リセット */
/* ログアウトボタン */
.logout {
	width: 100px;

}

.Nav {
	width: 200px;
	background: #CCC;
	float: left;
}

* {
	padding: 0;
	margin: 0;
}

a.menu {
	text-decoration: none;
}

/* ここから */
li {
	background-color: rgba(0, 0, 0);
}

a.menu {
	display: block;
	color: #fff;
	background-color: rgba(0, 0, 0);

	border-bottom: 1px solid #fff;
	padding: 10px;
}

.check_input {
	display: none;
}

.check_label {
	display: block;
	color: #fff;
	border-bottom: 1px solid #fff;
	padding: 10px;
	background-color: rgba(0, 0, 0);

	background-image:
		url(http://kasumiblog.xsrv.jp/codepen/images/arrow_down.png);
	background-repeat: no-repeat;
	background-size: 16px;
	background-position: 98% center;
}

.check_input:checked+.check_label {
	background-image:
		url(http://kasumiblog.xsrv.jp/codepen/images/arrow_up.png);
}

.leftIcon{
	border-bottom: 1px solid #fff;
		background: #CCC;
	color: #fff;


}

/* コンテンツ非表示 */
.contents {
	display: none;
}

/* checkをクリックしたらコンテンツを表示 */
.check_input:checked+.check_label+.contents {
	display: block;
}

</style>
</head>
<body>



	<div class="Nav">

		<div class = "leftIcon">
		<a>ログインID：${loginId}</a><br>
		<a class="logout" href="/Web/host/Login.jsp">ログアウト</a><br>
		</div>
		<input id="check01" class="check_input" type="checkbox" /> <label
			class="check_label" for="check01">使用者管理</label>
		<ul class="contents">
			<li><a class="menu" href="#">Host管理(使用者管理)</a></li>
			<li><a class="menu" href="#">個別PASS設定</a></li>
		</ul>

		<input id="check02" class="check_input" type="checkbox" /> <label
			class="check_label" for="check02">基本情報</label>
		<ul class="contents">
			<li><a class="menu" href="#">コード管理</a></li>
			<li><a class="menu" href="#">商品登録</a></li>
			<li><a class="menu" href="#">スタンダード区分</a></li>
			<li><a class="menu" href="#">ネオスタンダード区分</a></li>
			<li><a class="menu" href="#">公式検索</a></li>
		</ul>

		<input id="check03" class="check_input" type="checkbox" /> <label
			class="check_label" for="check03">フロント(サイト情報)</label>
		<ul class="contents">
			<li><a class="menu" href="#">リンク管理</a></li>
			<li><a class="menu" href="#">メンテナンス</a></li>
		</ul>

		<input id="check04" class="check_input" type="checkbox" /> <label
			class="check_label" for="check04">カード</label>
		<ul class="contents">
			<li><a class="menu" href="CardRegist.jsp">カード登録</a></li>
			<li><a class="menu" href="CardSearch.jsp">カード修正・削除</a></li>
			<li><a class="menu" href="#">カード情報一括登録</a></li>
			<li><a class="menu" href="#">カードレビュー管理</a></li>
			<li><a class="menu" href="#">カード価格</a></li>
			<li><a class="menu" href="#">同名カード</a></li>

		</ul>

		<input id="check05" class="check_input" type="checkbox" /> <label
			class="check_label" for="check05">デッキ</label>
		<ul class="contents">
			<li><a class="menu" href="#">新規デッキ登録</a></li>
			<li><a class="menu" href="#">デッキ情報修正(修正可否)</a></li>
			<li><a class="menu" href="#">他サイトデッキ登録</a></li>
		</ul>

		<input id="check06" class="check_input" type="checkbox" /> <label
			class="check_label" for="check06">ユーザー</label>
		<ul class="contents">
			<li><a class="menu" href="#">ユーザー情報</a></li>
			<li><a class="menu" href="#">ゲスト情報</a></li>
			<li><a class="menu" href="#">アクセスログ</a></li>
		</ul>

		<input id="check07" class="check_input" type="checkbox" /> <label
			class="check_label" for="check07">サポート</label>
		<ul class="contents">
			<li><a class="menu" href="#">デッキ構築基本ルール</a></li>
			<li><a class="menu" href="#">制限カード</a></li>
			<li><a class="menu" href="#">特殊制限カード</a></li>
			<li><a class="menu" href="#">試合ルール(未定)</a></li>
			<li><a class="menu" href="#">試合ログ</a></li>

		</ul>


	</div>
</body>
</html>
