package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.user.UserDAO;
import biz.user.UserVO;

public class LoginProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO dao = new UserDAO();
		UserVO user = dao.getUser(vo);
		System.out.println(user);
		
		
		if(user != null) {
			System.out.println(user);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			return "/index.jsp";
		}else {
			return "/jsp/notice/GetNotice.jsp";
		}
//		request.setAttribute("msg","로그인성공");
		
//	���� ��� �̷��� return "redirect:/CYBank/main.do"
	}
}
