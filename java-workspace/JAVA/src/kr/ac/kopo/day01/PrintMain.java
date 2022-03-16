package kr.ac.kopo.day01;

public class PrintMain {

	public static void main(String[] args) {
		System.out.println(5>3);
		System.out.println("gotohome");
		System.out.println("��������");
		System.out.println('A');
		System.out.println("Hello");
		//System.out.println(23 + '��');
		System.out.println(23 + "��");
//		%d����, %f�Ǽ�, %c����, %s���ڿ�, %b����
//		' ' �����̽� ǥ��, \n ����, \t ��
		System.out.printf("%d�� \n", 23);
		System.out.printf("%d + %d =%d \n", 10, 20, 10+20);
//		�ڸ��� ���� %7d -%7d
		System.out.printf("[%7d] \n", 100);
		System.out.printf("[%7d] \n", 1000);
		System.out.printf("[%7d] \n", 10000);
//		�Ҽ��� �ڸ���, �ø�
		System.out.printf("[%.2f] \n", 278.899);
		System.out.printf("%b",true);
	}

}