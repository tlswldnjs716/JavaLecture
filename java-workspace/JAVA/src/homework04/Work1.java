package homework04;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		//�Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		//�迭�� ����
		int [] fivenumber = new int[5];
		for(int i=0; i<fivenumber.length; i++)
		{
			System.out.printf("%d's num : ", i+1);
			fivenumber[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("< PRINT >");
		
		//���� ������Ʈ�� Ȱ���� ���
		for(int number: fivenumber) {
			System.out.print(number+" ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("���� : ");
		int hap = 0;
		for(int i=0; i<fivenumber.length; i++)
		{
			hap += fivenumber[i];
		}
		System.out.println(hap);
		
		
	}
}

