package homework;

import java.util.Scanner;

public class Work6 {
	public static void main(String[] args) {
		System.out.print("시작단을 입력 : ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.print("종료단을 입력 : ");
		int end = sc.nextInt();
		if(start<end)
		for(int i = start; i <=end ; i++) {
			System.out.printf("*** %d단 *** \n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d \n", i,j, i*j);
			}
			System.out.println();
		
		}
		if(end<start)
			for(int i = end; i <=start ; i++) {
				System.out.printf("*** %d단 *** \n", i);
				for(int j=1; j<=9; j++) {
					System.out.printf("%d * %d = %d \n", i,j, i*j);
				}
				System.out.println();
			
			}
	}
}
