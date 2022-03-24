package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain03 {
	public static void main(String[] args) {
		System.out.println("main start...");
		Random r = new Random();
		int num = r.nextInt(3);//0,1,2
		System.out.println("num : "+num);
		try {
		System.out.println(10/num);
		String str = "hello";
		System.out.println("str : " + str);
		System.out.println(str.charAt(10));
		}
		catch(ArithmeticException ae) {
			System.out.println("예외발생: "+ae.getMessage());
			//어디서 에러가 났는지 알려줌
			ae.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException : " + se.getMessage());
		}
		System.out.println("main end...");
	}

}
