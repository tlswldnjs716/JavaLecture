package homeworkteacher01;

import java.util.Scanner;

public class Work10Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι��� ���� : ");
		int num2 = sc.nextInt();
		System.out.print("������ ���� : ");
		int num3 = sc.nextInt();
		int max = num1 > num2 ? num1 : num2;
		int min = num1 > num2 ? num2 : num1;

		if (num3 > max) {
			System.out.printf("%3d%3d%3d\n", num3, max, min);
		} else if (num3 > min) {
			System.out.printf("%3d%3d%3d\n", max, num3, min);
		} else {
			System.out.printf("%3d%3d%3d\n", max, min, num3);
		}
	}
}
