package controller.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.book.BookDAO;
import biz.book.BookVO;
import controller.Controller;

public class DeleteBookProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		
		BookVO vo = new BookVO();
		vo.setIsbn(isbn);
		
		BookDAO dao = new BookDAO();
		dao.deleteBook(vo);
		
		String script = "<script>alert('정상적으로 삭제되었습니다.');</script>";
		request.setAttribute("script", script);
		
		return "deleteBook.do";
	}

}
