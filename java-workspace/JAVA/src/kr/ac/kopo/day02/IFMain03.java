package kr.ac.kopo.day02;
//������ �ʿ���� ���

//else if

import java.util.Scanner;

public class IFMain03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ����� �ð��� �Է��ϼ���(7��30�� : 730) => ");
		int time = sc.nextInt();

		if (time < 815) {
			if (time < 800) {
				System.out.println("�ɾ��");
			} else {
				System.out.println("������ ź��");
			}
		} else {
			System.out.println("�ýø� ź��");
		}

		//if���� ���� �� ����ϱ�!
		//���� if_���ӵǾ� ���� ���� ��ó�� ���̵��� ��, ����ó��
		//�ؼ��� ����if�� ��øif ����
		if (time < 800) {
			System.out.println("�ɾ �б��� ����");
		} else if (time < 815) {
			System.out.println("������ Ÿ�� �б��� ����");
		} else {
			System.out.println("�ýø� Ÿ�� �б��� ����");
		}

		//��ø�� if
		if (time < 800) {
			System.out.println("�ɾ �б��� ����");
		} else {
			if (time < 815) {
				System.out.println("������ Ÿ�� �б��� ����");
			} else {
				System.out.println("�ýø� Ÿ�� �б��� ����");
			}
		}
	}

}
