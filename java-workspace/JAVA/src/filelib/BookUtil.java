package filelib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookUtil implements BookInterface{

	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private ArrayList<Book> bookList = new ArrayList<Book>();
	private ArrayList<Book> rentedBook = new ArrayList<Book>();
	private ArrayList<Book> allBookList = new ArrayList<Book>();

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public ArrayList<Book> getRentedBook() {
		return rentedBook;
	}

	public void setRentedBook(ArrayList<Book> rentedBook) {
		this.rentedBook = rentedBook;
	}

	public ArrayList<Book> getAllBookList() {
		return allBookList;
	}

	public void setAllBookList(ArrayList<Book> allBookList) {
		this.allBookList = allBookList;
	}

	//책 정보 출력
	public void printBookList(ArrayList<Book> List) {
		
		System.out.println("도서id\t도서명\t지은이 \t장르");
		for (Book b : List) {
			System.out.println(b.getBookCode() + "\t" + b.getBookName() + "\t" + b.getWriter() + "\t");
		}
	}

	public void readFile() {
		allBookList.clear();

		FileReader fr = null;

		try {
			fr = new FileReader("librarydata/booklist");
			br = new BufferedReader(fr);

			String line = "";
			while ((line = br.readLine()) != null) {
				String[] Arr = line.split(",");
				
				allBookList.add(new Book(Integer.parseInt(Arr[0]), Arr[1], Arr[2]));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Day13 IOMain06참고
	@Override
	public void borrow() {
		System.out.println("대여할 책의 이름을 입력하세요 : ");
		
		// 빌리고 싶은 책이름
		String bookName = sc.nextLine();

		boolean registered = false;

		for (Book book : allBookList) {
			if (bookName.equals(book.getBookName())) {
				registered = true;

				if (book.isBarrow()) {
					System.out.println("회원님이 이미 대여 중인 책입니다.");
				} else {
					System.out.println("도서명 : " + book.getBookName() + "을 빌렸습니다.");
					book.setBarrow(true);
					rentedBook.add(book);
				}
			}
		}
		if (!registered) {
			System.out.println("대여할 수 없는 책입니다");
		}
	}

	@Override
	public void bookReturn() {
		printBookList(rentedBook);
		System.out.println("반납할 책의 코드를 입력하세요.");
		int bookCode = Integer.parseInt(sc.nextLine());

		for (Book storedBook : allBookList) {
			if (bookCode == storedBook.getBookCode()) {
				if (storedBook.isBarrow()) {
					System.out.println(storedBook.getBookName() + "이 정상적으로 반납되었습니다.");
					storedBook.setBarrow(false);
					//삭제 방지를 위해 iterator를 사용했는데 문제가 발생해서 한개씩 확인하는 방법을 택함
					for(int j = 0; j< rentedBook.size(); j++) {
						if(bookCode == rentedBook.get(j).getBookCode()) {
							rentedBook.remove(j);							
						}
					}
				}
				else {
					System.out.println("빌린 책이 아닙니다");
				}
				} 
			}
		System.out.println("<< 대출한 책 목록 >>");
		printBookList(rentedBook);
	}

	
	@Override
	public void bookAdd() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			int bookCode = 0;
			String bookName = null, writer = null;
			boolean registered;
			Book bookinfo = new Book(bookCode, bookName, writer);
			fr = new FileReader("librarydata/booklist");
			br = new BufferedReader(fr);

			String listline = "";

			do {
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

			bookinfo.setBookCode(bookCode);
			
			System.out.print("책 이름 입력 : ");
			bookName = sc.nextLine();
			bookinfo.setBookName(bookName);
			System.out.print("저자 입력 : ");
			writer = sc.nextLine();
			bookinfo.setWriter(writer);
			
			bookList.add(bookinfo);

			FileWriter fw;

			//파일에 새로운 책 등록
			try {
				fw = new FileWriter("librarydata/booklist", true);
				
				System.out.println();
				for (Book b : bookList) {
					fw.write(b.getBookCode() + "," + b.getBookName() + "," + b.getWriter()+ "\n");
				}

				fw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void bookDel() {
		
		readFile();
		FileWriter fw = null;
		System.out.println("<< 현재 전체 책 목록 >>");
		
		printBookList(allBookList);

		System.out.println();
		System.out.print("삭제할 책의 id를 입력해 주세요 : ");
		
		int id = Integer.parseInt(sc.nextLine());
		
		/*
		for (Book allBook : allBookList) {
			if (id == allBook.getBookCode()) {
				allBookList.remove(allBook);
			}
		}
		*/
		for (int i = 0; i < allBookList.size(); i++) {
			if (id == allBookList.get(i).getBookCode()){
				allBookList.remove(i);
			}
		}

		//삭제 후 파일
		try {
			fw = new FileWriter("librarydata/booklist"); 
			System.out.println();

			for (Book allBook : allBookList) {
				fw.write(allBook.getBookCode() + "," + allBook.getBookName()+ "," + allBook.getWriter() + "\n");
			}
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("삭제되었습니다.");
		System.out.println();
		System.out.println("<< 삭제 후 전체 책 목록 >>");
		printBookList(allBookList);
	}
}