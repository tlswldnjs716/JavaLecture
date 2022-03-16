package homework05;

import java.util.Scanner;

class Ice{
	String icename;
	int price;
}

public class Work01 {
	public static void main(String[] args) {
		System.out.print("아이스크림 몇개 구입할꺼야?");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		//클래스 배열 생성
		Ice[] arrice = new Ice[count];
		int i;
		for(i=0; i<count; i++) {
			//3뒤에 엔터 버퍼버리기
			sc.nextLine();
			//객체 생성
			arrice[i] = new Ice();
			System.out.println("***" + (i+1)+ "번째 아이스크림 구매정보 ***");
			System.out.print("아이스크림명: ");
			arrice[i].icename = sc.nextLine();
			System.out.print("아이스크림 가격: ");
			arrice[i].price = sc.nextInt();
			
		}
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 > \n", i);
		System.out.print("번호 \t 아이스크림명 \t 가격 \n");
		for(i=0; i<count; i++) {
			System.out.println((i+1)+ "\t"+arrice[i].icename+ "\t"+arrice[i].price);
		}
		
		//1.5버전의 출력은 인덱스를 만들지 않음
		
		System.out.print("총판매액 : ");
		int allprice = 0;
		for(i=0; i<count;i++) {
			allprice += arrice[i].price;
		}
		System.out.println(allprice);
}
}