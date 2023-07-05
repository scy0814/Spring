<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
.form-container {
	background-color: white;
	margin-top: -56px;
	height: 700px;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
	width: 80%;
	margin: 0 auto;
}

.container {
	background-color: white;
	margin-top: 0px;
	padding-bottom: 20px;
}

.footer {
	margin-top: 20px;
	padding: 10px 0;
	background-color: #f5f5f5;
	text-align: center;
}

.footer p {
	margin-bottom: 0;
}
</style>
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/BoardTopMenu.jsp" />
	</header>
	<main class="container">
		<div>
			<div class="row justify-content-center">
				<div class="col-lg-8">
					<h1 class="text-center mb-4">새 글 등록</h1>
					<div class="form-container">
						<form action="updateBoard.do" method="post">
							<div class="form-group">
								<label for="title">제목</label>
								<input type="text" class="form-control" id="title" name="title" />
							</div>
							<div class="form-group">
								<label for="writer">작성자</label>
								<input type="text" class="form-control" id="writer" name="writer" />
							</div>
							<div class="form-group">
								<label for="content">글 내용</label>
								<textarea class="form-control" id="content" name="content" rows="10"></textarea>
							</div>
							<button type="submit" class="btn btn-primary">등록</button>
						</form>
					</div>
				</div>
			</div>
		</div>

	</main>
</body>