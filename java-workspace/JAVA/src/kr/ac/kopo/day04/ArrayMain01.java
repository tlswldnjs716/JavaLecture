package kr.ac.kopo.day04;

public class ArrayMain01 {
	public static void main(String[] args) {
		int [] arr;
		//���� 5���� ������ �迭 ����
		arr = new int[5];
		System.out.println("arr : " + arr);
		
		System.out.println("�迭�� �Ѱ���: "+ arr.length);
		System.out.println("ù��° ����: " + arr[0]);
		System.out.println("�ι�° ����: " + arr[1]);
		System.out.println("����° ����: " + arr[2]);
		System.out.println("�׹�° ����: " + arr[3]);
		System.out.println("�ټ���° ����: " + arr[4]);
		
		System.out.println("------------")
		;
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+"��° ����: " + arr[i]);
//		}
		for(int i= 0; i< arr.length; i++) {
			arr[i] = (i+1)*10;
			System.out.println(i+"��° ����: " + arr[i]);
		}
		//�ּ� �� �ٲ�, �迭�� ũ�Ⱑ ������ ����!
		//arr = new int[7];
		//System.out.println("arr : " + arr);
	}
}
