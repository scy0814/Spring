<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	session.invalidate();
%>
<script>
	alert('로그아웃되었습니다')
	location.href = "/BoardLab/mainPage.do"
</script>