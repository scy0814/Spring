package controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.notice.NoticeDAO;
import biz.notice.NoticeVO;
import kr.ac.kopo.controller.Controller;

public class DeleteNoticeController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String n_no = request.getParameter("n_no");
		System.out.println("n : " + n_no);
		NoticeVO vo = new NoticeVO();
		vo.setN_no(n_no);
		
		NoticeDAO dao = new NoticeDAO();
		dao.deleteNotice(vo);
		
		String msg = "공지사항이 정상적으로 삭제되었습니다";
		 String url = "/CYBank/noticeList.do";
	        request.setAttribute("msg", msg); 
	        request.setAttribute("url", url);
		
	        return "/jsp/notice/DeleteNotice.jsp";
		
	}
}
