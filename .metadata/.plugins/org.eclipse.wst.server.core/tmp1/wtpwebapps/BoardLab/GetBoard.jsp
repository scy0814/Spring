<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 상세보기</h1>
	<hr />
	<form action="updateBoard.do" method="post">
		<input name="seq" type="hidden" value="${board.seq}" />
		<table border="1">
			<tr>
				<td>제목</td>
				<td><input name="title" type="text" value="${board.title}" /></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${board.writer }</td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td><textarea name="content" cols="40" rows="10">
				${board.content}
				</textarea></td>
			</tr>
			<tr>
				<td>작성일자</td>
				<td>${board.regDate}</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td><input type="text" name="hit" value="${board.hit}" disabled />
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정" /></td>
			</tr>
		</table>
		<br/>
<c:if test="${user.role == 'Admin'}">
<a href="deleteBoard.do?seq=${board.seq }">삭제</a>
</c:if>
<a href="getBoardList.do">리스트</a>
	</form>
</body>
</html>