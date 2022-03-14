package kr.ac.kopo.day03.exam;

public class ExamMain01 {

	public static void main(String[] args) {
		//조건없으면 무한루프
		for(int i= 1; i<=10;i++) {
			System.out.println("hello");
		}
		
		/*
		 * for(int i =10; i<10; i--) { System.out.println("bye"); }
		 */
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		for(int i=1; i<=5; i++) {
			System.out.println("*");
		}
		
		System.out.println("=========");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========");
		for (int j = 1; j <= 5; j++) {
				System.out.print(6-j);
			}
		}
	}
