<%@ page import="kr.ac.kopo.book.BookVO" language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
	BookVO b = new BookVO();
	b.setIsbn("123-456");
	b.setTitle("EL이란 무엇인가");
	b.setWriter("홍길동");
	
	//공유영역(pageContext)에 "book"이란 이름으로 생성된 BookVO 객체를 등록
	pageContext.setAttribute("book", b);
	
	//"book" 객체 조희
	BookVO book = (BookVO)pageContext.getAttribute("book");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	ISBN =<%=book.getIsbn() %>
	EL ISBN : ${book.isbn}<br>
	EL TITLE : ${book.title}<br>
	EL COMPANY : ${book.company }<br>
</body>
</html>