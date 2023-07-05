package biz.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import biz.common.JDBCUtil;

public class CenterDAO {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	private static String INQUIRE_INSERT = "insert into customer_center (cc_no, id, cc_type, cc_title, cc_content, cc_date, cc_check) values "
			+ "((select nvl(max(to_number(cc_no)),0)+1 from customer_center), ?, ?, ?, ?, ?, ?)";
	private static String INQUIRE_LIST = "select * from customer_center where id= ? order by LPAD(cc_no,2,'0') desc";
	private static String ADINQUIRE_LIST = "select * from customer_center order by LPAD(cc_no,2,'0') desc";
	private static String INQUIRE_GET = "select * from customer_center where cc_no=?";
	private static String CHECK_UPDATE = "UPDATE customer_center set cc_check = ? WHERE cc_no = ? ";
	
	public void insertInquire(CenterVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(INQUIRE_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getCc_type());
			stmt.setString(3, vo.getCc_title());
			stmt.setString(4, vo.getCc_content());
			stmt.setTimestamp(5, vo.getCc_date());
			stmt.setInt(6, vo.getCc_check());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<CenterVO> getInquireListById(CenterVO vo) {
		List<CenterVO> inquireList = new ArrayList<CenterVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(INQUIRE_LIST);
			stmt.setString(1, vo.getId());
			rs = stmt.executeQuery();
			while(rs.next()) {
				CenterVO center = new CenterVO();
				center.setCc_no(rs.getString("cc_no"));
				center.setId(rs.getString("id"));
				center.setCc_type(rs.getString("cc_type"));
				center.setCc_title(rs.getString("cc_title"));
				center.setCc_content(rs.getString("cc_content"));
				center.setCc_date(rs.getTimestamp("cc_date"));
				center.setCc_check(rs.getInt("cc_check"));
				inquireList.add(center);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inquireList;
	}

	public CenterVO getInquire(CenterVO vo) {
		CenterVO center = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(INQUIRE_GET);
			stmt.setString(1, vo.getCc_no());
			rs = stmt.executeQuery();
			while(rs.next()) {
				center = new CenterVO();
				center.setCc_no(rs.getString("cc_no"));
				center.setId(rs.getString("id"));
				center.setCc_type(rs.getString("cc_type"));
				center.setCc_title(rs.getString("cc_title"));
				center.setCc_content(rs.getString("cc_content"));
				center.setCc_date(rs.getTimestamp("cc_date"));
				center.setCc_check(rs.getInt("cc_check"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return center;
	}

	public void updateCheck(CenterVO centerVO) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(CHECK_UPDATE);
			stmt.setInt(1, centerVO.getCc_check());
			stmt.setString(2, centerVO.getCc_no());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<CenterVO> getInquireList(CenterVO vo) {
		List<CenterVO> AdinquireList = new ArrayList<CenterVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(ADINQUIRE_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				CenterVO center = new CenterVO();
				center.setCc_no(rs.getString("cc_no"));
				center.setId(rs.getString("id"));
				center.setCc_type(rs.getString("cc_type"));
				center.setCc_title(rs.getString("cc_title"));
				center.setCc_content(rs.getString("cc_content"));
				center.setCc_date(rs.getTimestamp("cc_date"));
				center.setCc_check(rs.getInt("cc_check"));
				AdinquireList.add(center);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return AdinquireList;	
		
	}

}