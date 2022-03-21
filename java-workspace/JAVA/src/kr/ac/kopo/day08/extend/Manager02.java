package kr.ac.kopo.day08.extend;

//관리자(Manager02)는 사원(Employee)의 한 형태다 조건 부합 => 상속관계 표현
public class Manager02 extends Employee{
	Employee[] empList; //관리사원목록
	
	Manager02(String name, int salary, String grade, Employee[] empList){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;	
	}
	@Override
	void info() {
		//말하지 않으면 자기꺼가 우선 그러니까 super를 써야함
		super.info();
		System.out.println("--------------------------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("--------------------------------------------------------");
		for(Employee e: empList) {
			e.info();
		}
	}
}
