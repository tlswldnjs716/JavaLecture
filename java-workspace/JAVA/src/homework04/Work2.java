package homework04;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		//ÀÔ·Â¹Ş±â
		Scanner sc = new Scanner(System.in);
		//¹è¿­¿¡ ÀúÀå
		int [] tennumber = new int[10];
		for(int i=0; i<tennumber.length; i++)
		{
			System.out.printf("%d's num : ", i+1);
			tennumber[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("< Â¦¼ö >");
		
		int hap = 0;
		for(int i=0; i<tennumber.length; i++)
		{
			if(tennumber[i]%2==0) {
			System.out.print(tennumber[i]+" ");
			hap += tennumber[i];
			}
		}
		System.out.println();
		System.out.printf("Â¦¼öÀÇ ÃÑÇÕ : %d",hap);
		
		System.out.println();
		System.out.println();
		
		hap = 0;
		for(int i=0; i<tennumber.length; i++)
		{
			if(tennumber[i]%2!=0) {
			System.out.print(tennumber[i]+" ");
			hap += tennumber[i];
			}
		}
		System.out.println();
		System.out.printf("È¦¼öÀÇ ÃÑÇÕ : %d",hap);
	}
}
