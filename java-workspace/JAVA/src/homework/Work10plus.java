package homework;

import java.util.Scanner;

//커밋하자
public class Work10plus {
	public static void main(String[] args) {
		// 1번
		int star = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= 5 - star || j >= 5 + star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (i < 5) {
				star++;
			} else {
				star--;
			}
		}
		System.out.println("=========");
		// 2번
		star =1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= star || j >= 10 - star) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (i < 5) {
				star++;
			} else {
				star--;
			}
		}
		// 3번
		System.out.println("3~40라인수를 입력하세요: ");
		// 1번
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		// 이전의 star값을 알 수 없으니까 꼭 초기화하기!!!!
		star = 1;
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (j <= (line+1)/2 - star || j >= (line+1)/2 + star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (i < (line+1)/2) {
				star++;
			} else {
				star--;
			}
		}
		System.out.println("=========");
		// 2번
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (j <= star || j >= (line+1) - star) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (i < (line+1)/2) {
				star++;
			} else {
				star--;
			}
		}
	}
}
