package homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {
		int i = 0;
		int [] fivenumber = new int[5];
		do {
			System.out.print((i+1) + "'s ���� : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			fivenumber[i++] = num;
			if (num > fivenumber[i]) {
				fivenumber[i] = num;
				System.out.println(fivenumber[i]);
			}
			else {
				System.out.println(Arrays.toString(fivenumber)+ "���� ū���� �;��մϴ�");
			}
			} while (i < 5);
		/*
		 * Ʋ����
		do {
			System.out.print((i+1) + "'s ���� : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num > fivenumber[i]) {
				++i;
				fivenumber[i] = num;
				System.out.println(fivenumber[i]);
			}
			else {
			System.out.println(Arrays.toString(fivenumber)+ "���� ū���� �;��մϴ�");
			}
			} while (i < 5);
			*/
		
		//������ ��
		/*
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		for(int i = 0; i < nums.length;) {
			System.out.print(i+1 + "��° ���� �Է� : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				System.out.println(msg + "���� ū�������մϴ�");
			} else {
				msg += nums[i++] + " ";
			}
		}
		*/
		
		/*
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i+1 + "��° ���� �Է� : ");
			nums[i] = sc.nextInt();
			if(i > 0 && nums[i] < nums[i-1]) {
				for(int j = 0; j < i; j++) {
					System.out.print(nums[j] + " ");
				}
				System.out.println("���� ū�������մϴ�");
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
