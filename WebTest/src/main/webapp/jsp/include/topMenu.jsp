<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<table style="width:100%" border="1">
	<tr>
		<td rowspan="2">�ΰ�</td>
		<td align="right">
			<span style="padding-right: 5px">���ã��</span>
			<c:if test="${ not empty loginUser }">
			[${ loginUser.name }(${ loginUser.id })�� �α�����...]
			</c:if>
		</td>
	</tr>
	<tr>
		<td>
			<c:if test="${ loginUser.type eq 'S' }">
				ȸ������ |
			</c:if>
			 �Խ��� |
			<c:choose> 
				<c:when test="${ empty loginUser }"> 
			 		ȸ������ | 
			 		<a href="/WebTest/jsp/login/login.jsp">�α���</a> |
			 	</c:when>
			 	<c:otherwise> 
			 		���������� | 
			 		<a href="/WebTest/jsp/login/logout.jsp">�α׾ƿ�</a>
			 	</c:otherwise>
			</c:choose>  
		</td>
	</tr>
</table>








