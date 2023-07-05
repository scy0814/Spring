<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>회원 정보 수정</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <style>
        .body {
            background-color: white;
            margin-top: 0px;
            margin-bottom: 100px;
            height: 700px;
        }
    </style>
</head>
<body>
    <header>
        <jsp:include page="/jsp/include/MyPageTopMenu.jsp" />
    </header>
    <div class="body">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <h1 class="text-center">회원 정보 수정</h1>
                    <form action="updateInfo.do" method="post">
                        <div class="form-group">
                            <label for="id">아이디</label>
                            <input id="id" name="id" type="text" value="${loginUser.id}" readonly="readonly" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="password">비밀번호</label>
                            <input id="password" name="password" type="password" value="${loginUser.password}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="name">이름</label>
                            <input id="name" name="name" type="text" value="${loginUser.name}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="birthNo">생년월일</label>
                            <input id="birthNo" name="birthNo" type="text" value="${loginUser.birthNo}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="phoneNo">휴대폰 번호</label>
                            <input id="phoneNo" name="phoneNo" type="text" value="${loginUser.phoneNo}" class="form-control" />
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">수정</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
</body>
</html>