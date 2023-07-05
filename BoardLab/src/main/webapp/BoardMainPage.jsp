<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<style>
  .board-section {
  background-color : white;
    margin-top: 0px;
    margin-bottom: 100px;
    height: 700px;
  }
</style>

</head>
<body>
	<header>
		<jsp:include page="/jsp/include/BoardTopMenu.jsp" />
	</header>
	<section>
		<div align="center" class="board-section">
		<br>
		<h2>공지사항</h2>
		<h3> 금지</h3>
		<h3></h3>
		<h3>욕설 및 비꼬기 금지</h3>
		<h3>욕설 및 비꼬기 금지</h3>
		<br>
		<!-- 게시판 내용 -->
		</div>
	</section>
	
</body>

</html>