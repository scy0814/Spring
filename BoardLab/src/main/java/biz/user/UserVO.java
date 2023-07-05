package biz.user;

public class UserVO {
	private String id;
	private String password;
	private String name;
	private String birthNo;
	private String phoneNo;
	
	public String getBirthNo() {
		return birthNo;
	}
	public void setBirthNo(String birthNo) {
		this.birthNo = birthNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserVO(String id, String password, String name, String birthNo, String phoneNo) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthNo = birthNo;
		this.phoneNo = phoneNo;
	}
	public UserVO() {
		super();
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", birthNo=" + birthNo + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
	
	
}
