package kr.ac.kopo.day09.abs03;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	
	public String select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG  3.HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	private void print(String type) {
		switch(type) {
		case "1" :
			//묵시적 형변환
			//print()가 오버라이딩 되어있어서 사용가능
			Printer lg = new LGPrinter();
			lg.print();
			break;
		case "2" : 
			Printer sam = new SamsungPrinter();
			sam.print();
			break;
		case "3" : 
			Printer hp = new HPPrinter();
			hp.print();
//			hp.hpPrint();
			break;
		}
	}
	
	public void process() {

		String type = select();
		print(type);
	}

	
}
