package filelib;

public class Book {

	private int bookCode;
	private String bookName;
	private String writer;
	private boolean barrow;

	public Book() {
		bookCode = 0;
		setBookName("");
		setWriter("");
		barrow = false;
	}

	public Book(int bookCode, String bookName, String writer) {
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.writer = writer;
		barrow = false;

	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public boolean isBarrow() {
		return barrow;
	}

	public void setBarrow(boolean rental) {
		this.barrow = rental;
	}

}