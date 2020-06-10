<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>HOJIN TOON</title>


<style>
body {
	margin: 0;
	padding: 0;
	font-family: 'Lato', verdana;
}

a {
	color: #05f;
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}

h1, h2, h3, h4, h5, h6 {
	margin: 0;
	padding: 0;
}

ul, lo, li {
	margin: 0;
	padding: 0;
	list-style: none;
}

/* ---------- */
div#root {
	width: 900px;
	margin: 0 auto;
}

header#header {
	
}

nav#nav {
	
}

section#container div#container_box h1#sun {
	position: absolute;
	top: 30%;
	left: 37%;
}

section#container div#container_box h1#hu {
	position: absolute;
	top: 21%;
	left: 37%;
}

section#container div#container_box div#league {
	width: 1000px;
	position: absolute;
	top: 20%;
	left: 30%;
}

section#container div#container_box div#Toontable {
	position: absolute;
	top: 60%;
	left: 28%;
}

section#container div#container_box div#ad {
	position: absolute;
	top: 20%;
	left: 85%;
}

section#content {
	float: right;
	width: 700px;
}

aside#aside {
	float: left;
	width: 180px;
	position: absolute;
	top: 20%;
	left: 20%;
}

section#container::after {
	content: "";
	display: block;
	clear: both;
}

footer#footer {
	background: #eee;
	padding: 20px;
}

/* ---------- */
header#header div#header_box {
	text-align: center;
	padding: 30px 0;
}

header#header div#header_box h1 {
	font-size: 50px;
}

header#header div#header_box h1 a {
	color: #000;
}

nav#nav div#nav_box {
	font-size: 14px;
	padding: 10px;
	text-align: right;
}

nav#nav div#nav_box li {
	display: inline-block;
	margin: 0 10px;
}

nav#nav div#nav_box li a {
	color: #333;
}

section#container {
	
}

aside#aside h3 {
	font-size: 22px;
	margin-bottom: 20px;
	text-align: center;
	position: relative;
	right: 300px;
	top: 100px;
}

aside#aside li {
	font-size: 16px;
	text-align: center;
}

aside#aside li a {
	color: #000;
	display: block;
	padding: 10px 0;
}

aside#aside li a:hover {
	text-decoration: none;
	background: #eee;
}

aside#aside li {
	position: relative;
	right: 300px;
	top: 100px;
}

aside#aside li:hover {
	background: #eee;
}

aside#aside li>ul.low {
	display: none;
	position: absolute;
	top: -100px;
	left: 480px;
}

aside#aside li:hover>ul.low {
	display: block;
}

aside#aside li:hover>ul.low li a {
	background: #eee;
	border: 1px solid #eee;
}

aside#aside li:hover>ul.low li a:hover {
	background: #fff;
}

aside#aside li>ul.low li {
	width: 180px;
}

footer#footer {
	margin-top: 100px;
	border-radius: 50px 50px 0 0;
	position: absolute;
	top: 85%;
	left: 30%;
}

footer#footer div#footer_box {
	padding: 0 20px;
}

#pixed {
	position: absolute;
	top: 30%;
	left: 65%;
    border-top-left-radius: 5px;
    border-bottom-left-radius: 5px;
	margin-right: -4px;
}

#delete {
	position: absolute;
	top: 30%;
	left: 66.7%;
    border-top-right-radius: 5px;
    border-bottom-right-radius: 5px;
	margin-left: -3px;
}

#btn button {
	border: 1px solid red;
	background-color: rgba(0, 0, 0, 0);
	color: black;
	padding: 5px;
}

#btn button:hover{
    color:white;
    background-color: skyblue;
}

#test{
	position: absolute;
	top: 50%;
	left: 45%;
}

</style>

</head>
<body>
	<div id="root">
		<header id="header">
			<div id="header_box">
				<%@ include file="include/header.jsp"%>
			</div>
		</header>

		<nav id="nav">
			<div id="nav_box">
				<%@ include file="include/nav.jsp"%>
			</div>
		</nav>

		<section id="container">
			<div id="container_box">

				<section id="content">
				
					<div id="league">
						<img src="<spring:url value='/resources/img/Toon1.png'/>">
						<hr>
					</div>

					<h1 id="hu">
						WebToon1</br>양진석
					</h1>

					<h1 id="sun">양진석의 이거 ㄹㅇ 감동 실화?</h1>

					<div id="btn">
						<button id="pixed">수정</button>
						<button id="delete">삭제</button>
					</div>

					<div id="ad">
						<img src="<spring:url value='/resources/img/ad.png'/>">
					</div>
				</section>

				<aside id="aside">
					<%@ include file="include/aside.jsp"%>
				</aside>

			</div>
		</section>

		<footer id="footer">
			<div id="footer_box">
				<%@ include file="include/footer.jsp"%>
			</div>
		</footer>

	</div>
	
	<h1 id="test">웹툰 이미지 들어갈 곳</h1>
	
</body>
</html>