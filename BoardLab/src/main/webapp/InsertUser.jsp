<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" integrity="sha384-gjsDBsIlQe8cEGw6rOup+GHHYz0jbggzIqu8E3Syg0Aw9zPKM6wFQPh6uWVpCEMV" crossorigin="anonymous">
<style>
.footer {
  top: 500px;
}
</style>
</head>
<body>
<header>
  <jsp:include page="/jsp/include/topMenu.jsp" />
</header>
<div class="container">
  <h1 class="text-center">회원가입 화면</h1>
  <form action="insertUser.do" method="post">
    <div class="row justify-content-center">
      <div class="col-lg-6">
        <table class="table">
          <tr>
            <td>아이디</td>
            <td><input type="text" class="form-control" name="id" /></td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td><input type="password" class="form-control" name="password" /></td>
          </tr>
          <tr>
            <td>이름</td>
            <td><input type="text" class="form-control" name="name" /></td>
          </tr>
          <tr>
            <td>생년월일</td>
            <td><input type="text" class="form-control" name="birthNo" placeholder="ex)19970814" /></td>
          </tr>
          <tr>
            <td>휴대폰번호</td>
            <td><input type="text" class="form-control" name="phoneNo" placeholder="-는 빼고 써주세요" /></td>
          </tr>
          <tr>
            <td colspan="2">
              <input type="submit" class="btn btn-primary" value="회원가입" />
            </td>
          </tr>
        </table>
      </div>
    </div>
  </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-8Xir0ddZ3m2NCCIMIBkISLRA6vqUdrzPAyotuwEQuACen1nLtb7g5GmC9IIkFCVI"
  crossorigin="anonymous"></script>
</body>
</html>