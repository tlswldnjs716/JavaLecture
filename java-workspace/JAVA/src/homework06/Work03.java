package homework06;

import java.util.Scanner;

class Ice{
	String icename;
	int price;
	
	int countIce() {
		System.out.print("아이스크림 몇개 구입할꺼야?");
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		System.out.println();
		return count;
	}
	
	Ice[] iceCream(int count) {
		Ice[] arrice = new Ice[count];
		Scanner sc = new Scanner(System.in);
		int i;
		for (i = 0; i < count; i++) {
			// 객체 생성
			arrice[i] = new Ice();
			System.out.println("***" + (i + 1) + "번째 아이스크림 구매정보 ***");
			System.out.print("아이스크림명: ");
			arrice[i].icename = sc.nextLine();
			System.out.print("아이스크림 가격: ");
			arrice[i].price = Integer.parseInt(sc.nextLine());

		}
		System.out.println();
		return arrice;
	}
}

public class Work03 {
	public static void main(String[] args) {
		int i;
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
				
		System.out.print("총판매액 : ");
		int allprice = 0;
		for(i=0; i<count;i++) {
			allprice += icelist[i].price;
		}
		System.out.println(allprice);
}
}