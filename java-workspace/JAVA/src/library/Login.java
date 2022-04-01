package library;

import java.util.Scanner;

public class Login {
		static String id;
		static String passwd;
		//여기서 아이디랑 비밀번호를 받고 회원관리 페이지의 배열에 저장 
		//중복이 없어야 하니까 중복을 허용하지 않는 배열에 저장
		public Login(){
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 입력하세요: ");
			id = sc.nextLine();	
			System.out.print("비밀번호를 입력하세요: ");
			passwd = sc.nextLine();	
		}
}
