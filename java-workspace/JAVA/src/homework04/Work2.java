package homework04;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		//�Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		//�迭�� ����
		int [] tennumber = new int[10];
		for(int i=0; i<tennumber.length; i++)
		{
			System.out.printf("%d's num : ", i+1);
			tennumber[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("< ¦�� >");
		
		int hap = 0;
		for(int i=0; i<tennumber.length; i++)
		{
			if(tennumber[i]%2==0) {
			System.out.print(tennumber[i]+" ");
			hap += tennumber[i];
			}
		}
		System.out.println();
		System.out.printf("¦���� ���� : %d",hap);
		
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
		System.out.printf("Ȧ���� ���� : %d",hap);
	}
}
