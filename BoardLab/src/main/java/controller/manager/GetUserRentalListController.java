package controller.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.rent.RentalDAO;
import biz.rent.RentalVO;
import controller.Controller;

public class GetUserRentalListController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		RentalVO vo = new RentalVO();
		RentalDAO dao = new RentalDAO();
		List<RentalVO> rentalList = dao.getRentalList(vo);
		request.setAttribute("rentalList", rentalList);
		
		return "GetUserRentalList.jsp";
	}
}
