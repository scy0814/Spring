<%@page import="kr.ac.kopo.book.BookVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    BookVO book = new BookVO("123-456","JSTL","ȫ�浿");
    
    pageContext.setAttribute("book",book);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	ISBN : ${book.isbn}<br>
	title : ${book.title}<br>
	writer : ${book.writer}<br>
</body>
</html>