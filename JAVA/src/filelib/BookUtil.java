package filelib;

//버퍼필터
import java.io.BufferedReader;
import java.io.BufferedWriter;
//파일 읽고 쓰기
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.util.FileClose;

public class BookUtil implements BookInterface {
	Member member = new Member();
	Scanner sc = new Scanner(System.in);
	// 도서목록
	private List<Book> bookList = new ArrayList<Book>();

	// 빌린도서목록
	private List<Book> rentedBook = new ArrayList<Book>();

	// 목록
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	// 빌린 책 목록
	public List<Book> getRentedBook() {
		return rentedBook;
	}

	// 빌린 목록 설정
	public void setRentedBook(ArrayList<Book> rentedBook) {
		this.rentedBook = rentedBook;
	}

	// 전체도서목록출력
	public void printBookList(List<Book> List) {
		System.out.println("도서id\t도서명\t지은이");
		for (Book b : List) {
			System.out.println(b.getCode() + "\t" + b.getBookname() + "\t" + b.getWriter());
		}
	}
	
	// 도서등록
	// Day13 IOMain06참고
	@Override
	public void bookAdd() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			int bookCode = 0;
			String bookName = null, writer = null;
			boolean registered;
			Book bookinfo = new Book(bookCode, bookName, writer);
			fr = new FileReader("iolibrarydata/booklist");
			br = new BufferedReader(fr);

			String listline = "";

			do {
				// 책 등록 전
				registered = false;
				System.out.println("책의 코드를 입력하세요.");
				bookCode = Integer.parseInt(sc.nextLine());
				// 같은 책이 있는지 확인하는 코드
				// 버퍼는 라인 단위로 읽어 옴
				// 리스트에서 라인 단위로 읽어올 때 비어있지 않을때까지 확인
				// 이미 북리스트에 같은 id가 있는지 확인
				while ((listline = br.readLine()) != null) {
					// 새로운 id설정, 새로운 거면 파일에 넣어야 하니까 string으로 전환
					String newCode = Integer.toString(bookCode);
					// 책의 정보 중 id값만 따로 가져오기 위해 자름
					String[] existCode = listline.split(",");
					if (newCode.equals(existCode[0])) {
						System.out.println("이미 등록된 책입니다.");
						registered = true;
					}
				}
			} while (registered == true);

			bookinfo.setCode(bookCode);

			System.out.print("책 이름 입력 : ");
			bookName = sc.nextLine();
			bookinfo.setBookname(bookName);
			System.out.print("저자 입력 : ");
			writer = sc.nextLine();
			bookinfo.setWriter(writer);
			// 리스트에 최종등록
			bookList.add(bookinfo);
		} catch (Exception e) {
			//e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(fr);
		}
		
		//파일에 저장
		try {
			fw = new FileWriter("iolibrarydata/booklist");
			bw = new BufferedWriter(fw);

			for (Book book : bookList) {
				fw.write(book.getCode() + "," + book.getBookname() + "," + book.getWriter()+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fw);
		}
	}

	// 도서삭제
	@Override
	public void bookDel() {
		FileReader fr = null;
		BufferedReader br = null;
		
		//도서목록읽어오기
		bookList.clear();
		
		try {
			fr = new FileReader("iolibrarydata/booklist");
			br = new BufferedReader(fr);

			String line = "";
			while ((line = br.readLine()) != null) {
				String[] tempArr = line.split(",");
				
				bookList.add(new Book(Integer.parseInt(tempArr[0]), tempArr[1], tempArr[2]));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		//bookCode를 사람이 기억할 수 없으니까 출력해주기
		System.out.println("<< 전체 책 목록 >>");
		System.out.println(bookList + "\n");
		System.out.println("삭제할 책의 코드를 입력하세요: ");
		
		int bookCode = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < bookList.size(); i++) {
			if (bookCode == bookList.get(i).getCode()) {
				bookList.remove(i);
			}
		}
		System.out.println("삭제되었습니다");
		System.out.println("<< 삭제 후 >>");
		printBookList(bookList);
	}

	// 도서대여
	@Override
	public void borrow() {
		System.out.print("대여할 책의 이름을 입력하세요 : ");
		// 빌리고 싶은 책이름
		String bookName = sc.nextLine();
		System.out.println();

		boolean registered = false;

		for (Book book : bookList) {
			if (bookName.equals(book.getBookname())) {
				registered = true;

				if (book.isRental()) {
					System.out.println("이미 대여 중입니다.");
				} else {
					System.out.println("도서명 : " + book.getBookname() + "이 대여되었습니다.");
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
		System.out.println();

		for (Book book : bookList) {
			if (bookName.equals(book.getBookname())) {
				if (book.isRental()) {
						System.out.println("도서명 : " + book.getBookname() + "이 반납되었습니다.");
				}
				book.setRental(false);
				rentedBook.remove(book);
			}
			else {
				System.out.println("대여중이 아닙니다.");
			}
		}
		System.out.println("<< 대출한 책 목록 >>");
		printBookList(rentedBook);
	}
}
