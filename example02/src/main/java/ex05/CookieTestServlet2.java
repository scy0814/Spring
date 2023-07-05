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
		// 화면 브라우저에 나오는거 입력 출력 인코딩 디코딩 문자셋 설정
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");
		// 출력 HTML 파일 만들기 위한 out 인스턴스 생성
		PrintWriter out = response.getWriter();

		// jsp가 돌떄 쿠키가 있는지 확인하고 있으면 쿠키를 설정하는 기능

		// 브라우저로부터 쿠키 가져오기
		Cookie[] cookies = request.getCookies();

		// 쿠키가 있는지 확인
		if (cookies != null) {
			// 쿠키가 있으면
			for (Cookie cookie : cookies) {
				// 출력
				out.println("cookie :" + cookie.getName() + "\t" + "value :" + cookie.getValue() + "<br/>");
			}
		}
		// name과 value 입력받는 html 폼 생성
		out.println("<form method = 'post' action='CookieTestServlet2'>");

		// 폼을 제출할 때 action='CookieTestServlet2'는 폼 데이터가 전송될 서블릿을 지정합니다.
		out.println("<input type='text' name='num1' placeholder=숫자1 />");
		out.println("<input type='text' name='cal' placeholder=연산자 />");
		out.println("<input type='text' name='num2' placeholder=숫자2 />");
		out.println("<input type='submit'/>");
		out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 홈에서 post로 요청해오면
		// request에서 name,value 추출
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

		// cookie로 저장
//		Cookie c = new Cookie(name, value);
//		response.addCookie(c);

		// 서블릿 doGet으로 리다이렉션
		response.sendRedirect("CookieTestServlet2");
		doGet(request, response);
	}

}