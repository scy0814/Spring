package controller.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.user.UserVO;
import controller.Controller;

public class LoginProcessController implements Controller {

   @Override
   public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
      String id = request.getParameter("id");
      String password = request.getParameter("password");
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "hr";
      String pass = "hr";
      
      StringBuilder sql = new StringBuilder();
      sql.append("SELECT * ");
      sql.append("FROM users ");
      sql.append("WHERE id = ? AND password = ?");
      
      try (
         Connection conn = DriverManager.getConnection(url, user, pass);
         PreparedStatement pstmt = conn.prepareStatement(sql.toString());
      ) {
         pstmt.setString(1, id);
         pstmt.setString(2, password);
         
         ResultSet rs = pstmt.executeQuery();
         
         String msg = "";
         String locUrl = "";
         if (rs.next()) {
            UserVO loginUser = new UserVO();
            loginUser.setId(rs.getString("id"));
            loginUser.setPassword(rs.getString("password"));
            
            msg = loginUser.getId() + "님 환영합니다";
            locUrl = "/BoardLab/mainPage.do";
            
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", loginUser);
         } else {
            msg = "입력하신 ID 또는 패스워드가 잘못되었습니다";
            locUrl = "Login.jsp";
         }
         
         request.setAttribute("msg", msg);
         request.setAttribute("url", locUrl);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return "/LoginProcess.jsp";
   }
}