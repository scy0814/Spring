<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>현재 대여 목록</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
    <style>
        .body {
            background-color: white;
            margin-top: 0px;
            margin-bottom: 100px;
            height: 700px;
        }
        .footer{
        margin-top : 600px;
        margin-left : 0px;
        }
    </style>
</head>
<body>
    <header>
        <jsp:include page="/jsp/include/MyPageTopMenu.jsp" />
    </header>
    <div class="body">
        <div class="container">
            <h1 class="text-center">현재 대여 목록</h1>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ISBN</th>
                        <th>제목</th>
                        <th>저자</th>
                        <th>출판사</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="rental" items="${rentalList}">
                        <tr>
                            <td>${rental.isbn}</td>
                            <td>${rental.title}</td>
                            <td>${rental.writer}</td>
                            <td>${rental.publisher}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            