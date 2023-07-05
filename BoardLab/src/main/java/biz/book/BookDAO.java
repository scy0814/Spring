package biz.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import biz.board.BoardVO;
import biz.common.JDBCUtil;
import biz.user.UserVO;

public class BookDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	private static String BOOK_LIST = "select * from book";
	private static String BOOK_INSERT = "insert into book (isbn, title, writer, publisher) values " + "(?, ?, ?, ? )";
	private static String BOOK_DELETE = "delete from book where isbn= ?";
	private static String BOOK_ISBN = "select * from book where isbn = ?";

	public void insertBook(BookVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOOK_INSERT);
			stmt.setInt(1, vo.getIsbn());
			stmt.setString(2, vo.getTitle());
			stmt.setString(3, vo.getWriter());
			stmt.setString(4, vo.getPublisher());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	public BookVO getBook(BookVO vo) {
		BookVO book = null;
		String sql = "SELECT * FROM books";
		try {
			new JDBCUtil();
			Connection conn = JDBCUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String publisher = rs.getString("publisher");
				boolean isAvailable = rs.getInt("is_available") == 1;
				// book = new BookVO(no, title, writer, publisher,isAvailable);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	public List<BookVO> getBookList(BookVO vo) {
		List<BookVO> bookList = new ArrayList<BookVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOOK_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				BookVO book = new BookVO();
				book.setIsbn(rs.getInt("isbn"));
				book.setTitle(rs.getString("title"));
				book.setWriter(rs.getString("writer"));
				book.setPublisher(rs.getString("publisher"));
				bookList.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bookList;
	}

	public void deleteBook(BookVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOOK_DELETE);
			stmt.setInt(1, vo.getIsbn());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public BookVO getBookByIsbn(int isbn) {
		BookVO book = null;

		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOOK_ISBN);
			stmt.setInt(1, isbn);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				book = new BookVO();
				book.setIsbn(rs.getInt("isbn"));
				book.setTitle(rs.getString("title"));
				book.setWriter(rs.getString("writer"));
				book.setPublisher(rs.getString("publisher"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

}
