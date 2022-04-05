package inmemorylib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberUtil implements MemberInterface {
	Scanner sc = new Scanner(System.in);
	List<Member> memberList = new ArrayList<Member>();

	public List<Member> getMemberList() {
		return memberList;
	}

	// 로그인 된 아이디
	private static String loginedId;
	// 로그인 된 pwd
	private String loginedPw;

	static public String getLoginedId() {
		return loginedId;
	}

	public void setLoginedId(String loginedId) {
		this.loginedId = loginedId;
	}

	@Override
	public void signUp() {
		System.out.println("========= 회원 가입 =========");

		Member member = new Member();

		System.out.print("아이디 :");
		String ID = sc.nextLine();

		boolean registered = false;

		if (ID != null) {
			for (Member memberlist : memberList) {
				if (ID.equals(memberlist.getId())) {
					System.out.println("이미 등록된 아이디입니다.");
					// 사용중 표시
					registered = true;
					break;
				}
			}
		}

		// 사용
		if (!registered) {
			System.out.print("패스워드 : ");
			String PW = sc.nextLine();
			member.setId(ID);
			member.setPw(PW);

			memberList.add(member);
			System.out.println("회원 가입이 완료되었습니다. 로그인 해주세요.");
		}
	}

	@Override
	public void login() {
		System.out.println("==== 로그인 ====");
		System.out.println("아이디 : ");
		String ID = sc.nextLine();
		System.out.println("비밀번호 : ");
		String PW = sc.nextLine();
		boolean registered = false;

		Member member = new Member(ID, PW);
		// 멤버인지 확인
		if (member != null) {
			for (Member memberlist : memberList) {
				if (ID.equals(memberlist.getId()) && PW.equals(memberlist.getPw())) {
					loginedId = ID;
					loginedPw = PW;
					// 사용중
					registered = true;
					break;
				}
			}
		}

		// 회원가입, 사용등록
		if (!registered) {
			System.out.println("회원가입을 먼저 해주세요.");
			loginedId = "";
		}
	}

	@Override
	public void signOut() {
		System.out.println("==== 회원탈퇴 ====");
		System.out.println("아이디 : ");
		String ID = sc.nextLine();
		System.out.println("비밀번호 : ");
		String PW = sc.nextLine();
		boolean registered = false;

		Member member = new Member(ID, PW);
		// 멤버인지 확인
		if (member != null) {
			for (Member memberlist : memberList) {
				if (ID.equals(memberlist.getId()) && PW.equals(memberlist.getPw())) {
					loginedId = ID;
					loginedPw = PW;
					// 사용중
					registered = true;
					memberList.remove(memberlist);
					System.out.println("탈퇴되었습니다");
					System.out.println("<< 삭제 후 전체 회원 목록 >>");
					printMemberList(memberList);
					break;
				}
			}
		}
		// 회원가입, 사용등록
		if (!registered) {
			System.out.println("없는 아이디입니다");
			loginedId = "";
		}

	}

	// 멤버목록출력
	public void printMemberList(List<Member> memberList) {
		System.out.println("멤버 목록");
		for (Member member : memberList) {
			System.out.println(member.getId() + "\t" + member.getPw());
		}
	}
}
