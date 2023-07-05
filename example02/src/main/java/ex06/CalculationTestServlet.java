package ex06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculationTestServlet
 */
@WebServlet("/CalculationTestServlet")
public class CalculationTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculationTestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");

		PrintWriter out = response.getWriter();

		// 이전에 저장된 결과가 있는지 확인
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
					out.println(cookie.getName() + "=" + cookie.getValue() + "<br/>");
			}
		}

		out.println("<form method='post' action='CalculationTestServlet'>");
		out.println("<input type='text' name='num1' placeholder='첫 번째 숫자' required/><br/>");
		out.println("<input type='text' name='num2' placeholder='두 번째 숫자' required/><br/>");
		out.println("<select name='calculation'>");
		out.println("<option value='+'>+</option>");
		out.println("<option value='*'>*</option>");
		out.println("<option value='-'>-</option>");
		out.println("<option value='/'>/</option>");
		out.println("</select><br/>");
		out.println("<input type='submit' value='계산'/>");
		out.println("</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String calculation = request.getParameter("calculation");
		
		
		int result = 0;
		switch(calculation) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "/" :
			result = num1 / num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
		}

		String str = num1 + calculation + num2;
		String str2 =  String.valueOf(result);
		Cookie c = new Cookie(str, str2);
		response.addCookie(c);
		response.sendRedirect("CalculationTestServlet");
	}

}