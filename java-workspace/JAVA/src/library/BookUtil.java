package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookUtil implements BookInterface{
	Scanner sc = new Scanner(System.in);
	private List<Book> bookList;
	//도서목록
	public void printBookList(List<Book> bookList) {
		System.out.println("도서명\t지은이");
		for (Book b : bookList) {
			System.out.println(b.getBookname() + "\t" + b.getWriter());
		}
	}
	//도서등록
	@Override
	public void bookAdd(){
		bookList = new ArrayList<Book>();
		String bookName = null, writer = null;
		Book bookinfo = new Book(bookName, writer);
		System.out.print("책 이름 입력 : ");
		bookName = sc.nextLine();
		bookinfo.setBookname(bookName);
		System.out.print("저자 입력 : ");
		writer = sc.nextLine();
		bookinfo.setWriter(writer);
		
		//최종등록
		bookList.add(bookinfo);
		}
	//도서삭제
	@Override
	public void bookDel() {
		System.out.println("삭제할 책의 이름을 입력하세요: ");
		String bookName = sc.nextLine();
		System.out.println();
		Book book = findBook(bookName);
		/*
		if(bookName.equals(book.getBookname())) {
			bookList.remove(book);
		}
		*/
		if(book != null) {
		bookList.remove(book);
		System.out.println("삭제되었습니다");
		}
		
	}
	//도서대여
	@Override
	public void borrow() {
		System.out.print("대여할 책의 이름을 입력하세요 : ");
		// 빌리고 싶은 책이름
		String bookName = sc.nextLine();
		System.out.println();
		
		//이름과 비교
		Book book = findBook(bookName);
		if(book.isRental()) {
			System.out.println("이미 대여중인 도서입니다");
		}
		//대여상태로 변경
		book.setRental(true);
		rentedBook.add(book);
	}
	
	// 도서반납
	@Override
	public void bookReturn() {
		System.out.println("반납할 책 이름을 입력하세요.");
		String bookName = sc.nextLine();
		System.out.println();
		Book book = findBook(bookName);
		if(book.isRental()) {
			//반납으로 변경
			System.out.println("반납되었습니다");
			book.setRental(false);
			rentedBook.remove(book);
		}
	}
	
	//빌린 책 목록
	private List<Book> rentedBook = new ArrayList<Book>();
	public List<Book> getRentedBook() {
		return rentedBook;
	}
	
	//전체 책 목록
	public List<Book> getAllBookList() {
		return bookList;
	}
	//도서목록출력
	public void printBooklist(List<Book> bookList) {
		for(Book book: bookList) {
			System.out.println(book.getBookname() + "\t" + book.getWriter());
		}
	}
	//도서검색
	public Book findBook(String bookName) {
		for(Book book: bookList) {
			if(bookName.equals(book.getBookname()))
			return book;
		}
		return null;
	}


}
