package inmemorylib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookUtil implements BookInterface{
	Member member = new Member();
	Scanner sc = new Scanner(System.in);
	//도서목록
	private List<Book> bookList = new ArrayList<Book>();
	
	//빌린도서목록
	private List<Book> rentedBook = new ArrayList<Book>();

	//목록
	public List<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	//빌린 책 목록
	public List<Book> getRentedBook() {
		return rentedBook;
	}
	
	//빌린 목록 설정
	public void setRentedBook(ArrayList<Book> rentedBook) {
		this.rentedBook = rentedBook;
	}
	
	//전체도서목록출력
	public void printBookList(List<Book> List) {
		System.out.println("도서코드\t도서명\t작가");
		for (Book b : List) {
			System.out.println(b.getCode()+"\t"+b.getBookname() + "\t" + b.getWriter());
		}
	}
	
	//도서등록
	//책의 이름, 저자이름이 달라야 새로운 코드를 가질 수 있음
	@Override
	public void bookAdd(){
		int bookCode = 0; String bookName = null, writer = null, checkId = null; 
		boolean registered;
		Book bookinfo = new Book(bookCode, bookName, writer, checkId);
		do {
			registered = false;
			System.out.println("책의 코드를 입력하세요.");
			bookCode = Integer.parseInt(sc.nextLine());
			for(Book book: bookList) {
				if(bookCode == book.getCode()) {
					System.out.println("이미 등록된 책입니다.");
					registered = true;
				}	
			}
		}while(registered == true);
		
		bookinfo.setCode(bookCode);
		bookinfo.setCheckId(checkId);
		
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
		BookUtil bookinfo = new BookUtil();
		bookinfo.printBookList(bookinfo.getBookList());
		System.out.println("삭제할 책의 코드를 입력하세요: ");
		int bookCode = Integer.parseInt(sc.nextLine());
		
		//삭제예외처리를 위해 이터레이터 사용
		Iterator<Book> itebook = bookList.iterator();
		
		while(itebook.hasNext()){
			Book book = itebook.next();
			if(bookCode == book.getCode()){
				itebook.remove();
			}
		}
		System.out.println("삭제되었습니다");
		System.out.println("<< 삭제 후 전체 책 목록 >>");
		printBookList(bookList);
	}
	
	//도서대여
	@Override
	public void borrow() {
		System.out.print("대여할 책의 이름을 입력하세요 : ");
		// 빌리고 싶은 책이름
		String bookName = sc.nextLine();
		System.out.println();
		
		boolean registered = false;
		
		for(Book book: bookList) {
			if(bookName.equals(book.getBookname())) {
				registered = true;

				if (book.isRental()) {
					System.out.println("이미 대여 중입니다.");
				} else {
					System.out.println("도서명 : " + book.getBookname() + "이 대여되었습니다.");
					book.setCheckId(MemberUtil.getLoginedId());
					book.setRental(true);
					rentedBook.add(book);
				}
			}
		}
		if (!registered) {
			System.out.println("등록된 책이 아닙니다.");
		}
	}
	
	// 도서반납
	@Override
	public void bookReturn() {
		System.out.println("반납할 책 이름을 입력하세요.");
		String bookName = sc.nextLine();
		
		//삭제예외처리를 위해 이터레이터 사용
				Iterator<Book> itebook = rentedBook.iterator();
				while(itebook.hasNext()){
					Book book = itebook.next();
					if(bookName.equals(book.getBookname())){
						if (book.isRental()) {
							// 반납으로 변경
							//System.out.println(MemberUtil.getLoginedId());
							// 반납자가 로그인한 사람이 맞는지 확인
							if(MemberUtil.getLoginedId().equals(book.getCheckId())) {
							System.out.println("반납되었습니다");
							}
							book.setRental(false);
							itebook.remove();
						}
						else {
							System.out.println("대여중이 아닙니다.");
						}
					}
				}
	}
}
