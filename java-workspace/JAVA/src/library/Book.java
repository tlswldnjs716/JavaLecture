package library;

public class Book {
	private String bookName;
	private String writer;
	private boolean isBorrow;
	
	public Book(String bookName, String writer) {
		this.bookName = bookName;
		this.writer = writer;
		//처음에는 아무도 안 빌린 상태
		isBorrow = false;
		
	}
	
	//이미 빌린 책이라면 알려줘야함
	public boolean isRental() {
		return isBorrow;
	}
	//대출, 반납 관리
	public void setRental(boolean borrowed) {
		isBorrow = borrowed;
	}
	//책 이름 받고 설정
	public String getBookname() {
		return bookName;
	}
	public void setBookname(String bookName) {
		this.bookName = bookName;
	}
	//저자이름 받고 설정
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//오버라이드
	public String toStirng() {
		return bookName+ "\t"+ writer+ "\t"+ isBorrow;
	}
}
