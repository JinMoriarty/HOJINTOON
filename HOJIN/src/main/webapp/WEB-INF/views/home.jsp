<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>HOJIN</title>
<style>
	
body { 
margin:0; 
padding:0; 
font-family:'맑은 고딕', verdana; 
}

a { 
color:#05f; 
text-decoration:none; 
}

a:hover { 
text-decoration:underline; 
}
		
h1, h2, h3, h4, h5, h6 { 
margin:0; 
padding:0; 
}

ul, lo, li { 
margin:0; 
padding:0; 
list-style:none; 
}
	
		/* ---------- */
		
div#root { 
width:900px; 
height:1200px;
margin:0 auto; 
}

header#header {}

nav#nav {}

section#container { 
position:relative; 
top: 0px; 
left: -300px;
}

section#content li { 
width:230px; 
margin: 0px;
}

section#content { 
float:right; 
width:700px; 
}

section#content img { 
background-size: 300px 150px;
}
	
aside#aside { 
text-align:center; 
}

section#container::after {
 content:""; 
 display:block; 
 clear:both; 
 }	

footer#footer { 
background:#eee; 
padding:20px; 
}
		
		/* ---------- */
		
header#header div#header_box { 
position:relative; 
top: 0px; 
left: -300px;
text-align:center; 
padding:30px 0; 
}

header#header div#header_box h1 { 
font-size:50px; 
}

header#header div#header_box h1 a { 
color:#000; 
}
		
nav#nav div#nav_box { 
font-size:14px; 
padding:10px; 
text-align:right; 
}

nav#nav div#nav_box li { 
display:inline-block; 
margin:0 10px; 
}

nav#nav div#nav_box li a { 
color:#333; 
}
		
section#container { }

div#aside_box{ 
position:relative; 
top: 0px; 
left: -300px;
width:1200px; 
font-size:14px;
padding:10px;
text-align:left; 
}
		
aside#aside h3 { 
font-size:22px; 
margin-bottom:20px; 
text-align:center; 
}

aside#aside li { 
font-size:16px; 
text-align:center; 
display:inline-block; 
float: left;
}

aside#aside li a { 
color:#000; 
display:block; 
padding:5px 10px; 
width:180px
}

aside#aside li a:hover { 
text-decoration:none; 
background:#eee; 
}

		
aside#aside li {  }

aside#aside li:hover { 
background:#eee; 
} 		

aside#aside li > ul.low { 
display:none; 
position:absolute; 
top: 42.5px; 
left: -100px;
}

aside#aside li:hover > ul.low { 
display:inline-block;
}

aside#aside li:hover > ul.low li a { 
background:#eee; 
border:1px solid #eee;
 width:180; 
 }

aside#aside li:hover > ul.low li a:hover { 
background:#fff;
}

aside#aside li > ul.low li { 
width:180px; 
}
		
footer#footer { 
position: fixed;
bottom: 0;
width: 40%;
margin-top:100px; 
border-radius:50px 50px 0 0; 
}

footer#footer div#footer_box { 
padding:0 20px; 
}

ul.mylist li:before,
ol.mylist li:before {
    content: "-";
    display: inline-block;
    vertical-align: middle;
    padding: 0px 5px 6px 0px;
}

ul.mylist {
width: 200px;
}

ul.mylist2 li:before,
ol.mylist2 li:before {
    content: "-";
    display: inline-block;
    vertical-align: middle;
    padding: 0px 5px 6px 0px;
}

ul.mylist2 {
position:relative; 
top: -110px; 
left: 500px;
}

h1.myh1 {
position:relative; 
top: -125px; 
left: 500px;
}
		
	</style>
</head>
<body>
<div id="root">
	<header id="header">
		<div id="header_box">
			<%@ include file="include/header.jsp" %>
		</div>
	</header>

	<nav id="nav">
		<div id="nav_box">
			<%@ include file="include/nav.jsp" %>
		</div>
	</nav>
	<div id="aside_box">
				<aside id="aside">
					<%@ include file="include/aside.jsp" %>
				</aside>
			</div>
	<section id="container">
		<div id="container_box">
			
			<section id="content">
			<br>
			<br>
			<br>
			
				<table>
				<thead>
					<tr>
						<th></th>
						<th>신의탑</th>
						<th>신도림</th>
						<th>판타지 여동생</th>
					</tr>
				</thead>
				<tbody>
						<tr>
							<td><img src="<spring:url value='/resources/img/today2.png'/>"></td>
							<td><img src="<spring:url value='/resources/img/GOT2.png'/>"></td>
							<td><img src="<spring:url value='/resources/img/SDR2.png'/>"></td>
							<td><img src="<spring:url value='/resources/img/FOS.png'/>"></td>
						</tr>
				</tbody>
				</table>
				
				<br>
				<br>
				<br>
				
				<table>
				<thead>
					<tr>
						<th></th>
						<th>쿠베라</th>
						<th>난약</th>
						<th>갓오브하이스쿨</th>
					</tr>
				</thead>
				<tbody>
						<tr>
							<td><img src="<spring:url value='/resources/img/ReCom.png'/>"></td>
							<td><img src="<spring:url value='/resources/img/Kubera.png'/>"></td>
							<td><img src="<spring:url value='/resources/img/ImMedic.png'/>"></td>
							<td><img src="<spring:url value='/resources/img/GOH.png'/>"></td>
						</tr>
				</tbody>
				</table>
				
				<br>
				<br>
				<br>
				
				<h1>많이 본 웹툰 Top3</h1>
				
				<br>
				
				<ul class="mylist">
					<li>열렙전사</li>
					<li>호랑이 형님</li>
					<li>전지적 작가 시점</li>
				</ul>
				
				<h1 class="myh1">인기 웹툰 Top3</h1>
				
				<ul class="mylist2">
					<li>스위트홈</li>
					<li>싸움 독학</li>
					<li>약한 영웅</li>
				</ul>
				
			</section>
			
		</div>
	</section>

	<footer id="footer">
		<div id="footer_box">
			<%@ include file="include/footer.jsp" %>
		</div>		
	</footer>

</div>
</body>
</html>