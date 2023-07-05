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
      <li>글 상세</li>
    </ol>
    <h2 style="font-size: 35px;">세부 글</h2>
  </div>
</section><!-- End Breadcrumbs -->
  <section class="inner-page">
    <div class="container">
    
    <table class="table table-bordered">
        <tr>
          <td>번호</td>
          <td><input name="cc_no" type="text" value="${inquire.cc_no}" class="form-control" readonly/></td>
        </tr>
        <tr>
          <td>제목</td>
          <td><textarea name="cc_title" cols="40" rows="10" class="form-control" disabled>${inquire.cc_title}</textarea></td>
        </tr>
        <tr>
          <td>글 내용</td>
          <td><textarea name="cc_content" cols="40" rows="10" class="form-control" disabled>${inquire.cc_content}</textarea></td>
        </tr>
        <tr>
          <td>작성일자</td>
          <td>${inquire.cc_date}</td>
        </tr>
      </table>
      <br><br><br>
	<table class="table table-bordered">
            
            <tbody>
                <c:forEach var="reply" items="${replyList}">
                    <tr>
                    <td>답변내용</td>
                    <td><textarea name="cr_content" cols="40" rows="10" type="text" placeholder="${reply.cr_content}" class="form-control" readonly/></textarea></td>
        			</tr>
                    <tr>
                    <td>답변날짜</td>
                    <td><textarea name="cr_date" cols="40" rows="1" type="text" placeholder="${reply.cr_date}" class="form-control" readonly/></textarea></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
		


      
    <c:if test="${user.id eq 'admin'}">
    <form action="${pageContext.request.contextPath }/reply.do" method="post">
    <input type="hidden" name="cc_check" value="${inquire.cc_check}" />
    <input type="hidden" name="cc_no" value="${inquire.cc_no}" />
    <input type="hidden" name="id" value="${user.id}" />
    <input type="hidden" name="cc_title" value="${inquire.cc_title}" />
    <input type="hidden" name="cc_content" value="${inquire.cc_content}" />
    <input type="hidden" name="cc_date" value="${inquire.cc_date}" />
       	<input type="hidden" name="n_no" value="${ param.n_no }" />
        <div class="form-group">
          <input type="text" class="form-control" id="exampleFormControlInput1" value="${user.name }" name="id"  readonly ><br>
        </div>
        <div class="form-group">
          <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="답변작성" name="content"></textarea>
        </div><br>
        <div class="d-grid gap-2">
        
          <button class="btn btn-primary" type="submit" style="background-color: #283a5ae6;">답변달기</button>
        </div>
      </form>
      </c:if>
    
    
    </div>
    </section>
</body>
</html>