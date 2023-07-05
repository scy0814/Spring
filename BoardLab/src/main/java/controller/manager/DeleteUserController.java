package controller.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.user.UserDAO;
import biz.user.UserVO;
import controller.Controller;

public class DeleteUserController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		UserVO vo= new UserVO();
		UserDAO dao = new UserDAO();
		List<UserVO> userList = dao.getUserList(vo);
		request.setAttribute("userList", userList);
		return "DeleteUser.jsp";
	}

}
