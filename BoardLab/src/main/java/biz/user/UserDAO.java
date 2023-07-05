package biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import biz.book.BookVO;
import biz.common.JDBCUtil;

public class UserDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	private static String USER_INSERT="insert into users(id, password, name, birthNo, phoneNo)" + " values (?, ?, ?, ?, ?)";
	private static String USER_GET="select * from users where id =? and password =?";
	private static String USER_UPDATE = "UPDATE users set name =?, password =?, birthNo =?, phoneNo =? WHERE id =? ";
	private static String USER_DELETE = "delete from users where id = ?";
	private static String USER_LIST = "select * from users";
	
	public void insertUser(UserVO vo) {
		try {
			conn = JDBCUtil.getConnection();
				stmt = conn.prepareStatement(USER_INSERT);
				stmt.setString(1, vo.getId());
				stmt.setString(2, vo.getPassword());
				stmt.setString(3, vo.getName());
				stmt.setString(4, vo.getBirthNo());
				stmt.setString(5, vo.getPhoneNo());
				stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
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
				user.setBirthNo(rs.getString("birthNo"));
				user.setPhoneNo(rs.getString("phoneNo"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return user;
	}
	
	public void updateUser(UserVO vo) {
	    try {
//	    	UPDATE users set name =?, password =?, birthNo =?, phoneNo =? WHERE id =? 
	        conn = JDBCUtil.getConnection();
	        stmt = conn.prepareStatement(USER_UPDATE);
	        stmt.setString(1, vo.getName());
	        stmt.setString(2, vo.getPassword());
	        stmt.setString(3, vo.getBirthNo());
	        stmt.setString(4, vo.getPhoneNo());
	        stmt.setString(5, vo.getId());
	        stmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        JDBCUtil.close(stmt, conn);
	    }
	}
	
	public void deleteUser(UserVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_DELETE);
			stmt.setString(1, vo.getId());
	        stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	        JDBCUtil.close(stmt, conn);
	    }
	}
	
	public List<UserVO> getUserList(UserVO vo) {
        List<UserVO> userList = new ArrayList<UserVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				UserVO user = new UserVO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setPhoneNo(rs.getString("phoneNo"));
				user.setBirthNo(rs.getString("birthNo"));
				userList.add(user);
		}
		}catch (Exception e) {
            e.printStackTrace();
        }
        
        return userList;
    }
	

	
}