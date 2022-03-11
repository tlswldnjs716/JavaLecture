package homework;

import java.util.Scanner;

public class Work01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1-100사이의 정수를 입력 : ");
		int number = sc.nextInt();
		System.out.println();
		System.out.println("<1~" +number+ "정수 출력>");
		for (int i=1; i<=number; i++) {
			System.out.printf("%d ",i);	
		}
	}
}
