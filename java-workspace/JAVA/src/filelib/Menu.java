package filelib;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	MemberUtil member = new MemberUtil();
	BookUtil book = new BookUtil();

	public void process() {

		System.out.println("<< 지원 도서관 >>");

		System.out.println("로그인이 필요합니다.");

		boolean bool = true;

		while (bool) {
			System.out.println();
			System.out.print("1.관리자로그인\t 2.사용자로그인\t 3.회원가입\t 4.종료 ==>");
			int num = sc.nextInt();
			System.out.println();

			switch (num) {
			case 1:
				System.out.println("관리자 로그인");
				member.login();
				if ((member.getLoginedId().equals("admin"))) {
					System.out.println("[ " + member.getLoginedId() + " ] 관리자  계정으로  로그인 되었습니다.");
					adminMenu();
				} else {
					System.out.println("등록된 관리자가 아닙니다.");
				}
				break;
			case 2:
				System.out.println("사용자 로그인 페이지입니다.");
				member.login();
				if (member.getLoginedId() == "") {
					break;
				} else {
					System.out.println("[ " + member.getLoginedId() + " ] 님 로그인 되었습니다.");
					userMenu();
				}
				break;
			case 3:
				member.signUp();
				break;
			case 4:
				System.out.println("종료되었습니다.");
				bool = false;
			}
		}

	}

	public void adminMenu() {

		System.out.println("<< 관리자 >>");
		boolean bool = true;
		while (bool) {
			System.out.println("메뉴를 선택하세요.");
			System.out.print("1. 도서등록\t 2.도서삭제 \t 3.전체 도서 조회\t 4.종료 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("<< 도서 등록 >>");
				book.bookAdd();
				break;
			case 2:
				System.out.println("<< 도서 삭제 >>");
				book.bookDel();
				break;
			case 3:
				System.out.println("<< 전체 목록 >>");
				book.readFile();
				book.printBookList(book.getAllBookList());
				break;
			case 4:
				System.out.println("종료되었습니다.");
				bool = false;
			}
		}
	}

	public void userMenu() {
		boolean bool = true;

		System.out.println("<< 일반 사용자 메뉴 >>");
		book.readFile();
		while (bool) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.도서대출 \t 2.도서반납\t 3.종료 : ");
			int num = sc.nextInt();
	
			switch (num) {
			case 1:
				System.out.println("<< 도서 대출 >>");
				book.borrow();
				break;
			case 2:
				System.out.println("<< 도서 반납 >>");
				book.bookReturn();
				break;
			case 3:
				System.out.println("종료되었습니다.");
				bool = false;
			}
		}

	}

}