<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%
	String [] nameArray = {"ȫ�浿","���浿","��浿"};
	
	pageContext.setAttribute("names",nameArray);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	ù�� ° �̸� : <%= nameArray[0] %><br>
	ù�� ° �̸� : <%= ((String[])pageContext.getAttribute("names"))[0] %><br>
	EL ù��° �̸� : ${names[0]}<br>
	EL ù��° �̸� : ${names[4]}<br>
</body>
</html>