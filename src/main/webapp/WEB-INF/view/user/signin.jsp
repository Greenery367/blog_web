<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/common.css">
    <title>오늘의 예제</title>
</head>
<body>
	<div class="nav-bar">
    		<a href="/user/sign-in" class="nav-bar-content">로그인</a>
    		<a href="/user/sign-up" class="nav-bar-content">회원가입</a>
    </div>
    <div class="header">
        <h1 class="header-title">Green's Blog</h1>
    </div>
    <div class="main-board">
    	<div class="user-menu">
    		<form class="user-menu-2" action="/user/sign-in" method="post">
    		<div>
    			<h1>로그인 화면</h1>
    		</div>
    		<div>
    			<label>ID: </label>
    			<input type="text" name="id" id="id" required="required"><br>
    		</div>
    		<div>
    			<label>Password: </label>
    			<input type="password" name="password" id="password" required="required"><br>
    		</div>
    			<button type="submit">제출</button>
    			<button type="submit">회원가입</button>
    		</form>
    	</div>
    </div>
    <div class="footer">
    	<p>copyright by @</p>
    </div>
</body>
</html>
