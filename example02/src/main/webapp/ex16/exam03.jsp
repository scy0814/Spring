<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%
    String[] names ={"���浿","ȫ�浿","���浿","�ڱ浿","��浿"};
    pageContext.setAttribute("names", names);
    //pageContext.setAttribute("length", names.length);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${names }" var="name">
	${name }
</c:forEach>
<br>
	<c:forEach begin="0" end="${fn:length(names) }" var="i">
		${names[i]}&nbsp;&nbsp;	
	</c:forEach>	
	<br>
${names[0]}&nbsp;&nbsp;
${names[1]}&nbsp;&nbsp;
${names[2]}&nbsp;&nbsp;
${names[3]}&nbsp;&nbsp;
${names[4]}&nbsp;&nbsp;
<br>
	�⵵ ���� :
	<select>
		<c:forEach begin="1960" end="2023" var="year">
		<option>${year}</option>		
		</c:forEach>
	</select>

	<c:forEach begin="1" end="10" var="i">
	${i}&nbsp;&nbsp;
	</c:forEach>
	<br>
</body>
</html>