package kr.ac.kopo.day09.abs03;

public class Child01 extends Parent{
	String name = "자식01";
	
	@Override
	public void print() {
		System.out.println("Child01::call() 호출...");
	}
	
	public void study() {
		System.out.println("나는 공부를 합니다");
	}
	public void sleep() {
		System.out.println("나는 잠을 잡니다");
	}
}
