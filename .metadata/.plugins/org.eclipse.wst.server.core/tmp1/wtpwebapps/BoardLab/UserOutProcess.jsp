<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
 
    <%
    session.invalidate();
    %>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<body>
<script>
	alert('${msg}')
	location.href = '${ url }';
</script>
</head>
</body>
</html>