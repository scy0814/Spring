package controller.reply;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

public class ReplyController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String cc_no = request.getParameter("cc_no");
		System.out.println("cc_no : " +  cc_no);
		
		
		
		
		return null;
	}
}
