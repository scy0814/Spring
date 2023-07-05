package controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.book.BookDAO;
import biz.book.BookVO;
import controller.Controller;

public class RentBookController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		BookVO vo= new BookVO();
		BookDAO dao = new BookDAO();
		List<BookVO> bookList = dao.getBookList(vo);
		request.setAttribute("bookList", bookList);
		return "RentBook.jsp";
	}
}
