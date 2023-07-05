package controller.myPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.user.UserDAO;
import biz.user.UserVO;
import kr.ac.kopo.controller.Controller;

public class MyPageController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		UserVO user = (UserVO) session.getAttribute("user");

		UserDAO dao = new UserDAO();
		UserVO vo = dao.getUser(user);
			session.setAttribute("user", vo);
		return "/jsp/myPage/MyPage.jsp";
	}
}
