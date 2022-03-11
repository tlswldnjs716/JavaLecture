package homework;

import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9 단을 입력 : ");
		int dan = sc.nextInt();
		System.out.printf("*** %d단 *** \n", dan);
		for(int i = 1; i <=9; i++) {
			System.out.println(dan+ " * " + i + " = " + dan*i);
			
		}
	}
}
