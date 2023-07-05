package biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import biz.common.JDBCUtil;

public class UserDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	private static String USER_GET="select * from users where id =? and password =?";
	private static String USER_UPDATE = "UPDATE users set password =?, name =?, r_num =?, email =?, phoneNo =?, address =? WHERE id =? ";
	private static String USER_INSERT = "insert into users (id, password, name, r_num, email, phoneNo, address ) values "
					+ "(?, ?, ?, ?, ?, ?, ? )";
	
	public UserVO getUser(UserVO vo) {
		UserVO user= null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setR_num(rs.getString("r_num"));
				user.setEmail(rs.getString("email"));
				user.setPhoneNo(rs.getString("phoneNo"));
				user.setAddress(rs.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}


	public void updateUser(UserVO vo) {
		try {
			conn = JDBCUtil.getConnection();
	        stmt = conn.prepareStatement(USER_UPDATE);
	        stmt.setString(1, vo.getPassword());
	        stmt.setString(2, vo.getName());
	        stmt.setString(3, vo.getR_num());
	        stmt.setString(4, vo.getEmail());
	        stmt.setString(5, vo.getPhoneNo());
	        stmt.setString(6, vo.getAddress());
	        stmt.setString(7, vo.getId());
	        stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void insertUser(UserVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getR_num());
			stmt.setString(5, vo.getEmail());
			stmt.setString(6, vo.getPhoneNo());
			stmt.setString(7, vo.getAddress());
			stmt.executeUpdate();
//			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
