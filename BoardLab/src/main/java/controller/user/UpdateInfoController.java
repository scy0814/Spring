package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.board.BoardDAO;
import biz.board.BoardVO;
import biz.user.UserDAO;
import biz.user.UserVO;
import controller.Controller;

public class UpdateInfoController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String birthNo = request.getParameter("birthNo");
		String phoneNo = request.getParameter("phoneNo");

		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setBirthNo(birthNo);
		vo.setPhoneNo(phoneNo);
		System.out.println("vo : " + vo);
		UserDAO dao = new UserDAO();
		dao.updateUser(vo);
		//return "redirect:/mainPage.do";
		return "UpdateInfo.jsp";
	}
}
