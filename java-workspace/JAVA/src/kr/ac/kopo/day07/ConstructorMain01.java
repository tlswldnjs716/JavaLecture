package kr.ac.kopo.day07;

/*생성자 특징
1. 클래스명과 동일
2. 반환형이 없다 (return이 없음)
3. 디폴트 생성자 지원: 클래스내에 생성자가 존재하지 않는 경우 JVM이 자동으로 생성
4. 오버로딩 지원
5. 멤버변수 초기화
*/

class Car {
	//생성자는 클래스명과 동일해야함
	Car(){
		System.out.println("Car() 생성자 호출...");
	}
	//void같은 것이 붙으면 생성자가 아니라 메소드임
	void Car(){
		System.out.println("Car() 생성자 호출...");
	}
	Car(int i){
		System.out.println("Car(int) 생성자 호출...");
	}
	Car(int i, String s){
		System.out.println("Car(int, String) 생성자 호출...");
	}
}
public class ConstructorMain01 {
	public static void main(String[] args) {
		//클래스 내에 생성자가 없을때
		Car c = new Car();
		Car c2 = new Car(10);
		Car c3 = new Car(10,"aaa");
	}
}
