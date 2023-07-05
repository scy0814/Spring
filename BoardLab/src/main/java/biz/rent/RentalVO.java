package biz.rent;

import java.util.Date;

public class RentalVO {
	private int isbn;
	private String title;
	private String writer;
	private String publisher;
	private String rental_id;
	private Date rental_date;
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
	public String getRental_id() {
		return rental_id;
	}
	public void setRental_id(String rental_id) {
		this.rental_id = rental_id;
	}
	public Date getRental_date() {
		return rental_date;
	}
	public void setRental_date(Date rental_date) {
		this.rental_date = rental_date;
	}
	public RentalVO(int isbn, String title, String writer, String publisher, String rental_id, Date rental_date) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.rental_id = rental_id;
		this.rental_date = rental_date;
	}
	@Override
	public String toString() {
		return "RentalVO [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher
				+ ", rental_id=" + rental_id + ", rental_date=" + rental_date + "]";
	}
	public RentalVO() {
		super();
	}
	
	
	
	
}
