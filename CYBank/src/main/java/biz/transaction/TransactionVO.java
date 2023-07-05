package biz.transaction;

import java.sql.Timestamp;
import java.util.Date;

public class TransactionVO {

	private String accountNum1;
	private String accountNum2;
	private String t_type;
	private String t_amount;
	private String t_balance;
	private Timestamp t_date;
	private String t_content;
	private String num1_name;
	private String num2_name;
	public TransactionVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionVO(String accountNum1, String accountNum2, String t_type, String t_amount, String t_balance,
			Timestamp t_date, String t_content, String num1_name, String num2_name) {
		super();
		this.accountNum1 = accountNum1;
		this.accountNum2 = accountNum2;
		this.t_type = t_type;
		this.t_amount = t_amount;
		this.t_balance = t_balance;
		this.t_date = t_date;
		this.t_content = t_content;
		this.num1_name = num1_name;
		this.num2_name = num2_name;
	}
	public String getAccountNum1() {
		return accountNum1;
	}
	public void setAccountNum1(String accountNum1) {
		this.accountNum1 = accountNum1;
	}
	public String getAccountNum2() {
		return accountNum2;
	}
	public void setAccountNum2(String accountNum2) {
		this.accountNum2 = accountNum2;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public String getT_amount() {
		return t_amount;
	}
	public void setT_amount(String t_amount) {
		this.t_amount = t_amount;
	}
	public String getT_balance() {
		return t_balance;
	}
	public void setT_balance(String t_balance) {
		this.t_balance = t_balance;
	}
	public Timestamp getT_date() {
		return t_date;
	}
	
	public void setTimestamp(Date date) {
        this.t_date = new Timestamp(date.getTime());
    }
	
	public void setT_date(Timestamp t_date) {
		this.t_date = t_date;
	}
	public String getT_content() {
		return t_content;
	}
	public void setT_content(String t_content) {
		this.t_content = t_content;
	}
	public String getNum1_name() {
		return num1_name;
	}
	public void setNum1_name(String num1_name) {
		this.num1_name = num1_name;
	}
	public String getNum2_name() {
		return num2_name;
	}
	public void setNum2_name(String num2_name) {
		this.num2_name = num2_name;
	}
	@Override
	public String toString() {
		return "TransactionVO [accountNum1=" + accountNum1 + ", accountNum2=" + accountNum2 + ", t_type=" + t_type
				+ ", t_amount=" + t_amount + ", t_balance=" + t_balance + ", t_date=" + t_date + ", t_content="
				+ t_content + ", num1_name=" + num1_name + ", num2_name=" + num2_name + "]";
	}
	
}
