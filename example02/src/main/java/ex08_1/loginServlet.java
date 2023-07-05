package ex08_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("id");
        String password = request.getParameter("password");

        if (id != null && password != null && id.equals("songchangyeol") && password.equals("12345")) {
            HttpSession session = request.getSession();
            session.setAttribute("id", id);
            session.setAttribute("password", password);

            response.sendRedirect("/example02/ex08_1/mainPage2.jsp");
        } else {
            response.sendRedirect("/example02/ex08_1/error2.jsp");
        }
    }

    // doGet() 메서드는 필요하지 않으므로 생략
}
