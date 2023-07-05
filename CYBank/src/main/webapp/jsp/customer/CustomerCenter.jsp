<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        <h2 style="font-size : 35px;">문의</h2>

      </div>
    </section><!-- End Breadcrumbs -->

<section class="inner-page">
      <div class="container">
	<div class="container">
        <table class="table table-striped table-bordered">
            <thead class="thead-light">
                <tr>
                    <th>번호</th>
                    <th>아이디</th>
                    <th>카테고리</th>
                    <th>제목</th>
                    <th>게시날짜</th>
                    <th>상태</th>
                </tr>
            </thead>
            <c:if test="${user.id eq 'admin'}">
             <tbody>
                <c:forEach var="inquire" items="${AdinquireList}">
                    <tr>
                        <td>${inquire.cc_no}</td>
                        <td>${inquire.id}</td>
                        <td>${inquire.cc_type}</td>
                        <td><a href="${pageContext.request.contextPath}/getInquire.do?cc_no=${inquire.cc_no}&&cc_check=${inquire.cc_check}">${inquire.cc_title}</a></td>
                        <td>${inquire.cc_date}</td>
                        <td>
                        <c:choose>
                <c:when test="${inquire.cc_check == '0'}">미답변</c:when>
                <c:otherwise>답변완료</c:otherwise>
            </c:choose></td>
                    </tr>
                </c:forEach>
            </tbody>
            </c:if>
            
            
            <tbody>
                <c:forEach var="inquire" items="${inquireList}">
                    <tr>
                        <td>${inquire.cc_no}</td>
                        <td>${inquire.id}</td>
                        <td>${inquire.cc_type}</td>
                        <td><a href="${pageContext.request.contextPath}/getInquire.do?cc_no=${inquire.cc_no}&&cc_check=${inquire.cc_check}">${inquire.cc_title}</a></td>
                        <td>${inquire.cc_date}</td>
                        <td>
                        <c:choose>
                <c:when test="${inquire.cc_check == '0' }">미답변</c:when>
                <c:otherwise>답변완료</c:otherwise>
            </c:choose></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <c:if test="${not empty user && user.id ne 'admin'}">
         <form action="${pageContext.request.contextPath}/customerCenterInquire.do" method="POST">
         <div class="d-grid gap-2">
  <button class="btn btn-primary" type="submit" style="background-color : navy">문의하기</button>
  </div>
  </form>
  </c:if>
        <br/>
    </div>
      </div>
      </section>

			
			
		
</body>
</html>