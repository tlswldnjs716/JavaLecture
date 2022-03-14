package kr.ac.kopo.day04;

public class ArrayMain01 {
	public static void main(String[] args) {
		int [] arr;
		//정수 5개를 가지는 배열 생성
		arr = new int[5];
		System.out.println("arr : " + arr);
		
		System.out.println("배열의 총개수: "+ arr.length);
		System.out.println("첫번째 원소: " + arr[0]);
		System.out.println("두번째 원소: " + arr[1]);
		System.out.println("세번째 원소: " + arr[2]);
		System.out.println("네번째 원소: " + arr[3]);
		System.out.println("다섯번째 원소: " + arr[4]);
		
		System.out.println("------------")
		;
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+"번째 원소: " + arr[i]);
//		}
		for(int i= 0; i< arr.length; i++) {
			arr[i] = (i+1)*10;
			System.out.println(i+"번째 원소: " + arr[i]);
		}
		//주소 값 바뀜, 배열은 크기가 정해져 있음!
		//arr = new int[7];
		//System.out.println("arr : " + arr);
	}
}
