<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <%--
      http://localhost:8080/example1/EL/exam01.jsp?name=hong �Է½� hong ���
    --%>
    
    �̸� : <%= request.getParameter("name") %> <br>
    �̸� : ${ param.name } <br>
    ID : ${ param.id }    
</body>
</html>   