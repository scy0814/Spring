<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
</head>
<body>
<% 
    // ���ǿ��� �α��� ���� ��������
    String id = (String) session.getAttribute("id");
    
    // ������ �α����� ���̵� �ִٸ� ���� �������� �̵�
    if (id != null) {
        response.sendRedirect("mainPage.jsp");
        return; // �߿�: ������ �ڵ� ������ ���� ���� return �� ���
    }
    %>
    
	<form method="post" action="loginProcess.jsp">
		<input type="text" name="id" placeholder="ID"> <input
			type="password" name="password" placeholder="PASSWORD"> <input
			type="submit" value="�α���">
	</form>
</body>
</html>
  