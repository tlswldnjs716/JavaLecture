package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		int a = 1, b = 0, c = -1;
		//boolean bool = ++a > 1 || ++b >1;
		//&&가 ||다 우선순위 먼저
		boolean bool = --a > 1 && ++b > 1 || ++c > 0;
		
		//앞의 연산만 수행하기 때문에 b값이 0
		System.out.println("bool: " + bool);
		System.out.println("a : " + a + ", b: " + b+ ", c: " + c);


	}

}
