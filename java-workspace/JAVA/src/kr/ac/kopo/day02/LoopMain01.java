package kr.ac.kopo.day02;

public class LoopMain01 {
	public static void main(String[] args) {
		System.out.println("hi");
		int i = 1;
		while(i<=5) {
			System.out.println("Hello");
			++i;
		}
		// for������ ������ ������ for�������� ��밡��
		for(int cnt =1; cnt<=5; ++cnt) {
			System.out.println("Hello");
		}
	}
}
