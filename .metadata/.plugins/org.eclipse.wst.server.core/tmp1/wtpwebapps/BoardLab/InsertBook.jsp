<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<style>
body {
    padding: 20px;
}
</style>
</head>
<body>
<header>
    <jsp:include page="/jsp/include/topMenu.jsp" />
</header>
<div class="container">
    <h1 class="text-center">도서 등록</h1>
    <hr>
    <form action="insertBookProcess.do" method="post">
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <table class="table">
                    <tr>
                        <td>ISBN</td>
                        <td><input type="text" class="form-control" name="isbn"></td>
                    </tr>
                    <tr>
                        <td>제목</td>
                        <td><input type="text" class="form-control" name="title"></td>
                    </tr>
                    <tr>
                        <td>저자</td>
                        <td><input type="text" class="form-control" name="writer"></td>
                    </tr>
                    <tr>
                        <td>출판사</td>
                        <td><input type="text" class="form-control" name="publisher"></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" class="btn btn-primary" value="등록">
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </form>
</div>
</body>
</html>