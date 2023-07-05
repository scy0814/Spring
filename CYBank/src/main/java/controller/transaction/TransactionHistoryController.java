package controller.transaction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.account.AccountDAO;
import biz.account.AccountVO;
import biz.user.UserVO;
import kr.ac.kopo.controller.Controller;

public class TransactionHistoryController implements Controller{
@Override
public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	
	 AccountVO accountVO = new AccountVO();
     UserVO user = (UserVO) request.getSession().getAttribute("user");
     accountVO.setId(user.getId());
     AccountDAO dao = new AccountDAO();
     List<AccountVO> accountList = dao.getAccountListById(accountVO);
     request.setAttribute("accountList", accountList);
     
	return "/jsp/transaction/TransactionHistory.jsp";
}
}
