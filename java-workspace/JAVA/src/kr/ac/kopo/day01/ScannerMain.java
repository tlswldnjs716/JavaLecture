package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {
		//�����Է� �ڵ�� ����, nextChar����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int a = sc.nextInt();
		System.out.println("a: "+a);
		
		System.out.println("���ڿ��� �Է�: ");
		String str = sc.nextLine();
		//���� ���� �ٸ� ���� �Է¹ޱ�
		str = sc.nextLine();
		System.out.println("���ڿ�: " +str);
		
		System.out.print("���ڸ� �Է�: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("����: " +ch);
	}
}
