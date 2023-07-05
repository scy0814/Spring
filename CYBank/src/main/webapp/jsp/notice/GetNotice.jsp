<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
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
      <li>글 상세</li>
    </ol>
    <h2 style="font-size: 35px;">세부 글</h2>
  </div>
</section><!-- End Breadcrumbs -->
  <section class="inner-page">
    <div class="container">
      <input name="n_no" type="hidden" value="${notice.n_no}" />
      <table class="table table-bordered">
        <tr>
          <td>번호</td>
          <td><input name="n_no" type="text" value="${notice.n_no}" class="form-control" readonly/></td>
        </tr>
        <tr>
          <td>제목</td>
          <td><textarea name="n_title" cols="40" rows="10" class="form-control" disabled>${notice.n_title}</textarea></td>
        </tr>
        <tr>
          <td>글 내용</td>
          <td><textarea name="n_content" cols="40" rows="10" class="form-control" disabled>${notice.n_content}</textarea></td>
        </tr>
        <tr>
          <td>작성일자</td>
          <td>${notice.n_date}</td>
        </tr>
      </table>
      <br/>
      	<table class="table table-striped table-bordered">
            <thead class="thead-light">
                <tr>
                    <th>번호</th>
                    <th>작성자</th>
                    <th>댓글내용</th>
                    <th>작성한 날짜</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="comment" items="${commentList}">
                    <tr>
                    
                        <td>${comment.nc_no}</td>
                        <td>${comment.nc_id}</td>
                        <td>${comment.nc_comment}</td>
                        <td>${comment.nc_date}
                         
      <c:if test="${comment.nc_id == user.id}">
        <div class="d-flex justify-content-end">
            <a href="${pageContext.request.contextPath}/deleteComment.do?nc_id=${comment.nc_id}&nc_no=${comment.nc_no}" type="hidden" name="${comment.nc_id}" value="${comment.nc_no}" >삭제</a>
          </div>
      </c:if>
    </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
       <form action="${pageContext.request.contextPath }/noticeComment.do" method="post">
       	<input type="hidden" name="n_no" value="${ param.n_no }" />
        <div class="form-group">
          <input type="text" class="form-control" id="exampleFormControlInput1" value="${user.id }" name="id"  readonly >
        </div>
        <div class="form-group">
          <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="댓글작성" name="comment"></textarea>
        </div>
        <div class="d-grid gap-2">
          <button class="btn btn-primary" type="submit" style="background-color: #283a5ae6;">댓글달기</button>
        </div>
      </form>
    </div>
  </section>
</body>
</html>