<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
.top {
	background-color: #BEE3F8;
	padding: 10px;
	height: 80px;
	display: flex;
	justify-content: space-between; /* Adjusted to create space between buttons and welcome text */
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
	color: navy blue;
	
}

.blue-area {
	display: flex;
	align-items: center;
}
</style>

<c:set var="isMyPageClicked" value="${not empty param.page && param.page eq 'mypage'}" />
<c:set var="isLogin" value="${not empty loginUser}" />

<div style="width: 100%" class="top">
	<div class="button-container">
		<a class="button" href="/BoardLab/myInfo.do"><span>내정보</span></a> 
		<a class="button" href="/BoardLab/changeInfo.do"><span>회원정보수정</span></a> 
		<a class="button" href="/BoardLab/userOut.do"><span>탈퇴</span></a> 
		<a class="button" href="/BoardLab/rentBook.do"><span>도서 대여</span></a> 
		<a class="button" href="/BoardLab/getRentalList.do"><span>대여 목록</span></a> 
		<a class="button" href="/BoardLab/returnBook.do"><span>도서 반납</span></a> 
		<a class="button" href="mainPage.do"><span>홈으로</span></a> 
	</div>
	<c:if test="${isLogin}">
		<div class="blue-area">
			<span class="welcome">[(${loginUser.id})님 환영합니다]</span>
		</div>
	</c:if>
</div>