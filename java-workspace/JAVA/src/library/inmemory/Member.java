package library.inmemory;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	private String ID;
	private String PW;
	
	public Member() {
		
	}
	
	public Member(String ID, String PW) {
		this.ID = ID;
		this.PW = PW;
	}
	//아이디 받기&설정
	public String getId(){
		return ID;
	}
	public void setId(String id) {
		this.ID = id;
	}
	//비밀번호 받기&설정
	public String getPw(){
		return PW;
	}
	public void setPw(String pw) {
		this.PW = pw;
	}
}
