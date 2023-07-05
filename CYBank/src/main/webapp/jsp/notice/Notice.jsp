<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

 <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="/CYBank/css/vendor/aos/aos.css" rel="stylesheet">
  <link href="/CYBank/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="/CYBank/css/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="/CYBank/css/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="/CYBank/css/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="/CYBank/css/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="/CYBank/css/css/style.css" rel="stylesheet">
<title>Insert title here</title>

</head>

<body>
<header>
<jsp:include page="/jsp/include/header.jsp" />
</header>
<section id="breadcrumbs" class="breadcrumbs">
      <div class="container">

        <ol>
          <li><a href="/index.jsp">홈</a></li>
          <li>공지사항</li>
        </ol>
        <h2 style="font-size : 35px;">새 소식</h2>

      </div>
    </section><!-- End Breadcrumbs -->

    <section class="inner-page">
      <div class="container">
 <div class="container">
        <table class="table table-striped table-bordered">
            <thead class="thead-light">
            
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>게시날짜</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="notice" items="${noticeList}">
                    <tr>
                        <td>${notice.n_no}</td>
                        <td><a href="${pageContext.request.contextPath}/getNotice.do?n_no=${notice.n_no}">${notice.n_title}</a></td>
                        <td>${notice.n_date}
                          <c:if test="${user.id eq 'admin'}">
        <div class="d-flex justify-content-end">
            <a href="${pageContext.request.contextPath}/deleteNotice.do?n_no=${notice.n_no}" type="hidden" name="${notice.n_no}" value="${notice.n_no}" >삭제</a>
          </div>
      </c:if>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <br/>
         <c:if test="${user.id eq 'admin'}">
        <form action="${pageContext.request.contextPath }/insertNotice.do" method="post">
        <div class="d-grid gap-2">
          <button class="btn btn-primary" type="submit" style="background-color: #283a5ae6;">공지사항 등록</button>
       			 </div>
       			 </form>
       			 </c:if>
    </div>
      </div>
    </section>
     <!-- Vendor JS Files -->
  <script src="/CYBank/css/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="/CYBank/css/vendor/aos/aos.js"></script>
  <script src="/CYBank/css/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="/CYBank/css/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="/CYBank/css/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="/CYBank/css/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="/CYBank/css/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="/CYBank/css/js/main.js"></script>
</body>
</html>