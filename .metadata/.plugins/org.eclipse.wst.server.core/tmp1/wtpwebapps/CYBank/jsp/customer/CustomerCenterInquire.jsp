<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<header>
	<jsp:include page="/jsp/include/header.jsp" />
</header>
<body>
	<section id="breadcrumbs" class="breadcrumbs">
		<div class="container">

			<ol>
				<li><a href="/index.jsp">홈</a></li>
				<li>고객센터</li>
			</ol>
			<h2 style="font-size: 35px;">문의</h2>
		</div>
	</section>
	<!-- End Breadcrumbs -->

	<div class="body">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6">
					<form action="${pageContext.request.contextPath }/cc_InquireProcess.do" method="post" >
						<div class="form-group">
							<label for="id">아이디</label>
							<input id="id" name="id" type="text" readonly value="${user.id}" readonly="readonly" class="form-control" />
						</div>
						<div class="form-group">
							<label for="name">이름</label>
							<input id="name" name="name" readonly type="text" value="${user.name}" class="form-control" />
						</div>
						<div class="form-group">
							<label for="email">이메일</label>
							<input id="email" name="email" readonly type="text" value="${user.email}" class="form-control" />
						</div>
						질문 카테고리
						<select name="cc_type" class="form-select" aria-label="Default select example">
							<option selected>선택하세요</option>
							<option value="1">계좌</option>
							<option value="2">계정</option>
							<option value="3">상품</option>
						</select>
						<div class="form-group">
							<label for="title">제목</label>
							<input id="title" name="title" type="text" class="form-control" />
						</div>
						<div class="form-group">
							내용
							<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="내용작성" name="content"></textarea>
						</div>
						<div class="text-center">
							<button type="submit" class="btn btn-primary">문의하기</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<section class="inner-page">
		<div class="container"></div>
	</section>
</body>
</html>