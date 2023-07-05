<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
      <li>공지사항</li>
      <li>공지사항 등록</li>
    </ol>
    <h2 style="font-size: 35px;">공지사항 등록</h2>
  </div>
</section><!-- End Breadcrumbs -->
  <section class="inner-page">
    <div class="container">
    <form action="${pageContext.request.contextPath }/insertNoticeProcess.do" method="post">
    <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">공지사항 제목</label>
  <input type="text" name="title" class="form-control" id="exampleFormControlInput1" placeholder="제목">
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">공지사항 내용</label>
  <textarea class="form-control" id="exampleFormControlTextarea1" name="content" rows="8" placeholder="공지할 내용을 입력해주세요."></textarea>
</div>
        <div class="d-grid gap-2">
          <button class="btn btn-primary" type="submit" style="background-color: #283a5ae6;">공지사항 등록</button>
       			 </div>
       			 </form>
    </div>
    </section>
</body>
</html>