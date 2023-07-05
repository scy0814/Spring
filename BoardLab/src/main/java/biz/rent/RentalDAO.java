package biz.rent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import biz.board.BoardVO;
import biz.book.BookVO;
import biz.common.JDBCUtil;

public class RentalDAO {
	
	private static String BOOK_RENTAL =  "INSERT INTO rental (isbn, title, writer, publisher, rental_id, rental_date) "
										+ "VALUES (?, ?, ?, ?, ?, ?)";
	private static String BOOK_SELECT = "SELECT * FROM rental WHERE rental_id = ?";
	private static String RENTAL_LIST = "select * from RENTAL";
	private static String BOOK_RETURN = "delete from rental where isbn = ?";
	
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	
	public void rentBook(RentalVO rentalVO) {
		try {
				conn = JDBCUtil.getConnection();
				stmt = conn.prepareStatement(BOOK_RENTAL);
				stmt.setInt(1, rentalVO.getIsbn());
	            stmt.setString(2, rentalVO.getTitle());
	            stmt.setString(3, rentalVO.getWriter());
	            stmt.setString(4, rentalVO.getPublisher());
	            stmt.setString(5, rentalVO.getRental_id());
	            stmt.setDate(6, new java.sql.Date(rentalVO.getRental_date().getTime()));
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<RentalVO> getBooksByRentalId(RentalVO rentalVO) {
	    List<RentalVO> rentalList = new ArrayList<>();

	    try {
	        conn = JDBCUtil.getConnection();
	        stmt = conn.prepareStatement(BOOK_SELECT);
	        stmt.setString(1, rentalVO.getRental_id());
	        rs = stmt.executeQuery();

	        while (rs.next()) {
	            RentalVO rental = new RentalVO();
	            rental.setIsbn(rs.getInt("isbn"));
	            rental.setTitle(rs.getString("title"));
	            rental.setWriter(rs.getString("writer"));
	            rental.setPublisher(rs.getString("publisher"));
	            rentalList.add(rental);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return rentalList;
	}
	
	public List<RentalVO> getRentalList(RentalVO vo) {
		List<RentalVO> rentalList = new ArrayList<RentalVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(RENTAL_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				RentalVO rental = new RentalVO();
				rental.setIsbn(rs.getInt("isbn"));
				rental.setTitle(rs.getString("title"));
				rental.setWriter(rs.getString("writer"));
				rental.setPublisher(rs.getString("publisher"));
				rental.setRental_id(rs.getString("rental_id"));
				rental.setRental_date(rs.getDate("rental_date"));
				rentalList.add(rental);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return rentalList;
	}
	public void returnBook(RentalVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOOK_RETURN);
			stmt.setInt(1, vo.getIsbn());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	

}