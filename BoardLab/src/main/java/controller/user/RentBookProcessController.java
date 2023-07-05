package controller.user;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.book.BookDAO;
import biz.book.BookVO;
import biz.rent.RentalDAO;
import biz.rent.RentalVO;
import biz.user.UserVO;
import controller.Controller;

public class RentBookProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		
		BookDAO dao = new BookDAO();
		BookVO vo = dao.getBookByIsbn(isbn);
		
		RentalVO rentalVO = new RentalVO();
		rentalVO.setIsbn(vo.getIsbn());
		rentalVO.setTitle(vo.getTitle());
		rentalVO.setWriter(vo.getWriter());
		rentalVO.setPublisher(vo.getPublisher());
		
		UserVO loginUser =(UserVO)request.getSession().getAttribute("loginUser");
		rentalVO.setRental_id(loginUser.getId());
		Date rentalDate = new Date();
		rentalVO.setRental_date(rentalDate);
		
		RentalDAO rentalDAO = new RentalDAO();
		rentalDAO.rentBook(rentalVO);
		
		return "RentBookProcess.jsp";
	}
}
