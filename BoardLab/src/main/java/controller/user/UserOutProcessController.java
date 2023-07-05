package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.user.UserDAO;
import biz.user.UserVO;
import controller.Controller;

public class UserOutProcessController implements Controller{
@Override
public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

	/*
	 * HttpSession session = request.getSession(); String sessionID = (String)
	 * session.getAttribute("id");
	 */

	
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String password2 = request.getParameter("confirmPassword");
	
	UserVO vo = new UserVO();
	UserDAO dao = new UserDAO();

	vo.setId(id); // id �ʵ� ����
	vo.setPassword(password); // password �ʵ� ����
	
	if (password != null && password.equals(password2)) {
		dao.deleteUser(vo);

		String msg = "���������� ȸ��Ż��Ǿ����ϴ�.";
		request.setAttribute("msg", msg);

		String url = "/BoardLab/mainPage.do";
		request.setAttribute("url", url);
		
	} else {
		String msg = "��й�ȣ�� ��ġ���� �ʽ��ϴ�.";
		String url = "/BoardLab/userOut.do";

		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
	}

	return "UserOutProcess.jsp";
}
}
