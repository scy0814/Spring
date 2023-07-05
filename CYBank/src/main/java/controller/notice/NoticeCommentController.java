package controller.notice;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.comment.CommentDAO;
import biz.comment.CommentVO;
import kr.ac.kopo.controller.Controller;

public class NoticeCommentController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		try {
            request.setCharacterEncoding("UTF-8");
         } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
         };
        
        String n_no = request.getParameter("n_no");
		String nc_id = request.getParameter("id");
		String nc_comment = request.getParameter("comment");
		Date nc_date = new Date();
		
		CommentVO vo = new CommentVO();
		
		vo.setNc_id(nc_id);
		vo.setNc_comment(nc_comment);
		vo.setNc_date(nc_date);
		vo.setN_no(n_no);

		
		CommentDAO dao = new CommentDAO();
		dao.insertComment(vo);
		
		String msg = "댓글작성이 완료되었습니다";
		String url = "/CYBank/noticeList.do";
		request.setAttribute("msg", msg); 
        request.setAttribute("url", url);
		
		
		return "/jsp/notice/NoticeComment.jsp";
//		return "redirect:/getNotice.do?n_no=1";
	}
}
