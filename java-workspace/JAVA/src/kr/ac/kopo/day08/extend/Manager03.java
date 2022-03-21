package kr.ac.kopo.day08.extend;

//관리자(Manager02)는 사원(Employee)의 한 형태다 조건 부합 => 상속관계 표현
public class Manager03 extends Employee{
	Employee[] empList; //관리사원목록
	
	Manager03(){
		
	}
	
	Manager03(String name, int salary, String grade, Employee[] empList){
		//부모 클래스의 값
		//기본 생성자가 아니라면 명시적으로 써주
		//super로 접근하니까 부모의 변수가 private여도 접근가능
		super(name, salary, grade);
		this.empList = empList;	
	}
	@Override
	void info() {
		//말하지 않으면 자기꺼가 우선 그러니까 super를 써야함
		super.info();
		System.out.println("--------------------------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("--------------------------------------------------------");
		//객체니까 e.info(), employee의 info사용됨
		for(Employee e: empList) {
			e.info();
		}
	}
}
