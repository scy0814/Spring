<%@ page import="kr.ac.kopo.book.BookVO" language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
	BookVO b = new BookVO();
	b.setIsbn("123-456");
	b.setTitle("EL�̶� �����ΰ�");
	b.setWriter("ȫ�浿");
	
	//��������(pageContext)�� "book"�̶� �̸����� ������ BookVO ��ü�� ���
	pageContext.setAttribute("book", b);
	
	//"book" ��ü ����
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