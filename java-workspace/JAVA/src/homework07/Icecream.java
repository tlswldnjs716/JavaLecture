package homework07;

import java.util.Scanner;

class Ice{
	String icename;
	int price;
	public int totalPrice;
	int totalCount;
	
	int countIce() {
		System.out.print("아이스크림 몇개 구입할꺼야?");
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		System.out.println();
		totalCount += count;
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
	

	//되풀이
	public String newTurn() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("계속하시겠습니까? ");
		String ch = sc.nextLine();
		return ch;
	}
}