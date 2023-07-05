package controller.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.book.BookDAO;
import biz.book.BookVO;
import controller.Controller;

public class InsertBookProcessController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String publisher = request.getParameter("publisher");
		
		BookVO vo = new BookVO();
		vo.setIsbn(isbn);
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setPublisher(publisher);
		
		BookDAO dao = new BookDAO();
		dao.insertBook(vo);
		return "getBookList.do";
	}
}
