package homework;

import java.util.Scanner;

public class Work6 {
	public static void main(String[] args) {
		System.out.print("���۴��� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.print("������� �Է� : ");
		int end = sc.nextInt();
		if(start<end)
		for(int i = start; i <=end ; i++) {
			System.out.printf("*** %d�� *** \n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d \n", i,j, i*j);
			}
			System.out.println();
		
		}
		if(end<start)
			for(int i = end; i <=start ; i++) {
				System.out.printf("*** %d�� *** \n", i);
				for(int j=1; j<=9; j++) {
					System.out.printf("%d * %d = %d \n", i,j, i*j);
				}
				System.out.println();
			
			}
	}
}
