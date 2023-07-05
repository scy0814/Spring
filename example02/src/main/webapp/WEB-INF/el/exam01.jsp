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
      http://localhost:8080/example1/EL/exam01.jsp?name=hong 입력시 hong 출력
    --%>
    
    이름 : <%= request.getParameter("name") %> <br>
    이름 : ${ param.name } <br>
    ID : ${ param.id }    
</body>
</html>   