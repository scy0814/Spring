package controller.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.user.UserDAO;
import biz.user.UserVO;
import controller.Controller;

public class DeleteUserProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		
		UserVO vo = new UserVO();
		vo.setId(id);
		
		UserDAO dao = new UserDAO();
		dao.deleteUser(vo);
		
		String script = "<script>alert('정상적으로 삭제되었습니다.');</script>";
		request.setAttribute("script", script);
		
		return "getUserList.do";
	}

}
