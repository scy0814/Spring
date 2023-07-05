<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/jsp/include/header.jsp" />
</head>
<section id="breadcrumbs" class="breadcrumbs">
      <div class="container">

        <ol>
          <li><a href="/index.jsp">홈</a></li>
          <li>마이페이지</li>
        </ol>
        <h2 style="font-size : 35px;">내 정보</h2>

      </div>
    </section><!-- End Breadcrumbs -->
<body>
<section class="inner-page">
      <div class="container">
<div class="body">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <form action="updateInfo.do" method="post">
                        <div class="form-group">
                            <label for="id">아이디</label>
                            <input id="id" name="id" type="text" value="${user.id}" readonly="readonly" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="password">비밀번호</label>
                            <input id="password" name="password" type="password" value="${user.password}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="name">이름</label>
                            <input id="name" name="name" type="text" value="${user.name}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="r_num">주민번호</label>
                            <input id="r_num" name="r_num" type="text" value="${user.r_num}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="email">이메일</label>
                            <input id="email" name="email" type="text" value="${user.email}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="phoneNo">전화번호</label>
                            <input id="phoneNo" name="phoneNo" type="text" value="${user.phoneNo}" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="address">주소</label>
                            <input id="address" name="address" type="text" value="${user.address}" class="form-control" />
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">수정</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    </div>
    </section>
</body>
</html>