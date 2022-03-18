package kr.ac.kopo.day07;

public class Member {
	String name;
	int age;
	String bloodType;
	
	//정보출력메소드
	//지역변수 아님!!클래스에서 선언된 변수는 클래스 내에서 모두 사용가능
	void info() {
		System.out.println("이름: " + name + " 나이: " + age+ " 혈액형: "+ bloodType);
	}
	//생성자를 통해 객체 초기화
	//객체를 new로 생성했을 때 불러와짐
	//구분할 필요가 없으면 앞에 this가 붙어있다고 생각하면 됨
	Member(){
		name = "알 수 없음";
		this.age = -1;
		this.bloodType = "알 수 없음";
	}
	Member(String name){
		this.name = name;
		age = -1;
		bloodType = "알 수 없음";
	}
	Member(String name, int age){
		//3개를 가진 멤버변수 호출
		//this를 안쓰면 일반 메소드로 인식
		//Member(name, age, "알수없음");
		this(name, age, "알 수 없음");
	}
	//멤버변수에 지역변수 대입, 같은 변수명을 사용
	//지역변수는 갈색, 멤버변수는 파랑
	//멤버변수에 접근하고 싶으니까 this사용
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
}
