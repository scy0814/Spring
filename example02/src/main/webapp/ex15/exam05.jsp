<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
ArrayList<String> nameList = new ArrayList<>();
nameList.add("ȫ�浿");
nameList.add("���浿");
nameList.add("��浿");

pageContext.setAttribute("names",nameList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	ù��° �̸� : <%= nameList.get(0) %><br>
	ù��° �̸� : <%= ((ArrayList)pageContext.getAttribute("names")).get(0) %><br>
	EL ù��°�̸� : ${names[0]}<br>
</body>
</html>