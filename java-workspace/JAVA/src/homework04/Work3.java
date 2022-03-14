package homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		int i = 1;
		int num = 0;
		int [] fivenumber = new int[5];
		do {
			System.out.print(i + "'s Á¤¼ö : ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			if (num % 2 == 0) {
				i++;
				System.out.println(i-1);
				fivenumber[i-1] = num;
			}
		} while (i <= 5);

		System.out.println(Arrays.toString(fivenumber));
	}
}
