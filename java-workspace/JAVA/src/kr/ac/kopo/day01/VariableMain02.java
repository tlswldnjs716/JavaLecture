package kr.ac.kopo.day01;

public class VariableMain02 {
	/*
	기본 자료형 제외 모두 참조 자료형
	문자열 저장, 클래스 사용, 참조형
	String str ="Hello";
	String만 new 안 쓸 수 있음
	 */
	public static void main(String[] args) {
	String str = new String("Hello");
	//str 주소 찍으려면 해시코드찍기
	System.out.println(str);
	}
}
