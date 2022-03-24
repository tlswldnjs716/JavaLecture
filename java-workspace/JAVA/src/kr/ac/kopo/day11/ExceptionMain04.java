package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain04 {
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
		//멀티 캐치, 여러개의 에러 잡음
		//묵시적 형변환
		//Exception e = new 에러();
		catch(Exception e) {
			System.out.println("예외처리: "+e.getMessage());
			//어디서 에러가 났는지 알려줌
			e.printStackTrace();
		}
	}

}
