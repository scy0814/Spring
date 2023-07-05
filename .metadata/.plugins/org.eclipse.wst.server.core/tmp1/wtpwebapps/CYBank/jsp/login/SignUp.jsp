<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>회원가입</title>
    <!-- Bootstrap -->
    <link href="../plugin/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- font awesome -->
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <!-- Custom style -->
    <link rel="stylesheet" href="../plugin/bootstrap/css/style.css" media="screen" title="no title" charset="utf-8">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../plugin/bootstrap/js/bootstrap.min.js"></script>
</head>
<header>
    <jsp:include page="/jsp/include/header.jsp" />
</header>
<body>
<section id="breadcrumbs" class="breadcrumbs">
    <div class="container">
        <ol>
            <li><a href="/index.jsp">홈</a></li>
            <li>회원가입</li>
        </ol>
        <h2 style="font-size: 35px;">회원가입 창</h2>
    </div>
</section><!-- End Breadcrumbs -->
<section class="inner-page">
    <div class="container">
        <article class="container">
            <div class="page-header">
            </div>
            <div class="col-sm-6 col-md-offset-3">
                <form role="form" action="${pageContext.request.contextPath }/SignUpProcess.do" method="post" >
                    <div class="form-group">
                        <label for="inputName">성명</label>
                        <input type="text" class="form-control" id="inputName" name="name" placeholder="이름을 입력해 주세요">
                    </div>
                    <div class="form-group">
                        <label for="inputName">생년월일</label>
                        <input type="text" class="form-control" id="inputBirthNo" name="birthNo" placeholder="생년월일을 입력해 주세요">
                    </div>
                    <div class="form-group">
                        <label for="inputId">아이디</label>
                        <input type="text" class="form-control" id="inputId" name="id" placeholder="아이디를 입력해 주세요">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">비밀번호</label>
                        <input type="password" class="form-control" id="inputPassword" name="password" placeholder="비밀번호를 입력해주세요">
                    </div>
                    <div class="form-group">
                        <label for="inputPasswordCheck">비밀번호 확인</label>
                        <input type="password" class="form-control" id="inputPasswordCheck" name="password2" placeholder="비밀번호 확인을 위해 다시 한번 입력해 주세요">
                    </div>
                    <div class="form-group">
                        <label for="InputEmail">이메일 주소</label>
                        <input type="email" class="form-control" id="InputEmail" name="email" placeholder="이메일 주소를 입력해주세요">
                    </div>
                    <div class="form-group">
                        <label for="inputMobile">휴대폰 번호</label>
                        <input type="tel" class="form-control" id="inputMobile" name="phoneNo" placeholder="휴대폰 번호를 입력해 주세요">
                    </div>
                    <div class="form-group">
                        <label for="inputtelNO">주소</label>
                        <input type="tel" class="form-control" id="inputtelNO" name="address" placeholder="주소를 입력해 주세요">
                    </div><br>

                    <div class="form-group text-center">
                        <button type="submit" id="join-submit" class="btn btn-primary">
                            회원가입<i class="fa fa-check spaceLeft"></i>
                        </button>
                    </div>
                </form>
            </div>
        </article>
    </div>
</section>
</body>
</html>