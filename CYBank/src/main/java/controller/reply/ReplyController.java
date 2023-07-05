package controller.reply;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.customer.CenterDAO;
import biz.customer.CenterVO;
import biz.reply.ReplyDAO;
import biz.reply.ReplyVO;
import kr.ac.kopo.controller.Controller;

public class ReplyController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
            request.setCharacterEncoding("UTF-8");
         } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
         };
        int cc_check = Integer.parseInt(request.getParameter("cc_check"));
		String cc_title = request.getParameter("cc_title");
		String cc_content = request.getParameter("cc_content");
		String cc_date = request.getParameter("cc_date");
        String cc_no2 = request.getParameter("cc_no");
        request.setAttribute("cc_title", cc_title);
        request.setAttribute("cc_content", cc_content);
        request.setAttribute("cc_date", cc_date);
        request.setAttribute("cc_no2", cc_no2);
        
		Timestamp cr_date = new Timestamp(new Date().getTime());
		String cc_no = request.getParameter("cc_no");
		String id = request.getParameter("id");
		String content = request.getParameter("content");
		
		ReplyVO vo = new ReplyVO();
		vo.setCc_no(cc_no);
		vo.setId(id);
		vo.setCr_content(content);
		vo.setCr_date(cr_date);
		
		ReplyDAO dao = new ReplyDAO();
		dao.insertReply(vo);
		
		CenterVO centerVO = new CenterVO();
		centerVO.setCc_check(1);
		centerVO.setCc_no(cc_no);
		CenterDAO centerDAO = new CenterDAO();
		centerDAO.updateCheck(centerVO);
		
		String msg = "답변작성이 완료되었습니다";
		 String url = "/CYBank/customerCenter.do";
	        request.setAttribute("msg", msg); 
	        request.setAttribute("url", url); 
		
		return "/jsp/reply/Reply.jsp";
	}

	
}
