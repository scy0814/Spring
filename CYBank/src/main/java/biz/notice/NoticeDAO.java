package biz.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import biz.common.JDBCUtil;

public class NoticeDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	private static String NOTICE_LIST = "select * from notice order by n_no desc";
	private static String NOTICE_GET = "select * from notice where n_no=?";
	private static String NOTICE_INSERT = "insert into notice (n_no, n_title, n_content, n_date ) values "
	                                                            + "((select nvl(max(to_number(n_no)),0)+1 from notice), ?, ?, ?)";
	private static String NOTICE_DELETE = "delete from notice where n_no = ?";
	
	
	
	public List<NoticeVO> getNoticeList(NoticeVO vo) {
		List<NoticeVO> noticeList = new ArrayList<NoticeVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(NOTICE_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				NoticeVO notice = new NoticeVO();
				notice.setN_no(rs.getString("n_no"));
				notice.setN_title(rs.getString("n_title"));
				notice.setN_content(rs.getString("n_content"));
				notice.setN_date(rs.getTimestamp("n_date"));
				noticeList.add(notice);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return noticeList;
	

}


	public NoticeVO getNotice(NoticeVO vo) {
		NoticeVO notice = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(NOTICE_GET);
			stmt.setString(1, vo.getN_no());
			rs = stmt.executeQuery();
			if (rs.next()) {
				notice = new NoticeVO();
				notice.setN_no(rs.getString("n_no"));
				notice.setN_title(rs.getString("n_title"));
				notice.setN_content(rs.getString("n_content"));
				notice.setN_date(rs.getTimestamp("n_date"));
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(notice);
		return notice;
	}


	public void insertNotice(NoticeVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(NOTICE_INSERT);
			stmt.setString(1, vo.getN_title());
			stmt.setString(2, vo.getN_content());
			stmt.setTimestamp(3, vo.getN_date());
			stmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void deleteNotice(NoticeVO vo) {
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(NOTICE_DELETE);
			stmt.setString(1, vo.getN_no());
			stmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}















