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
          <li>계좌</li>
          <li>계좌 이체</li>
        </ol>
        <h2 style="font-size : 35px;">계좌 이체</h2>

      </div>
    </section><!-- End Breadcrumbs -->

    <section class="inner-page">
      <div class="container">
      
      <form action="${pageContext.request.contextPath}/accountTransferProcess.do" method="post">
       <input type="hidden" name="accountNum" value="${account.accountNum}" />
       <input type="hidden" name="balance" value="${account.balance}" />
       <input type="hidden" name="name" value="${account.name}" />
		<div class="container">
				<div class="col-lg-8">
							<div class="form-group">
								<label for="id">출금정보</label><br>
							 <input type="text" class="form-control" id="exampleFormControlInput1" value="${account.accountNum }(${account.accountName })출금가능금액 : ${account.balance }원" name="id"  readonly >
        </div>
							<div class="form-group">
								<label for="accountPW">계좌 비밀번호</label> <input type="password"
									name="accountPW" id="accountPW" placeholder="4자리" maxlength="4"
									required class="form-control">
							</div>
							<div class="form-group">
								<label for="accountType">입금정보</label> <input type="text" name="accountNum2" placeholder="계좌번호 입력(- 제외)"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="accountPW2">송금 할 금액</label> <input
									type="text" name="amount" id="amount"
									required class="form-control">
							</div>
							<div class="form-group">
								<label for="accountPW2">내 통장 표시</label> <input
									type="text" name="content" id="content"
									required class="form-control">
							</div>
							<button type="submit" class="btn btn-primary">이체</button>
						</div>
					</div>
	</form>
      </div>
      </section>
</body>
</html>