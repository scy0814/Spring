package biz.user;

public class UserVO {

	private String id;
	private String password;
	private String name;
	private String r_num;
	private String email;
	private String phoneNo;
	private String address;
	public UserVO() {
		super();
	}
	public UserVO(String id, String password, String name, String r_num, String email, String phoneNo, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.r_num = r_num;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
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
	public String getR_num() {
		return r_num;
	}
	public void setR_num(String r_num) {
		this.r_num = r_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", r_num=" + r_num + ", email="
				+ email + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	
	
	
}
