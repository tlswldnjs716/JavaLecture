package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String[] args) {
//		String[] strArr = {"데이터분석", "자바", "교육"};
		String[] strArr = new String[5];
		int loc = 0;
		strArr[loc++]="폴리텍";
		strArr[loc++]="데이터분석";
		strArr[loc++]="자바";
		strArr[loc++]="교육";
		
		System.out.println("< index를 이용한 출력 >");
		for(int i=0; i< strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println();
		
		//버전 업데이트
		for(String s: strArr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//라이브러리 이용
		//Arrays.toString()메소드 이용
		//배열 요소들은 모두 문자열 한개로 만듦
		String result = Arrays.toString(strArr);
		System.out.print(result);
		
		
		
		
		
		
		
//		System.out.println("첫번째: "+ strArr[0]);
//		System.out.println("두번째: "+ strArr[1]);
//		System.out.println("세번째: "+ strArr[2]);
	}
}
