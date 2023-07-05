<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
</head>
<body>
<% 
    // 세션에서 로그인 정보 가져오기
    String id = (String) session.getAttribute("id");
    
    // 이전에 로그인한 아이디가 있다면 메인 페이지로 이동
    if (id != null) {
        response.sendRedirect("mainPage.jsp");
        return; // 중요: 이후의 코드 실행을 막기 위해 return 문 사용
    }
    %>
    
	<form method="post" action="loginProcess.jsp">
		<input type="text" name="id" placeholder="ID"> <input
			type="password" name="password" placeholder="PASSWORD"> <input
			type="submit" value="로그인">
	</form>
</body>
</html>
  