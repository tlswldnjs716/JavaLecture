package homework07;

import java.util.Scanner;

public class IcecreamMain {
	public static void main(String[] args) {
		//int allprice = 0;
		//반복하게 됨
		while(true) {
		int i;
		int sum = 0;
		//객체생성
		Ice newice = new Ice();
		int count = newice.countIce();
		Ice[] icelist = newice.iceCream(count);
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 > \n", count);
		System.out.print("번호 \t 아이스크림명 \t 가격 \n");
		
		for(i=0; i<count; i++) {
			System.out.println((i+1)+ "\t"+icelist[i].icename+ "\t"+icelist[i].price);
		}
		
		System.out.println();
		
		String retry = newice.newTurn();
		
		if(retry == "n"|| retry == "N") {
			break;
		}
		/*System.out.print("총 판매액 : ");
		for(i=0; i<count;i++) {
			allprice += icelist[i].price;
			System.out.println(allprice);*/
		}
		}
		
}
