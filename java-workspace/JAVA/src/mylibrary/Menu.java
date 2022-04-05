package mylibrary;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	MemberUtil member = new MemberUtil();
	BookUtil book = new BookUtil();
	
	public void process() {

		System.out.println("-------<< 도서 관리 프로그램 >>-------");

		System.out.println("로그인이 필요합니다.");

		boolean bool = true;
		
		while (bool) {
			System.out.println();
			System.out.print("1.관리자로그인\t 2.사용자로그인\t 3.회원가입\t 4.회원탈퇴\t 5.종료 ==>");
			int num = sc.nextInt();
			System.out.println();

			switch (num) {
			case 1:
				System.out.println("관리자 로그인");
				member.login();
				if ((member.getLoginedId().equals("admin"))) {
					System.out.println("[ " + member.getLoginedId() + " ] 관리자  계정으로  로그인 되었습니다.");
					admin();
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
					MemberMenu();
				}
				break;
			case 3:
				member.signUp();
				break;
			case 4:
				member.signOut();
				break;
			case 5:
				System.out.println("종료되었습니다.");
				bool = false;
			}
		}
	}
	
	private void MemberMenu() {
		boolean bool = true;

		System.out.println(" --------------------- << 일반 사용자 메뉴 >> ---------------------");
		//book.printBooklist();
		while (bool) {
			System.out.println("메뉴를 선택하세요.");
			System.out.print("1. 도서대출\t 2.도서반납 \t 3.종료 ==> ");
			int num = sc.nextInt();
	
			switch (num) {
			case 1:
				System.out.println("----------------- << 도서 대출 >> ------------------");
				book.borrow();
				break;
			case 2:
				System.out.println("----------------- << 도서 반납 >> ------------------ ");
				//book.printBookList(book.getRentedBook());
				book.bookReturn();
				break;
			case 3:
				System.out.println("종료되었습니다.");
				bool = false;
			}
		}
		
	}

	public void admin() {

		System.out.println(" --------------------- << 관리자 메뉴 >> ---------------------");
		boolean bool = true;
		while (bool) {
			System.out.println("메뉴를 선택하세요.");
			System.out.print("1. 도서등록\t 2.도서삭제 \t 3.전체 도서 조회\t 4.대여중인 도서 조회\t 5.전체 회원 조회\t 6.종료  ==> ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("----------------- << 도서를 등록하세요 >> ------------------");
				book.bookAdd();
				break;
			case 2:
				System.out.println("----------------- << 삭제할 도서를 입력하세요 >> ------------- ");
				book.bookDel();
				break;
			case 3:
				System.out.println("----------------- << 전체 도서 목록 >> ------------- ");
				book.printBookList(book.getBookList());
				break;
			case 4:
				System.out.println("----------------- << 대여중인 도서 목록 >> ------------- ");
				book.printBookList(book.getRentedBook());
				break;
			case 5:
				System.out.println("----------------- << 전체 회원 목록 >> ------------- ");
				member.printMemberList(member.getMemberList());
				break;
			case 6:
				System.out.println("종료되었습니다.");
				bool = false;
			}
		}
	}
}
