<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="kr.ac.kopo.book.BookVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    Map <String, String> m = new HashMap<String,String>();
    
    BookVO b = new BookVO();
	b.setTitle("EL�̶� �����ΰ�");
    
    String [] nameArray = {"����","����"};
    
    pageContext.setAttribute("books",nameArray);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- ���� ��� --%>
	����/����?? ${books[0].title }<br>
</body>
</html>