<%@page import="java.util.List"%>
<%@page import="kr.ac.kopo.book.BookVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
  <%
  BookVO book = new BookVO();
  book.setTitle("성공");
  
  List<BookVO> books = new ArrayList();
  books.add(book);
  
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