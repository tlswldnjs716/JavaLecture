package homework8;

import java.util.Scanner;

public class Choose {
	private Scanner sc = new Scanner(System.in);
	
	public int select() {
		System.out.print("원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) =>");
		int choose = Integer.parseInt(sc.nextLine());
		return choose;
	}
	public void choosemenu(int choose) {
		switch(choose) {
		case 1 :
			//LGPrinter lg = new LGPrinter();
			//lg.print();
			break;
		case 2 : 
			//SamsungPrinter sam = new SamsungPrinter();
			//sam.print();
			break;
		case 3 : 
			
		}
	}
	public void process() {

		int choose = select();
		choosemenu(choose);
	}
	
}
