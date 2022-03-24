package homework07;

import java.util.Scanner;

public class StringUtil {
	//입력받는 char ch
	char put() {
		System.out.print("문자 한개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		return ch;
	}
	//입력 스트링
	String Str() {
		System.out.print("문자열을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String strData = sc.nextLine();
		return strData;
	}
	//checkchar
	//공통으로 쓰이는 함수
	public static int check(String strData, char ch) {
		int count = 0;
		for(int i = 0; i<strData.length(); i++) {
			if(strData.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	//remove
	public static String removeChar(String oriStr, char delChar) {
		String newStr = "";
		for(int i = 0; i<oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar) {
				newStr += oriStr.charAt(i);
			}
		}
		return newStr;
	}
	
}
