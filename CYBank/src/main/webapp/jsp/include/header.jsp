<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <style>
  .fixed-top {
    position: fixed;
    z-index: 1030;
    background: #283a5ae6;
    top: 0;
    right: 0;
    left: 0;
}
  </style>

<title>Insert title here</title>
</head>
<body>
<!-- ======= Header ======= -->
  <header id="header" class="header fixed-top">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-between">

      <a href="index.jsp" class="logo d-flex align-items-center">
        <span class="cybank">CY Bank</span>
      </a>
		<c:set var="isLogin" value="${empty user }" />
      <nav id="navbar" class="navbar">
        <ul>
        <c:if test="${not empty user && user.id ne 'admin'}">
          <li><a class="nav-link scrollto active" href="index.jsp">홈</a></li>
          <li><a class="nav-link scrollto" href="${pageContext.request.contextPath }/noticeList.do">공지사항</a></li>
          <li><a class="nav-link scrollto" href="#about">오픈뱅킹</a></li>
           <li class="dropdown"><a href="${pageContext.request.contextPath }/account.do"><span>계좌</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="${pageContext.request.contextPath}/account.do">나의 계좌</a></li>
              <li><a href="${pageContext.request.contextPath}/createAccount.do">계좌 개설</a></li>
              <li><a href="${pageContext.request.contextPath}/transactionHistory.do">입출금 내역</a></li>
              <li><a href="${pageContext.request.contextPath}/closeAccount.do">계좌 해지</a></li>
            </ul>
          </li>
          <li><a class="nav-link scrollto" href="${pageContext.request.contextPath }/myPage.do">마이페이지</a></li>
          <li><a class="nav-link scrollto" href="${pageContext.request.contextPath }/customerCenter.do">고객센터</a></li>
          <li><a class="nav-link scrollto" href="${pageContext.request.contextPath }/logout.do">로그아웃</a></li>
          <span style="color : white; position : relative; left : 150px;">[(${user.id})님 환영합니다]</span>
          </c:if>
          
		<c:if test="${user.id eq 'admin'}">
		<li class="dropdown"><a href="${pageContext.request.contextPath }/account.do"><span>상품관리</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="${pageContext.request.contextPath}/account.do">상품등록</a></li>
              <li><a href="${pageContext.request.contextPath}/createAccount.do">상품수정</a></li>
              <li><a href="${pageContext.request.contextPath}/transactionHistory.do">상품삭제</a></li>
            </ul>
          </li>
          <li class="dropdown"><a href="${pageContext.request.contextPath }/account.do"><span>회원관리</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="${pageContext.request.contextPath}/account.do">회원리스트</a></li>
              <li><a href="${pageContext.request.contextPath}/transactionHistory.do">휴면계좌관리</a></li>
            </ul>
          <li><a class="nav-link scrollto" href="${pageContext.request.contextPath }/noticeList.do">공지사항</a></li>
          <li><a class="nav-link scrollto" href="${pageContext.request.contextPath }/customerCenter.do">고객센터</a></li>
          <li><a class="nav-link scrollto" href="${pageContext.request.contextPath }/logout.do">로그아웃</a></li>
          <span style="color : white; position : relative; left : 150px;">[(${user.id})님 환영합니다]</span>
		</c:if>
		<c:if test="${empty user}">
          <li><a class="getstarted scrollto" href="${pageContext.request.contextPath }/login.do">로그인</a></li>
          <li><a class="getstarted scrollto" href="${pageContext.request.contextPath }/signUp.do">회원가입</a></li>
          </c:if>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->
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