<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
  .myAccount {
    position: absolute;
    left: 10px;
  }

  .myHr {
    width: 5cm;
    margin-left: 0;
  }

  .button {
    width: 5cm;
    height: 60px;
    display: inline-block;
    padding: 10px 20px;
    border: none;
    background-color: lightgray;
    color: black;
    text-align: center;
    text-decoration: none;
    font-size: 16px;
    cursor: pointer;
    border-radius: 0;
  }

  .inout {
    position: relative;
    left: 200px;
    top: -200px;
    font-size: 20px;
  }

  .accountListTable {
    position: relative;
    left: -100px;
    top: 00px;
    width : 1500px;
  }
</style>
</head>
<header>
<jsp:include page="/jsp/include/header.jsp" />
</header>
<body>
<section id="breadcrumbs" class="breadcrumbs">
      <div class="container">

        <ol>
          <li><a href="/index.jsp">홈</a></li>
          <li>계좌</li>
          <li>나의 계좌</li>
        </ol>
        <h2 style="font-size : 35px;">나의 계좌</h2>

      </div>
    </section><!-- End Breadcrumbs -->

    <section class="inner-page">
      <div class="container">
	

      <div class="container">

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-lg-8">
      
        <table class="table table-striped table-bordered accountListTable">
          <thead class="thead-dark">
            <tr>
              <th>계좌번호</th>
              <th>계좌 종류</th>
              <th>계좌 이름</th>
              <th>잔액</th>
              
            </tr>
          </thead>
          <tbody>
            <c:forEach var="account" items="${accountList}">
              <tr>
  <td>${account.accountNum}</td>
  <td>${account.type}</td>
  <td>${account.accountName}</td>
  <td>
    <div class="d-flex justify-content-between">
      <span>${account.balance}원</span>
      <form action="${pageContext.request.contextPath}/accountTransfer.do" method="post">
        <input type="hidden" name="accountNum" value="${account.accountNum}">
        <button type="submit" class="btn btn-danger">이체</button>
      </form>
    </div>
  </td> 
</tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
<script src="/CYBank/css/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="/CYBank/css/vendor/aos/aos.js"></script>
  <script src="/CYBank/css/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="/CYBank/css/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="/CYBank/css/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="/CYBank/css/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="/CYBank/css/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="/CYBank/css/js/main.js"></script>
  </div>
  </div>
  </section>
</body>
</html>