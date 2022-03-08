package kr.ac.kopo.day01;

public class VariableMain03 {
	public static void main(String[] args) {
		//묵시적형변환
		int a;
		byte b = 10;
		a = b;
		System.out.println(a);
		//명시적형변환
		int c = 5;
		byte d;
		d = (byte)c;
		System.out.println(d);
		//더하기는 큰 수를 따라 묵시적 형변환
		System.out.println(10+20.0);
		System.out.println(10+(int)20.0);
		int e = (int)(10 + 30.5);
		System.out.println(e);
		//상수는 티가 나도록 대문자로 씀
		final int NUM = 100;
		System.out.println(NUM);
		/*
		 * NUM = 20; System.out.println(num);
		 */
		// 역슬래쉬를 사용한 표현
		System.out.println('\\');
		// 경로쓸 때 2번
		String path = "D:\\Lecture\\java-workspace";
		System.out.println(path);
		String str = "\"ab\"";
		System.out.println(str);
	}
}
