package filelib;

public class Book {
	private int bookCode;
	private String bookName;
	private String writer;
	private boolean isBorrow;
	
	//필드 없는 생성자
	public Book() {
		bookName = "";
		writer ="";
		isBorrow = false;
	}
	
	//필드 있는 생성자
	public Book(int bookCode, String bookName, String writer) {
		this.bookCode = bookCode;
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
		
	//bookid, 중복체크를 위한 코드
	public int getCode() {
		return bookCode;
	}

	public void setCode(int bookCode) {
		this.bookCode = bookCode;
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
