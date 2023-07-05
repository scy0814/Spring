package biz.comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import biz.common.JDBCUtil;

public class CommentDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	private static String COMMENT_LIST = "select * from notice_comments where n_no = ? order by LPAD(nc_no,2,'0') desc";
	private static String COMMENT_INSERT = "insert into notice_comments (nc_no,nc_id,nc_comment,nc_date, n_no) values "
			+ "((select nvl(max(to_number(nc_no)),0)+1 from notice_comments), ?, ?, ?, ? )";
	private static String COMMENT_DELETE = "delete from notice_comments where nc_no = ?";
	private static String COMMENT_REARRANGE = "update notice_comments set nc_no = ? where nc_no = ?";
	
	
	
	public List<CommentVO> getCommentList(CommentVO commentVO) {
		List<CommentVO> commentList = new ArrayList<CommentVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(COMMENT_LIST);
			stmt.setString(1, commentVO.getN_no());
			rs = stmt.executeQuery();
			while(rs.next()) {
				CommentVO comment = new CommentVO();
				comment.setNc_no(rs.getString("nc_no"));
				comment.setNc_id(rs.getString("nc_id"));
				comment.setNc_comment(rs.getString("nc_comment"));
				comment.setNc_date(rs.getDate("nc_date"));
				commentList.add(comment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(commentList);
		return commentList;
	}

	public void insertComment(CommentVO vo) {
		try {
			conn=JDBCUtil.getConnection();
			stmt = conn.prepareStatement(COMMENT_INSERT);
			stmt.setString(1, vo.getNc_id());
			stmt.setString(2, vo.getNc_comment());
			stmt.setDate(3, new java.sql.Date(vo.getNc_date().getTime()));
			stmt.setString(4, vo.getN_no());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteComment(CommentVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(COMMENT_DELETE);
			stmt.setString(1, vo.getNc_no());
			stmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rearrangeCommentNumbers() {
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(COMMENT_REARRANGE);
            stmt.setString(1, "rownum");
            stmt.setString(2, "rownum + 1");
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

	
	
	

