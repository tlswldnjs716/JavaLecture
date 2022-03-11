package kr.ac.kopo.day02;
//switch는 동등 비교일 때 사용
//다른 언어의 switch와 자바는 다름

import java.util.Scanner;

public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		//default는 마지막에 실행 
		default: 
			System.out.println("ERROR");
		
		}
	}
}
	
