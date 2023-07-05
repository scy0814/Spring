package biz.reply;

import java.sql.Timestamp;

public class ReplyVO {

	private String 	cr_no;
	private String	id;
	private String	cc_no;
	private String	cr_content;
	private Timestamp cr_date;
	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReplyVO(String cr_no, String id, String cc_no, String cr_content, Timestamp cr_date) {
		super();
		this.cr_no = cr_no;
		this.id = id;
		this.cc_no = cc_no;
		this.cr_content = cr_content;
		this.cr_date = cr_date;
	}
	public String getCr_no() {
		return cr_no;
	}
	public void setCr_no(String cr_no) {
		this.cr_no = cr_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCc_no() {
		return cc_no;
	}
	public void setCc_no(String cc_no) {
		this.cc_no = cc_no;
	}
	public String getCr_content() {
		return cr_content;
	}
	public void setCr_content(String cr_content) {
		this.cr_content = cr_content;
	}
	public Timestamp getCr_date() {
		return cr_date;
	}
	public void setCr_date(Timestamp cr_date) {
		this.cr_date = cr_date;
	}
	@Override
	public String toString() {
		return "ReplyVO [cr_no=" + cr_no + ", id=" + id + ", cc_no=" + cc_no + ", cr_content=" + cr_content
				+ ", cr_date=" + cr_date + "]";
	}
	
	
	
}
