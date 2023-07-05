package biz.comment;

import java.util.Date;

public class CommentVO {
	private String	nc_no; 
	private String nc_id;
	private String nc_comment;
	private Date nc_date;
	private String n_no;
	
	public CommentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommentVO(String nc_no, String nc_id, String nc_comment, Date nc_date) {
		super();
		this.nc_no = nc_no;
		this.nc_id = nc_id;
		this.nc_comment = nc_comment;
		this.nc_date = nc_date;
	}
	
	public String getN_no() {
		return n_no;
	}
	public void setN_no(String n_no) {
		this.n_no = n_no;
	}
	public String getNc_no() {
		return nc_no;
	}
	public void setNc_no(String nc_no) {
		this.nc_no = nc_no;
	}
	public String getNc_id() {
		return nc_id;
	}
	public void setNc_id(String nc_id) {
		this.nc_id = nc_id;
	}
	public String getNc_comment() {
		return nc_comment;
	}
	public void setNc_comment(String nc_comment) {
		this.nc_comment = nc_comment;
	}
	public Date getNc_date() {
		return nc_date;
	}
	public void setNc_date(Date nc_date) {
		this.nc_date = nc_date;
	}
	@Override
	public String toString() {
		return "CommentVO [nc_no=" + nc_no + ", nc_id=" + nc_id + ", nc_comment=" + nc_comment + ", nc_date=" + nc_date
				+ "]";
	}
	
	
	
}
