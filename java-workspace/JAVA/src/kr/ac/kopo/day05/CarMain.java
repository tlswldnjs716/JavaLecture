package kr.ac.kopo.day05;

//����Ŭ����
public class CarMain {
	public static void main(String[] args) {
		//heap������ ����
		//c�� stack
		Car c = new Car();
		//���ڿ��� new���� ����
		c.name = "�ҳ�Ÿ";
		c.Company = "����";
		
		Car c2 = new Car();
		c2.name ="K9";
		c2.Company = "���";
		
		System.out.println("ù��° �ڵ����� : " + c.name);
		System.out.println("ù��° �ڵ����� : " + c2.name);
	}
}
