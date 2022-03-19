package homework06;

import java.util.Scanner;

class Calculator {
	Calculator(double num1, double num2){
		System.out.printf("%.0f + %.0f = %.0f \n", num1, num2, num1+num2);
		System.out.printf("%.0f - %.0f = %.0f \n", num1, num2, num1-num2);
		System.out.printf("%.0f * %.0f = %.0f \n", num1, num2, num1*num2);
		System.out.printf("%.0f / %.0f = %.1f \n", num1, num2, num1/num2);
	}
	Calculator(double number){
		System.out.printf("%.0f 소수체크 : ", number);
		for(int i=2; i <number; i++) {
			if (number % i == 0) {
				System.out.println("false");
				break;
			}
			else {
				System.out.println("true");
				break;
			}
		}
	}
}
public class Work02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.print("정수 : ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println();
		Calculator cal = new Calculator(num1, num2);
		System.out.println();
		Calculator check = new Calculator(num1);
		Calculator check2 = new Calculator(num2);
	}
}
