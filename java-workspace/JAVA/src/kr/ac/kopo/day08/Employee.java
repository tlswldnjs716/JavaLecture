package kr.ac.kopo.day08;

public class Employee {
	String name;
	int salary;
	String grade;
	//static으로 하면 공통으로 사용가능
	//int employeeCnt로 선언하면 독립적이라서 1명만 찍힘
	static int employeeCnt;
	
	//생성자
	Employee(){
		Employee.employeeCnt++;
	}
	
	//생성자
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary = salary;
		this.grade =  grade;
		Employee.employeeCnt++;
	}
	
	void info() {
		System.out.println("사원명: " + name + ", 연봉 : " + salary + ", 직급 : " + grade );
	}
	//static변수를 사용하고 있다면 메소드도 static인것이 좋다!
	static void employeeCntInfo() {
		System.out.println("총 사원수 : "+ employeeCnt + "명");
	}
}
