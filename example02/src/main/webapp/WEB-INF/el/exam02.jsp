<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <!-- http://localhost:8080/example02/jstl/exam02.jsp?type=S ��û��
 �����ڴ� ȯ���մϴ� �޽��� ���
 	  http://localhost:8080/example02/jstl/exam02.jsp?type=U ��û��
 �Ϲݻ���ڴ� ȯ���մϴ� �޽��� ���
  -->
	<c:if test="${param.type == 'S'}">
	<h2>�����ڴ� ȯ���մϴ�</h2> 
	</c:if> 
	<c:if test="${param.type eq 'U' }">
	<h2>�Ϲ� ����ڴ� ȯ���մϴ�</h2>
	</c:if>
</body>
</html>