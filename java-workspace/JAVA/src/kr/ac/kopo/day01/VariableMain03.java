package kr.ac.kopo.day01;

public class VariableMain03 {
	public static void main(String[] args) {
		//����������ȯ
		int a;
		byte b = 10;
		a = b;
		System.out.println(a);
		//���������ȯ
		int c = 5;
		byte d;
		d = (byte)c;
		System.out.println(d);
		//���ϱ�� ū ���� ���� ������ ����ȯ
		System.out.println(10+20.0);
		System.out.println(10+(int)20.0);
		int e = (int)(10 + 30.5);
		System.out.println(e);
		//����� Ƽ�� ������ �빮�ڷ� ��
		final int NUM = 100;
		System.out.println(NUM);
		/*
		 * NUM = 20; System.out.println(num);
		 */
		// ���������� ����� ǥ��
		System.out.println('\\');
		// ��ξ� �� 2��
		String path = "D:\\Lecture\\java-workspace";
		System.out.println(path);
	}
}
