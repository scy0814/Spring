package kr.ac.kopo.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.user.UserDAO;
import biz.user.UserVO;

public class SignUpProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		try {
            request.setCharacterEncoding("UTF-8");
         } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
         };
		
		String name = request.getParameter("name");
		String birthNo = request.getParameter("birthNo");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phoneNo");
		String address = request.getParameter("address");

		UserVO vo = new UserVO();
		vo.setName(name);
		vo.setR_num(birthNo);
		vo.setId(id);
		vo.setPassword(password);
		vo.setEmail(email);
		vo.setPhoneNo(phoneNo);
		vo.setAddress(address);
		
		UserDAO dao = new UserDAO();
		dao.insertUser(vo);
		
		String msg = "회원가입이 완료되었습니다";
		 String url = "index.jsp";
	        request.setAttribute("msg", msg); 
	        request.setAttribute("url", url);
		
		
		
		return "/jsp/login/SignUpProcess.jsp";
	}
}
