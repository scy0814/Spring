package controller.myPage;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.user.UserDAO;
import biz.user.UserVO;
import kr.ac.kopo.controller.Controller;

public class UpdateInfoController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		try {
            request.setCharacterEncoding("UTF-8");
         } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
         };
         
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String r_num = request.getParameter("r_num");
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phoneNo");
		String address = request.getParameter("address");

		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setR_num(r_num);
		vo.setEmail(email);
		vo.setPhoneNo(phoneNo);
		vo.setAddress(address);
		UserDAO dao = new UserDAO();
		dao.updateUser(vo);
		return "/jsp/myPage/UpdateInfo.jsp";
	}
}
