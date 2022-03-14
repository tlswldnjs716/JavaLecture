package kr.ac.kopo.day04;

public class ArrayMain03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("< PRINT>");
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]+ "\t");
		}
		/*
		 * int data =1; System.out.println(); for(int num: arr) { num = data++; }
		 */
	}
	
}
