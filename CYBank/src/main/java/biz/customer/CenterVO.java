package biz.customer;

import java.sql.Timestamp;

public class CenterVO {
	private String cc_no;
	private String id;
	private String cc_type;
	private String cc_title;
	private String cc_content;
	private Timestamp cc_date;
	private int cc_check;
	public CenterVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CenterVO(String cc_no, String id, String cc_type, String cc_title, String cc_content, Timestamp cc_date,
			int cc_check) {
		super();
		this.cc_no = cc_no;
		this.id = id;
		this.cc_type = cc_type;
		this.cc_title = cc_title;
		this.cc_content = cc_content;
		this.cc_date = cc_date;
		this.cc_check = cc_check;
	}
	public String getCc_no() {
		return cc_no;
	}
	public void setCc_no(String cc_no) {
		this.cc_no = cc_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCc_type() {
		return cc_type;
	}
	public void setCc_type(String cc_type) {
		this.cc_type = cc_type;
	}
	public String getCc_title() {
		return cc_title;
	}
	public void setCc_title(String cc_title) {
		this.cc_title = cc_title;
	}
	public String getCc_content() {
		return cc_content;
	}
	public void setCc_content(String cc_content) {
		this.cc_content = cc_content;
	}
	public Timestamp getCc_date() {
		return cc_date;
	}
	public void setCc_date(Timestamp cc_date) {
		this.cc_date = cc_date;
	}
	public int getCc_check() {
		return cc_check;
	}
	public void setCc_check(int cc_check) {
		this.cc_check = cc_check;
	}
	@Override
	public String toString() {
		return "CenterVO [cc_no=" + cc_no + ", id=" + id + ", cc_type=" + cc_type + ", cc_title=" + cc_title
				+ ", cc_content=" + cc_content + ", cc_date=" + cc_date + ", cc_check=" + cc_check + "]";
	}
	
	
	
	
	
}
