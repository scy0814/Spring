<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<style>
.body {
    background-color: white;
    margin-top: 0px;
    margin-bottom: 100px;
    height: 700px;
}

.card {
background-color : lightgray;
    max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.card-title {
    text-align: center;
    font-size: 24px;
    margin-bottom: 20px;
}

.card-content {
    margin-bottom: 10px;
}

.card-content label {
    font-weight: bold;
}

.footer {
    text-align: center;
    margin-top: 20px;
}

</style>
</head>
<body>
    <header>
        <jsp:include page="/jsp/include/MyPageTopMenu.jsp" />
    </header>
    <body>
        <div class="body">
            <div class="card">
                <h1 class="card-title">내 정보</h1>
                <c:if test="${not empty user}">
                    <div class="card-content">
                        <label>아이디:</label>
                        <p>${user.id}</p>
                    </div>
                    <div class="card-content">
                        <label>비밀번호:</label>
                        <p>${user.password}</p>
                    </div>
                    <div class="card-content">
                        <label>이름:</label>
                        <p>${user.name}</p>
                    </div>
                    <div class="card-content">
                        <label>생년월일:</label>
                        <p>${user.birthNo}</p>
                    </div>
                    <div class="card-content">
                        <label>휴대폰 번호:</label>
                        <p>${user.phoneNo}</p>
                    </div>
                </c:if>
            </div>
        </div>
    </body>
    
</body>
</html>