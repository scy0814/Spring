package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.user.UserDAO;
import biz.user.UserVO;
import controller.Controller;

public class InsertUserController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String birthNo = request.getParameter("birthNo");
		String phoneNo = request.getParameter("phoneNo");
		
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		vo.setBirthNo(birthNo);
		vo.setPhoneNo(phoneNo);

		UserDAO dao = new UserDAO();
		dao.insertUser(vo);
		
		return "Login.jsp";
	}
}
