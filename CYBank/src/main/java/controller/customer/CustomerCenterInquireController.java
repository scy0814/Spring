package controller.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.controller.Controller;

public class CustomerCenterInquireController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

		return "/jsp/customer/CustomerCenterInquire.jsp";
	}
}
