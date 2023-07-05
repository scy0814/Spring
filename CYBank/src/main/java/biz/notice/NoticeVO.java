package biz.notice;

import java.sql.Timestamp;
import java.util.Date;

public class NoticeVO {
	private String n_no;
	private String n_title;
	private String n_content;
	private Timestamp n_date;
	public NoticeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoticeVO(String n_no, String n_title, String n_content, Timestamp n_date) {
		super();
		this.n_no = n_no;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_date = n_date;
	}
	public String getN_no() {
		return n_no;
	}
	public void setN_no(String n_no) {
		this.n_no = n_no;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public Timestamp getN_date() {
		return n_date;
	}
	public void setN_date(Timestamp n_date) {
		this.n_date = n_date;
	}
	@Override
	public String toString() {
		return "NoticeVO [n_no=" + n_no + ", n_title=" + n_title + ", n_content=" + n_content + ", n_date=" + n_date
				+ "]";
	}
	
	
	
	
	
	
}
