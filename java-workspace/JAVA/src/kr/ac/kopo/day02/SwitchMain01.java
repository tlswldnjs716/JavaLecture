package kr.ac.kopo.day02;
//switch�� ���� ���� �� ���
//�ٸ� ����� switch�� �ڹٴ� �ٸ�

import java.util.Scanner;

public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3������ ���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		//default�� �������� ���� 
		default: 
			System.out.println("ERROR");
		
		}
	}
}
	
