package controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.rent.RentalDAO;
import biz.rent.RentalVO;
import biz.user.UserVO;
import controller.Controller;

public class GetRentalListController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		RentalVO rentalVO = new RentalVO(); 
		UserVO loginUser =(UserVO)request.getSession().getAttribute("loginUser");
		rentalVO.setRental_id(loginUser.getId());
	        RentalDAO dao = new RentalDAO();
	        List<RentalVO> rentalList = dao.getBooksByRentalId(rentalVO);
	        request.setAttribute("rentalList", rentalList);
	        return "GetRentalList.jsp";
	}
}
