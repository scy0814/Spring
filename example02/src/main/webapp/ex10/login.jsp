<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="login" class="ex10.LoginBean"/>
	<jsp:setProperty property="id" name="login"/>
	<jsp:setProperty property="password" name="login"/>
	<%
	if(login.dbCheck()){
	%>
		<jsp:getProperty property="id" name="login"/> ���� �α����߽��ϴ�
	<%
	}else{
	%>
	<jsp:forward page="login.html"/>
	<%
	}
	%>
</body>
</html>