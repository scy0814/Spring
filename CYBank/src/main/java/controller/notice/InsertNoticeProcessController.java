package controller.notice;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.notice.NoticeDAO;
import biz.notice.NoticeVO;
import kr.ac.kopo.controller.Controller;

public class InsertNoticeProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		try {
            request.setCharacterEncoding("UTF-8");
         } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
         };
         
		String n_title = request.getParameter("title");
		String n_content = request.getParameter("content");
		Timestamp n_date = new Timestamp(new Date().getTime());
		
		NoticeVO vo = new NoticeVO();
		vo.setN_title(n_title);
		vo.setN_content(n_content);
		vo.setN_date(n_date);
		
		NoticeDAO dao = new NoticeDAO();
		dao.insertNotice(vo);
		
		String msg = "공지사항이 정상적으로 등록되었습니다";
		 String url = "/CYBank/noticeList.do";
	        request.setAttribute("msg", msg); 
	        request.setAttribute("url", url);
		
		
		return "/jsp/notice/InsertNoticeProcess.jsp";
	}
}
