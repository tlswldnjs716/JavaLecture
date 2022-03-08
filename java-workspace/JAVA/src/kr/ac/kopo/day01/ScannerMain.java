package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {
		//문자입력 코드는 없음, nextChar없음
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.println("a: "+a);
		
		System.out.println("문자열을 입력: ");
		String str = sc.nextLine();
		//엔터 말고 다른 문자 입력받기
		str = sc.nextLine();
		System.out.println("문자열: " +str);
		
		System.out.print("문자를 입력: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("문자: " +ch);
	}
}
