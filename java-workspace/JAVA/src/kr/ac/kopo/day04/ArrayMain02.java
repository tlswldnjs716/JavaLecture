package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String[] args) {
//		String[] strArr = {"�����ͺм�", "�ڹ�", "����"};
		String[] strArr = new String[5];
		int loc = 0;
		strArr[loc++]="������";
		strArr[loc++]="�����ͺм�";
		strArr[loc++]="�ڹ�";
		strArr[loc++]="����";
		
		System.out.println("< index�� �̿��� ��� >");
		for(int i=0; i< strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println();
		
		//���� ������Ʈ
		for(String s: strArr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//���̺귯�� �̿�
		//Arrays.toString()�޼ҵ� �̿�
		//�迭 ��ҵ��� ��� ���ڿ� �Ѱ��� ����
		String result = Arrays.toString(strArr);
		System.out.print(result);
		
		
		
		
		
		
		
//		System.out.println("ù��°: "+ strArr[0]);
//		System.out.println("�ι�°: "+ strArr[1]);
//		System.out.println("����°: "+ strArr[2]);
	}
}
