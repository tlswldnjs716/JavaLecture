package kr.ac.kopo.day02;

public class LoopMain01 {
	public static void main(String[] args) {
		System.out.println("hi");
		int i = 1;
		while(i<=5) {
			System.out.println("Hello");
			++i;
		}
		// for문에서 선언한 변수는 for문에서만 사용가능
		for(int cnt =1; cnt<=5; ++cnt) {
			System.out.println("Hello");
		}
	}
}
