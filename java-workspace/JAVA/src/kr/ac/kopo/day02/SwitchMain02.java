package kr.ac.kopo.day02;

public class SwitchMain02 {
	public static void main(String[] args) {
		String a = new String("Hello");
		
		//주소기 때문에 false
		//문자열 비교는 동등비교 연산자 불가
		System.out.println(a == "Hello");
		
		//스위치를 사용하면 equals없이 가능
		String str = new String("Hello");
		switch(str) {
		case "Hello":
			System.out.println("TRUE");
			break;
		default:
			System.out.println("FALSE");
		}
	}
}
