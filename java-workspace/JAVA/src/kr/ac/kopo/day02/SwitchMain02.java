package kr.ac.kopo.day02;

public class SwitchMain02 {
	public static void main(String[] args) {
		String a = new String("Hello");
		
		//�ּұ� ������ false
		//���ڿ� �񱳴� ����� ������ �Ұ�
		System.out.println(a == "Hello");
		
		//����ġ�� ����ϸ� equals���� ����
		String str = new String("Hello");
		switch(str) {
		case "Hello":
			System.out.println("TRUE");
			break;
		default:
			System.out.println("FALSE");
		}
	}
}
