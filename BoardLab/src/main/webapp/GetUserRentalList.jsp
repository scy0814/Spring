<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>
<style>
.body {
	margin-top: 0px;
	margin-bottom: 100px;
}

.table {
	margin-top: 20px;
}

.table th,
.table td {
	vertical-align: middle;
}

.footer {
	margin-top: 20px;
	background-color: #f5f5f5;
	text-align: center;
}

.footer p {
	margin-bottom: 0;
}
.containerbody{
background-color : white;
margin-top : 0px;
height : 700px;
}
</style>
</head>
<header>
	<jsp:include page="/jsp/include/topMenu.jsp" />
</header>
<body>
	<div class="containerbody">
		<h1 class="text-center">회원 대여 목록</h1>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>isbn</th>
					<th>제목</th>
					<th>저자</th>
					<th>출판사</th>
					<th>대여한 회원</th>
					<th>대여한 날짜</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="rental" items="${rentalList }">
					<tr>
						<td>${rental.isbn }</td>
						<td>${rental.title}</td>
						<td>${rental.writer }</td>
						<td>${rental.publisher}</td>
						<td>${rental.rental_id}</td>
						<td>${rental.rental_date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>