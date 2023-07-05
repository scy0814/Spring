package controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import biz.comment.CommentDAO;
import biz.comment.CommentVO;
import biz.notice.NoticeDAO;
import biz.notice.NoticeVO;
import biz.user.UserDAO;
import biz.user.UserVO;
import kr.ac.kopo.controller.Controller;

public class GetNoticeController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		UserVO user = (UserVO) session.getAttribute("user");
		UserDAO userDAO = new UserDAO();
		UserVO userVO = userDAO.getUser(user);
		session.setAttribute("user", userVO);

		String n_no = request.getParameter("n_no");
		
		CommentVO commentVO = new CommentVO();
		CommentDAO commentDAO = new CommentDAO();
		commentVO.setN_no(n_no);
		List<CommentVO> commentList = commentDAO.getCommentList(commentVO);
		request.setAttribute("commentList", commentList);
		System.out.println(commentList);

		NoticeVO vo = new NoticeVO();
		vo.setN_no(n_no);

		NoticeDAO dao = new NoticeDAO();
		NoticeVO notice = dao.getNotice(vo);
		request.setAttribute("notice", notice);

		return "/jsp/notice/GetNotice.jsp";
	}
}