package biz.book;

public class BookVO {
	
	private int isbn;
	private String title;
	private String writer;
	private String publisher;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
	public BookVO(int isbn, String title, String writer, String publisher) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
	}
	
	public BookVO() {
		super();
	}
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher + "]";
	}
	
	
	
	
	
	
}
