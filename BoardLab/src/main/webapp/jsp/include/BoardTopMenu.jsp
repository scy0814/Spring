<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="isLogin" value="${not empty loginUser}" />
<style>
.top {
	background-color: #BEE3F8;
	padding: 10px;
	height: 80px;
	display: flex;
	justify-content: space-between;
	align-items: center;
	position: relative;
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
	position: absolute;
	top: 50%;
	right: 10px;
	transform: translateY(-50%);
}
</style>

<table style="width:100%" class="top">
    <tr>
        <td align="right">
            <a class="button" href="/BoardLab/getBoardList.do"><span>게시글 목록</span></a> 
            <a class="button" href="/BoardLab/insertBoard.do"><span>글쓰기</span></a> 
            <a class="button" href="mainPage.do"><span>홈으로</span></a> 
            <a class="button" href="/BoardLab/logout.do"><span>로그아웃</span></a>
            <c:if test="${isLogin}">
                <span class="welcome">[(${loginUser.id})님 환영합니다]</span>
            </c:if>
        </td>
    </tr>
</table>