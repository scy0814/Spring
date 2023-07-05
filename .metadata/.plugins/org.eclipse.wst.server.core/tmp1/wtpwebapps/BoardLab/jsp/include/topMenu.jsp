<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
.top {
	background-color: #BEE3F8;
	padding: 10px;
	height: 80px;
	display: flex;
	justify-content: flex-start;
	align-items: center;
}

.button {
	background-color: transparent;
	border: none;
	color: navy blue;
	padding: 10px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 14px;
	margin-right: 10px;
	cursor: pointer;
	transition: background-color 0.3s;
	width: 150px;
	height: 50px;
}

.button span {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100%;
}

.button:hover {
	background-color: #1976D2;
}

.welcome {
	margin-left: auto; /* Add margin-left: auto to push the text to the right */
}
</style>
<c:set var="isLogin" value="${not empty loginUser}" />

<div style="width: 100%" class="top">
	<c:if test="${isLogin}">
		<c:if test="${loginUser.id eq 'manager'}">
			<a class="button" href="/BoardLab/getUserList.do"><span>회원관리</span></a>
			<a class="button" href="/BoardLab/getUserRentalList.do"><span>회원대여목록</span></a>
			<a class="button" href="/BoardLab/insertBook.do"><span>도서 등록</span></a>
			<a class="button" href="/BoardLab/deleteBook.do"><span>도서 삭제</span></a>
			<a class="button" href="/BoardLab/getBookList.do"><span>도서 목록</span></a>
			<a class="button" href="/BoardLab/logout.do"><span>로그아웃</span></a>
		</c:if>
		<c:if test="${loginUser.id ne 'manager' && not empty loginUser}">
			<a class="button" href="/BoardLab/boardMainPage.do"><span>게시판</span></a>
			<a class="button" href="/BoardLab/getBookList.do"><span>도서검색</span></a>
			<a class="button" href="/BoardLab/myPageMainPage.do"><span>마이페이지</span></a>
			<a class="button" href="/BoardLab/logout.do"><span>로그아웃</span></a>
		</c:if>
		<span class="welcome">[(${loginUser.id})님 환영합니다]</span>
	</c:if>

	<c:if test="${empty loginUser}">
		<div style="text-align: center;">
			<a class="button" href="/BoardLab/insertUserProcess.do"><span>회원가입</span></a>
			<a class="button" href="/BoardLab/Login.do"><span>로그인</span></a>
		</div>
	</c:if>
</div>