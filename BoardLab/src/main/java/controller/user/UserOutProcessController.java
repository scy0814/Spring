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

	vo.setId(id); // id 필드 설정
	vo.setPassword(password); // password 필드 설정
	
	if (password != null && password.equals(password2)) {
		dao.deleteUser(vo);

		String msg = "정상적으로 회원탈퇴되었습니다.";
		request.setAttribute("msg", msg);

		String url = "/BoardLab/mainPage.do";
		request.setAttribute("url", url);
		
	} else {
		String msg = "비밀번호가 일치하지 않습니다.";
		String url = "/BoardLab/userOut.do";

		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
	}

	return "UserOutProcess.jsp";
}
}
