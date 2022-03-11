package homework;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int number = sc.nextInt();
		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int twototen = sc.nextInt();
		
		System.out.println("< 1 ~ " +number+" 사이의 " +twototen +"의 배수를 제외한 정수 출력>");
		for (int i = 1; i <= number; i++) {
			if (i % twototen == 0) {
				System.out.print("");
			} else {
				System.out.print(i+" ");
			}
		}
	}
}
