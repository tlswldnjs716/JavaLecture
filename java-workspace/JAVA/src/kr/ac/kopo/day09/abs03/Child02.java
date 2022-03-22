package kr.ac.kopo.day09.abs03;

public class Child02 extends Parent{
	String name = "자식2";
	
	@Override
	public void print() {
		System.out.println("Child02::call() 호출...");
	}
	
	public void play() {
		System.out.println("나는 놉니다");
	}
	public void sing() {
		System.out.println("나는 노래 합니다");
	}
	
	
}
