<%@page import="kr.ac.kopo.book.BookVO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
Map<String,String> book = new HashMap<>();
book.put("title","성공");
Map[] books = {book};
pageContext.setAttribute("books",books);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
성공/실패?? ${books[0].title }<br>
</body>
</html>
