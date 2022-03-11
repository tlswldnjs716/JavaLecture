package kr.ac.kopo.day03.exam;

public class Loopexercise {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i =1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i =1; i <=5; i++) {
			for (int j = i; j <= 4+i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i =5; i >=1; i--) {
			for (int j = i; j <= i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i =1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i =1; i <=5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i =1; i <=5; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(' ');
			}
			for(int j =1; j <= 6-i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		//¹æ¹ý2
		System.out.println("=====");
		for(int i =1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j<i) {
					System.out.print(' ');
				}else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		System.out.println("=====");
		for(int i =1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j<=5-i) {
					System.out.print(' ');
				}else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i =1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=1; j<=10-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

