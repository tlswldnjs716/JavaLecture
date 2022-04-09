package filelib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class MemberUtil implements MemberInterface{
	
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Member> memberList = new ArrayList<Member>();
	
	private String loginedId; //현재 로그인 된 아이디
	private String loginedPwd; //현재 로그인 된 pwd
	
	public String getLoginedId() {
		return loginedId;
	}
	public void setLoginedId(String loginedId) {
		this.loginedId = loginedId;
	}
	
	@Override
	public void signUp() {
		System.out.println("<< 회원 가입 >>");
		
		FileReader fr = null;
		BufferedReader br = null;
	
		try {
			Member member = new Member();
			
			System.out.print("아이디 :");
			String ID = sc.nextLine();
	
			fr = new FileReader("librarydata/memberlist");
			br = new BufferedReader(fr);
					
			String line = "";
			boolean registered = false;
			
			while((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				if(ID.equals(temp[0])) {
					System.out.println("이미 등록된 아이디입니다.");
					registered = true;
					break;
				}
			}
			
			if(!registered) {
				System.out.print("패스워드 : ");
				String PW = sc.nextLine();
				
				member.setId(ID);
				member.setPwd(PW);
				
				memberList.add(member);
				FileWriter fw;
				
				try {
					
					fw = new FileWriter("librarydata/memberlist", true);
					
					System.out.println();
					
					for(Member m : memberList) {
						fw.write(m.getId() + "," + m.getPwd() +"\n");	
					}
					
					fw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("가입이 완료되었습니다!");
			}
			
		br.close();	
		} catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}
	@Override
	public void login(){
		FileReader fr = null;
		
		try {
			
		System.out.println("<< 로그인 >>");	
		System.out.println("아이디 : ");
		String ID = sc.nextLine();
		System.out.println("비밀번호 : ");
		String PW = sc.nextLine();
		
		fr = new FileReader("librarydata/memberlist");
		br = new BufferedReader(fr);
		String line = "";
		boolean registered = false;
		
		while((line = br.readLine()) != null) {
			String[] temp = line.split(",");
			if(ID.equals(temp[0]) && PW.equals(temp[1])) {
				loginedId = ID;
				loginedPwd = PW;
				registered = true;
				
				break;
			
			}
		}
		
		if(!registered) {
			System.out.println("등록된 아이디가 아닙니다.");
			loginedId = "";
		}
		
		}catch(Exception e){
			
		}
	}
}