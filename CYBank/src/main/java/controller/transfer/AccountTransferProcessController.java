package controller.transfer;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.account.AccountDAO;
import biz.account.AccountVO;
import biz.transaction.TransactionDAO;
import biz.transaction.TransactionVO;
import kr.ac.kopo.controller.Controller;

public class AccountTransferProcessController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
            request.setCharacterEncoding("UTF-8");
         } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
         };
        Timestamp t_date = new Timestamp(new Date().getTime());
         
		String accountNum1 = request.getParameter("accountNum");
		String num1_name = request.getParameter("name");
		String t_content = request.getParameter("content");
		
		String accountNum2 = request.getParameter("accountNum2");
		AccountVO accountVO = new AccountVO();
		AccountDAO accountDAO = new AccountDAO();
		accountVO.setAccountNum(accountNum2);
		AccountVO account = accountDAO.getAccountByAccountNum(accountNum2);
//		System.out.println(accountNum2);
//		System.out.println(account.getName());
		String t_amount = request.getParameter("amount");
		String balance = request.getParameter("balance");
		int amount = Integer.parseInt(t_amount);
		int currentBalance = Integer.parseInt(balance);
		int sum_balance = currentBalance - amount;
		int plusBalance = currentBalance + amount;
		String t_type = "-"; 
		String t_balance = String.valueOf(sum_balance);
		String t_balance2 = String.valueOf(plusBalance);
		
		//출금내역 저장 단계
		TransactionVO vo = new TransactionVO();
		vo.setAccountNum1(accountNum1);
		vo.setAccountNum2(accountNum2);
		vo.setT_type(t_type);
		vo.setT_amount(t_amount);
		vo.setT_balance(t_balance);
		vo.setTimestamp(t_date);
		vo.setT_content(t_content);
		vo.setNum1_name(num1_name);
		vo.setNum2_name(account.getName());
		
		TransactionDAO dao = new TransactionDAO();
		dao.insertTransaction(vo);
		
		AccountDAO acDAO = new AccountDAO();
		acDAO.updateAccount(vo);
		
		//입금내역 저장 단계
		TransactionVO vo2 = new TransactionVO();
		vo2.setAccountNum1(accountNum2);
		vo2.setAccountNum2(accountNum1);
		String t_type2 = "+";
		vo2.setT_type(t_type2);
		vo2.setT_amount(t_amount);
		vo2.setT_balance(t_balance2);
		vo2.setTimestamp(t_date);
		vo2.setT_content(t_content);
		vo2.setNum1_name(account.getName());
		vo2.setNum2_name(num1_name);
		
		TransactionDAO dao2 = new TransactionDAO();
		dao2.insertTransaction(vo2);
		
		AccountDAO acDAO2 = new AccountDAO();
		acDAO2.updateAccount(vo2);
		return "/index.jsp";
	}
}

