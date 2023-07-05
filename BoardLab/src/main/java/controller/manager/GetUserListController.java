package controller.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.book.BookDAO;
import biz.book.BookVO;
import biz.user.UserDAO;
import biz.user.UserVO;
import controller.Controller;

public class GetUserListController implements Controller{
@Override
public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	UserVO vo= new UserVO();
	UserDAO dao = new UserDAO();
	List<UserVO> userList = dao.getUserList(vo);
	request.setAttribute("userList", userList);
	return "GetUserList.jsp";
}
}
