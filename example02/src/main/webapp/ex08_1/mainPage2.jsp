<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
</head>
<body>
<%
    // 세션에서 로그인 정보 가져오기
    String sessionID = (String) session.getAttribute("id");
%>

<% if (sessionID != null) { %>
    <h1><%= sessionID %> 님 메인페이지</h1>
    <h3><%= sessionID %>님 환영합니다</h3>
    <form method="post" action="logOut2.jsp">
        <input type="submit" value="로그아웃">
    </form>
<% } else { %>
    <h1>로그인되지 않았습니다.</h1>
    <a href="login2.jsp">로그인 페이지로 이동</a>
<% } %>
</body>
</html>