package homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {
		int i = 0;
		int [] fivenumber = new int[5];
		do {
			System.out.print((i+1) + "'s 정수 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			fivenumber[i++] = num;
			if (num > fivenumber[i]) {
				fivenumber[i] = num;
				System.out.println(fivenumber[i]);
			}
			else {
				System.out.println(Arrays.toString(fivenumber)+ "보다 큰수가 와야합니다");
			}
			} while (i < 5);
		/*
		 * 틀린답
		do {
			System.out.print((i+1) + "'s 정수 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num > fivenumber[i]) {
				++i;
				fivenumber[i] = num;
				System.out.println(fivenumber[i]);
			}
			else {
			System.out.println(Arrays.toString(fivenumber)+ "보다 큰수가 와야합니다");
			}
			} while (i < 5);
			*/
		
		//교수님 답
		/*
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		for(int i = 0; i < nums.length;) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				System.out.println(msg + "보다 큰수여야합니다");
			} else {
				msg += nums[i++] + " ";
			}
		}
		*/
		
		/*
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				for(int j = 0; j < i; j++) {
					System.out.print(nums[j] + " ");
				}
				System.out.println("보다 큰수여야합니다");
				i--;
			}
		}
		*/
		/*
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >= 0; i--) {
			// nums[i] = 25 ==> 52
			int n10 = nums[i] / 10;
			int n1  = nums[i] % 10;
			System.out.print(n1*10 + n10 + "\t");
		}
		System.out.println();
		*/

	}

}
