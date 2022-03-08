package kr.ac.kopo.day01;

public class PrintMain {

	public static void main(String[] args) {
		System.out.println(5>3);
		System.out.println("gotohome");
		System.out.println("눈누난나");
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(23 + '살');
		System.out.println(23 + "살");
//		%d정수, %f실수, %c문자, %s문자열, %b논리값
//		' ' 스페이스 표기, \n 엔터, \t 탭
		System.out.printf("%d살 \n", 23);
		System.out.printf("%d + %d =%d \n", 10, 20, 10+20);
//		자리수 매핑 %7d -%7d
		System.out.printf("[%7d] \n", 100);
		System.out.printf("[%7d] \n", 1000);
		System.out.printf("[%7d] \n", 10000);
//		소수점 자르기, 올림
		System.out.printf("[%.2f] \n", 278.899);
		System.out.printf("%b",true);
	}

}