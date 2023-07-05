<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style>
.myAccount {
	position: absolute;
	left: 10px;
}

.myHr {
	width: 5cm;
	margin-left: 0;
}




.closeAccount {
	margin-top: 0px;
    left: 500px;
    top: 0px;
}

.error {
	color: red;
}

.success {
	color: green;
}
  .col-lg-8 {
  width: 500px;
  margin-left: 170px;
  }
</style>
<script>
	function showConfirmation(contextPath) {
		var accountPW = document.getElementById("accountPW").value;
		var accountPW2 = document.getElementById("accountPW2").value;
		var errorElement = document.getElementById("error");

		if (accountPW.length < 4 || accountPW2.length < 4) {
			errorElement.innerHTML = "계좌 비밀번호는 4자리 이상이어야 합니다.";
			return false;
		}

		if (accountPW !== accountPW2) {
			errorElement.innerHTML = "계좌 비밀번호와 비밀번호 확인이 일치하지 않습니다.";
			document.getElementById("accountPW2").className = "error";
			return false;
		} else {
			errorElement.innerHTML = "";
			document.getElementById("accountPW2").className = "success";
		}

		alert("계좌가 성공적으로 해지되었습니다.");

		// Form submission
		var form = document.getElementById("closeAccountForm");
		form.action = contextPath + "/closeAccountProcess.do";
		form.submit();
	}
</script>
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
          <li>계좌 해지</li>
        </ol>
        <h2 style="font-size : 35px;">계좌 해지</h2>

      </div>
    </section><!-- End Breadcrumbs -->

    <section class="inner-page">
      <div class="container">
	

	<form id="closeAccountForm" class="closeAccount" method="post">
		<div class="container">
				<div class="col-lg-8">
							<h5 class="card-title">계좌 해지</h5>
							<div class="form-group">
								<label for="id">아이디</label> <input type="text" name="id"
									value="${user.id}" readonly="readonly" disabled
									class="form-control">
							</div>
							<div class="form-group">
								<label for="accountType">해지하실 계좌</label> <select name="closeAccount"
									class="form-control">
									<c:forEach var="account" items="${accountList}">
										<option value="${account.accountNum}">${account.accountNum}
											- ${account.accountName} (${account.type})</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label for="accountPW">계좌 비밀번호</label> <input type="password"
									name="accountPW" id="accountPW" placeholder="4자리" maxlength="4"
									required class="form-control">
							</div>
							<div class="form-group">
								<label for="accountPW2">계좌 비밀번호 확인</label> <input
									type="password" name="accountPW2" id="accountPW2"
									placeholder="4자리" maxlength="4" required class="form-control">
							</div>
							<div id="error"></div>
							<button type="button"
								onclick="showConfirmation('${pageContext.request.contextPath}')"
								class="btn btn-primary">계좌 해지하기</button>
						</div>
					</div>
	</form>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</div>
</section>
</body>
</html>