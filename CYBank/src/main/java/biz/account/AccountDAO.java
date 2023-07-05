package biz.account;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import biz.common.JDBCUtil;
import biz.transaction.TransactionVO;

public class AccountDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	private static String ACCOUNT_INSERT = "insert into account (accountNum, id, type, accountName, accountPW, balance, a_date, name) values " + "(?, ?, ?, ?, ?, ?, ?, ?)";
	private static String ACCOUNT_LIST = "select * from account where id = ?";
	private static String ACCOUNT_CLOSE = "delete from account where accountNum = ?";
	private static String GET_BY_NUM = "select * from account where accountNum = ?";
	private static String ACCOUNT_UPDATE = "update account set balance = ? where accountNum = ?";
	
	
	public void insertAccount(AccountVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(ACCOUNT_INSERT);
			stmt.setString(1, vo.getAccountNum());
			stmt.setString(2, vo.getId());
			stmt.setString(3, vo.getType());
			stmt.setString(4, vo.getAccountName());
			stmt.setString(5, vo.getAccountPW());
			stmt.setString(6, vo.getBalance());
			stmt.setDate(7, new java.sql.Date(vo.getA_date().getTime()));
			stmt.setString(8, vo.getName());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<AccountVO> getAccountListById(AccountVO vo) {
		List<AccountVO> accountList = new ArrayList<AccountVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(ACCOUNT_LIST);
			stmt.setString(1, vo.getId());
			rs = stmt.executeQuery();
			while (rs.next()) {
				AccountVO account = new AccountVO();
				account.setAccountNum(rs.getString("accountNum"));
				account.setId(rs.getString("id"));
				account.setType(rs.getString("type"));
				account.setAccountName(rs.getString("accountName"));
				account.setAccountPW(rs.getString("accountPW"));
				account.setBalance(rs.getString("balance"));
				account.setA_date(rs.getDate("a_date"));
				account.setName(rs.getString("name"));
				accountList.add(account);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accountList;
	}

	public void closeAccount(AccountVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(ACCOUNT_CLOSE);
			stmt.setString(1, vo.getAccountNum());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public AccountVO getAccountByAccountNum(String accountNum) {
		AccountVO account = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(GET_BY_NUM);
			stmt.setString(1, accountNum);
			rs = stmt.executeQuery();
			while(rs.next()) {
				account = new AccountVO();
				account.setAccountNum(rs.getString("accountNum"));
				account.setId(rs.getString("id"));
				account.setType(rs.getString("type"));
				account.setAccountName(rs.getString("accountName"));
				account.setAccountPW(rs.getString("accountPW"));
				account.setBalance(rs.getString("balance"));
				account.setA_date(rs.getDate("a_date"));
				account.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}

	public void updateAccount(TransactionVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(ACCOUNT_UPDATE);
			stmt.setString(1, vo.getT_balance());
			stmt.setString(2, vo.getAccountNum1());
			stmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
}
