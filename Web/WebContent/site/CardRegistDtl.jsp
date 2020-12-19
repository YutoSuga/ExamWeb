<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>
    登録するカード情報を入力してください
     </p>


  <form action="insert" method="post">
    <fieldset class="label-60">
      <div>
        <label class="required">カード名</label>
        <input type="text" name="loginId"
          value="">
      </div>
      <div>
        <label class="required">キャラクター名</label>
        <input type="text" name="userName">
      </div>
      <div>
        <label class="required">カード種類</label> <select name="ro">
        <option >キャラクター</option>
            <option >イベント</option>
            <option >クライマックス</option>
            </select>
      </div>
        <label class="required">色</label> <select name="roleId">
            <option >黄</option>
            <option >緑</option>
            <option >赤</option>
            <option >青</option>

        </select>

      <div>
        <label class="required">レベル</label> <select name="roleId">
            <option >0</option>
            <option >1</option>
            <option >2</option>
            <option >3</option>

        </select>
      </div>
      <div>
        <label class="required">ソウル</label> <select name="roleId">
            <option >0</option>
            <option >1</option>
            <option >2</option>
            <option >3</option>
        </select>
      </div>
      <div>
        <label class="required">パワー</label> <select name="roleId">
            <option >なし</option>
            <option >500</option>
            <option >1000</option>
            <option >2500</option>
            <option >3000</option>
            <option >3500</option>
            <option >4000</option>

        </select>
      </div>
<div>
        <label class="required">コスト</label> <select name="roleId">
            <option >0</option>
            <option >1</option>
            <option >2</option>
            <option >3</option>
            <option >4</option>
            <option >5</option>
            <option >6</option>

        </select>
      </div>

      <div>
        <label class="required">トリガー</label> <select name="roleId">
            <option >トリガーなし</option>
            <option >トリガー1</option>
            <option >トリガー2</option>

        </select>
      </div>
      <div>
        <label class="required">特徴1</label>
        <input type="text" name="pass">
      </div>
      <div>
        <label class="required">特徴2</label>
        <input type="text" name="pass">
      </div>
      <div>
        <label class="required">特徴3</label>
        <input type="text" name="pass">
      </div>
      <div>
        <label class="required">オプション</label> <select name="roleId">
            <option >オプションなし</option>
            <option >カウンター</option>
            <option >アラーム</option>

        </select>
      </div>
            <div>
        <label class="required">テキスト</label>
        <input type="text" name="userName">
      </div>

    </fieldset>
    <button type="submit">確認</button>
  </form>
</body>
</html>