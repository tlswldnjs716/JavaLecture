package kr.ac.kopo.day02;

/*
 * ���ǹ�
 * 
 * if(����) {
 * 		����;
 * }
 * 
 * if(����) {
 * 		����1;
 * } else {
 * 		����2;
 * }
 * ���� ? ����1 : ����2
 * 
 * �����ϰ� å �Ǽ� �Է� : 1
 * 1 book
 * 
 * �����ϰ� å �Ǽ� �Է� : 4
 * 4 books
 */

public class IFMain01 {

	public static void main(String[] args) {

		int book = 1;
		
		System.out.print(book + " book");
		if(book >= 2) {
			System.out.println("s");
		}
		System.out.println();
		
		if(book == 1) {
			System.out.println(book + " book");
		} else {
			System.out.println(book + " books");
		}
	}
}






