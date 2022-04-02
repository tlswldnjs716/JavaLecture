package library;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberUtil  implements MemberInterface{
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> memberList = new ArrayList<Member>();
	
	//현재 로그인 된 아이디
	private String loginedId; 
	//현재 로그인 된 pwd
	private String loginedPw; 

	public String getLoginedId() {
		return loginedId;
	}
	
	public void setLoginedId(String loginedId) {
		this.loginedId = loginedId;
	}
	
	@Override
	public void signUp() {
		System.out.println("========= 회원 가입 =========");
		
		Member member = new Member();
		//등록전
		boolean registered = false;
		
		//등록
		if(!registered) {
			System.out.print("아이디 :");
			String ID = sc.nextLine();
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
		//로그인을 하기 전
		boolean login = false;
		
		Member member = memberCheck(ID, PW);
		if(member != null) {
			loginedId = ID;
			loginedPw = PW;
			//로그인됨
			login = true;
			System.out.println("로그인되었습니다");
		}		
		
		//login이 되지 않는 상황
		if(!login) {
			System.out.println("회원가입을 먼저 해주세요.");
			loginedId = "";
		}
	}

	@Override
	public void signOut() {
		// TODO Auto-generated method stub
		
	}
	
	//일치확인 
		public Member memberCheck(String ID, String PW) {
			for(Member member: memberList) {
				if(ID.equals(member.getId())&&PW.equals(member.getPw())){
				return member;
				}
			}
			return null;
		}
		//중복체크 
		public void doubleCheck(String ID, String PW) {
			String warning  = "이미 등록된 아이디입니다. 다른 아이디를 사용하세요.";
			for(Member member: memberList) {
				if(ID.equals(member.getId())){
					System.out.println(warning);
				}
			}
		}

}
