package homework06;

import java.util.Scanner;

class StringUtil{
	
	//대문자 판별 
	boolean isUpperChar(char c) {
		if(65 <= c && c <= 90) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//소문자 판별
	boolean isLowerChar(char c) {
		if(97 <= c && c <= 122) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//큰수 반환
	int max(int i, int j) {
		if(i>j) {
			return i;
		}
		else {
			return j;
		}
	}
	
	// 작은수 반환
	int min(int i, int j) {
		if (i < j) {
			return i;
		} else {
			return j;
		}
	}

	// 문자열 거꾸로 변경

	
}
public class Work01 {
	public static void main(String[] args) {
		System.out.print("문자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		char A = sc.nextLine().charAt(0);
		//객체생성
		StringUtil ch = new StringUtil();
		//객체가 메소드 호출
		boolean getch = ch.isUpperChar(A);
		boolean getch2 = ch.isLowerChar(A);
		System.out.println(getch);
		System.out.println(getch2);
		
		System.out.print("숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		int maxnum = ch.max(num1, num2);
		int minnum = ch.min(num1, num2);
		System.out.print("큰 숫자: ");
		System.out.println(maxnum);
		System.out.print("작은 숫자: ");
		System.out.println(minnum);
	}
}
