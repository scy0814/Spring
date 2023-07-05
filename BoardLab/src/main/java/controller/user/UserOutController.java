package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

public class UserOutController implements Controller{
@Override
public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	
	 return "UserOut.jsp";
}
}
