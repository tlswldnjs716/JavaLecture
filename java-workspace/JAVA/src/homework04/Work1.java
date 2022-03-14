package homework04;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		//입력받기
		Scanner sc = new Scanner(System.in);
		//배열에 저장
		int [] fivenumber = new int[5];
		for(int i=0; i<fivenumber.length; i++)
		{
			System.out.printf("%d's num : ", i+1);
			fivenumber[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("< PRINT >");
		
		//버전 업데이트를 활용해 출력
		for(int number: fivenumber) {
			System.out.print(number+" ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("총합 : ");
		int hap = 0;
		for(int i=0; i<fivenumber.length; i++)
		{
			hap += fivenumber[i];
		}
		System.out.println(hap);
		
		
	}
}

