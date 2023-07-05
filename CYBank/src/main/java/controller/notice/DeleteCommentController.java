package controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.comment.CommentDAO;
import biz.comment.CommentVO;
import kr.ac.kopo.controller.Controller;

public class DeleteCommentController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String nc_no = request.getParameter("nc_no");
		System.out.println("nc : " + nc_no);

		CommentVO vo = new CommentVO();
		vo.setNc_no(nc_no);
		
		CommentDAO dao = new CommentDAO();
		dao.deleteComment(vo);
		
	
		 dao.rearrangeCommentNumbers(); // 댓글 번호 재정렬
	
		
		 String msg = "댓글이 정상적으로 삭제되었습니다";
		 String url = "/CYBank/noticeList.do";
	        request.setAttribute("msg", msg); 
	        request.setAttribute("url", url); 
		
		return "/jsp/notice/DeleteComment.jsp";
	}
}
