package controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.controller.Controller;

public class CreateAccountController implements Controller{
@Override
public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

	return "/jsp/account/CreateAccount.jsp";
}
}
