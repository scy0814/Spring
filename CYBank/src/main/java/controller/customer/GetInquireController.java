package controller.customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.customer.CenterDAO;
import biz.customer.CenterVO;
import biz.reply.ReplyDAO;
import biz.reply.ReplyVO;
import biz.user.UserDAO;
import biz.user.UserVO;
import kr.ac.kopo.controller.Controller;

public class GetInquireController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		UserVO user = (UserVO) session.getAttribute("user");
		UserDAO userDAO = new UserDAO();
		UserVO userVO = userDAO.getUser(user);
		session.setAttribute("user", userVO);
		
		String cc_no = request.getParameter("cc_no");
		String cc_check = request.getParameter("cc_check");
		
		ReplyVO replyVO = new ReplyVO();
		ReplyDAO replyDAO = new ReplyDAO();
		replyVO.setCc_no(cc_no);
		List<ReplyVO> replyList = replyDAO.getReplyList(replyVO);
		request.setAttribute("replyList", replyList);
		request.setAttribute("cc_check", cc_check);
		
		CenterVO vo = new CenterVO();
		vo.setCc_no(cc_no);
		
		CenterDAO dao = new CenterDAO();
		CenterVO center = dao.getInquire(vo);
		request.setAttribute("inquire", center);
		
		return "/jsp/customer/GetInquire.jsp";
	}
}
