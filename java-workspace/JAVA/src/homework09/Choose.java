package homework09;

import java.util.Scanner;

public class Choose {
	public static int getyear;
	public static int getmonth;
	private Scanner sc = new Scanner(System.in);
	
	public int select() {
		System.out.print("원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) =>");
		int choose = Integer.parseInt(sc.nextLine());
		return choose;
	}
	public void choosemenu(int choose) {
		switch(choose) {
		case 1 :
			System.out.print("년도를 선택하세요 :");
			Year newyear = new Year();
			getyear = Integer.parseInt(sc.nextLine());
			newyear.print();
			break;
		case 2 : 
			System.out.print("년도를 선택하세요 :");
			getyear = Integer.parseInt(sc.nextLine());
			System.out.print("월을 선택하세요 : ");
			getmonth = Integer.parseInt(sc.nextLine());//범위가 0부터
			Month newmonth = new Month();
			newmonth.print();
			//sam.print();
			break;
		case 3 : 
			System.out.println("종료");
		}
	}
	public void process() {
		while(true) {
		int choose = select();
		choosemenu(choose);
		if(choose == 3) {
			//패키지가 다르니까 exit는 public
			System.exit(0);
			//프로그램을 완전 종료하고 싶을 때 System.exit(0);
		}
		}
	}
	
}
