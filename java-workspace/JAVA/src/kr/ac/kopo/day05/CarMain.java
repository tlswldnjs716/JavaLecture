package kr.ac.kopo.day05;

//실행클래스
public class CarMain {
	public static void main(String[] args) {
		//heap영역에 생성
		//c는 stack
		Car c = new Car();
		//문자열은 new생략 가능
		c.name = "소나타";
		c.Company = "현대";
		
		Car c2 = new Car();
		c2.name ="K9";
		c2.Company = "기아";
		
		System.out.println("첫번째 자동차명 : " + c.name);
		System.out.println("첫번째 자동차명 : " + c2.name);
	}
}
