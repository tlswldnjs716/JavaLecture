package homework;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - 100 ������ ������ �Է� : ");
		int number = sc.nextInt();
		System.out.print("2 - 10 ������ ������ �Է� : ");
		int twototen = sc.nextInt();
		
		System.out.println("< 1 ~ " +number+" ������ " +twototen +"�� ����� ������ ���� ���>");
		for (int i = 1; i <= number; i++) {
			if (i % twototen == 0) {
				System.out.print("");
			} else {
				System.out.print(i+" ");
			}
		}
	}
}
