package ex05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTestServlet2
 */
@WebServlet("/CookieTestServlet2")
public class CookieTestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookieTestServlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ȭ�� �������� �����°� �Է� ��� ���ڵ� ���ڵ� ���ڼ� ����
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");
		// ��� HTML ���� ����� ���� out �ν��Ͻ� ����
		PrintWriter out = response.getWriter();

		// jsp�� ���� ��Ű�� �ִ��� Ȯ���ϰ� ������ ��Ű�� �����ϴ� ���

		// �������κ��� ��Ű ��������
		Cookie[] cookies = request.getCookies();

		// ��Ű�� �ִ��� Ȯ��
		if (cookies != null) {
			// ��Ű�� ������
			for (Cookie cookie : cookies) {
				// ���
				out.println("cookie :" + cookie.getName() + "\t" + "value :" + cookie.getValue() + "<br/>");
			}
		}
		// name�� value �Է¹޴� html �� ����
		out.println("<form method = 'post' action='CookieTestServlet2'>");

		// ���� ������ �� action='CookieTestServlet2'�� �� �����Ͱ� ���۵� ������ �����մϴ�.
		out.println("<input type='text' name='num1' placeholder=����1 />");
		out.println("<input type='text' name='cal' placeholder=������ />");
		out.println("<input type='text' name='num2' placeholder=����2 />");
		out.println("<input type='submit'/>");
		out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Ȩ���� post�� ��û�ؿ���
		// request���� name,value ����
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

		// cookie�� ����
//		Cookie c = new Cookie(name, value);
//		response.addCookie(c);

		// ���� doGet���� �����̷���
		response.sendRedirect("CookieTestServlet2");
		doGet(request, response);
	}

}