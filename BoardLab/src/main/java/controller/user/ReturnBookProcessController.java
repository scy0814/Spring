package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.rent.RentalDAO;
import biz.rent.RentalVO;
import biz.user.UserVO;
import controller.Controller;

public class ReturnBookProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		System.out.println(isbn);
		
		RentalVO vo = new RentalVO();
		vo.setIsbn(isbn);
		
		UserVO loginUser = (UserVO) request.getSession().getAttribute("loginUser");
        vo.setRental_id(loginUser.getId()); // rental_id ¼³Á¤
		
		RentalDAO dao = new RentalDAO();
		dao.returnBook(vo);
		
		return "ReturnBookProcess.jsp";
	}
}
