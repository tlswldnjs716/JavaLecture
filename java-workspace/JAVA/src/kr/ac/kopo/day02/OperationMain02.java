package kr.ac.kopo.day02;

import java.util.Scanner;
//booleanȰ��
/*a�Է� : 10
b�Է� : 3
10�� 3�� ����ΰ�?
*/
		
public class OperationMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a �Է� : ");
		int a = sc.nextInt();
		
		System.out.print("b �Է� : ");
		int b = sc.nextInt();
		
		boolean result = (b !=0 && a % b == 0);
		
		System.out.printf("%d�� %d�� ����ΰ�? %b /n" , a, b, result);
	}
}
