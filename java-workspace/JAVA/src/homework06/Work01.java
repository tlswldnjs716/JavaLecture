package homework06;

import java.util.Arrays;
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
	void reverseString( String str) {
		int loc = 0;
		//배열선언
		char[] words = new char[str.length()];
		for(int i = str.length()-1; i >= 0; i--) {
			words[loc++] = str.charAt(i);
		}
		//문자열을 출력
		for(char reversestr : words) {
			System.out.print(reversestr);
		}
	}
	
	//문자열 대문자 변경
	void toUpperString( String str) {
		int loc = 0;
		//배열선언
		char[] words = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			words[loc++] = str.charAt(i);
			if(words[i] >= 97 && words[i] <= 122) {
				 words[i] = (char) (str.charAt(i) - 32);
			}
		}
		for(char upperstr : words) {
			System.out.print(upperstr);
		}
	}
	
	//문자열 소문자 변경
		void toLowerString( String str) {
			int loc = 0;
			//배열선언
			char[] words = new char[str.length()];
			for(int i = 0; i < str.length(); i++) {
				words[loc++] = str.charAt(i);
				if(words[i] >= 65 && words[i] <= 90) {
					 words[i] = (char) (str.charAt(i) + 32);
				}
			}
			for(char upperstr : words) {
				System.out.print(upperstr);
			}
		}
	
}
public class Work01 {
	public static void main(String[] args) {
		//객체생성
		StringUtil ch = new StringUtil();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		//문자 입력
		char A = sc.nextLine().charAt(0);
		//객체가 메소드 호출
		boolean getch = ch.isUpperChar(A);
		System.out.println(getch);
		System.out.print("문자를 입력하세요: ");
		//문자입력
		char a = sc.nextLine().charAt(0);
		boolean getch2 = ch.isLowerChar(a);
		System.out.println(getch2);
		
		System.out.print("숫자를 입력하세요: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자를 입력하세요: ");
		int num2 = Integer.parseInt(sc.nextLine());
		int maxnum = ch.max(num1, num2);
		int minnum = ch.min(num1, num2);
		System.out.print("큰 숫자: ");
		System.out.println(maxnum);
		System.out.print("작은 숫자: ");
		System.out.println(minnum);

		System.out.print("문자열을 입력하세요: ");
		String newstr = sc.nextLine();
		ch.reverseString(newstr);
		System.out.println();
		
		System.out.print("문자열을 입력하세요: ");
		String newstr2 = sc.nextLine();
		ch.toUpperString(newstr2);
		System.out.println();
		
		System.out.print("문자열을 입력하세요: ");
		String newstr3 = sc.nextLine();
		ch.toLowerString(newstr3);
	}
}
