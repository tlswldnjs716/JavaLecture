package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 70, 30};
		//int[] copy = arr; // shallow copy
		int[] copy = new int[arr.length];
		for(int i = 0;i < arr.length; i++) {
			copy[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		copy[2]=100;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
	}
}
