<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Main Page</title>
</head>
<body>


<% 
    // ���ǿ��� �α��� ���� ��������
    String sessionID = (String) session.getAttribute("id");
    String password = (String) session.getAttribute("password");
    %>

    <% if (sessionID != null) { %>
        <h1><%= sessionID %> �� ����������</h1>
        <h3><%= sessionID %>�� ȯ���մϴ�</h3>
         <form method="post" action="logOut.jsp">
        <input type="submit" value="�α׾ƿ�">
</form>
        
        
    <% } else { %>
        <h1>�α��ε��� �ʾҽ��ϴ�.</h1>
        <a href="login.jsp">�α��� �������� �̵�</a>
    <% } %>

	
</body>
</html>
  