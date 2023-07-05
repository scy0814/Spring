package controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.account.AccountDAO;
import biz.account.AccountVO;
import kr.ac.kopo.controller.Controller;

public class CloseAccountProcessController implements Controller{
@Override
public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	String accountNum = request.getParameter("closeAccount");
	
	AccountVO vo = new AccountVO();
	vo.setAccountNum(accountNum);
	
	AccountDAO dao = new AccountDAO();
	dao.closeAccount(vo);
	return "/index.jsp";
}
}
