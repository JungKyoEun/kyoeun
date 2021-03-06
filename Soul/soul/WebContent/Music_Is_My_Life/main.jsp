<!DOCTYPE html>
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Insert title here</title>
 <style type="text/css">
 html,body {
 	width:100%;
 	height:100%;
 	margin:0;
 	padding:0;
 
 }
 
 #main {
 	position: absolute;
 	width:100%;
 	height:100%;
 	margin:0;
 	padding:0;
 	text-align: center;
 	background:url(../images/music2.jpg) no-repeat center center fixed;
 	background-size :cover;
 }
 
 #main .main-letter {
 	position:relative;
 	width:auto;
 	height:120px;
 	top:50%;
 	margin-top:-120px;
 	font-family: 'Montserrat', 'Noto-Sans', sans-serif;
 	/*padding: 160px 0 20px 0;*/
 	color: white;
 	font-size: 46px;
 	font-weight: 600;
 	z-index:20;
 }
 
 .btn-default {
 	display:block;
 	margin:0 auto;
 	width:100px;
 	height:20px;
 	line-height:20px;
 	font-family: 'Montserrat', 'Noto-Sans', sans-serif;
 	border: 3px solid white;
 	color: #fff; 
 	font-size: 20px;
 	padding: 12px 18px;
 	text-decoration:none;
 	margin-top:10px;
 	z-index:10;
 }
 
 .main-overlay {
     position: absolute;
         width: 100%;
     height: 100%;
     z-index: 5;
     }
 </style>
 </head>
 <body>
 	<header id="main" >
 		<div class="main-letter">Music Is My Life 
 			<a class="btn btn-default" href="/home/index">HOME</a>
 		</div>
 	</header>
 	<div class="main-overlay" style="background-color: rgba(0,0,0,0.5);"></div>
 </body>
 </html> 