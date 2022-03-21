package kr.ac.kopo.day08.extend;

public class Employee {
	//private이면 접근못함
	String name;
	int salary;
	String grade;
	
	//매개변수가 있는 생성자가 있으면 기본생성자가 자동호출이 안되니까 만들어야 함
	public Employee() {
		
	}
	public Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " 
						+ salary + "만원, 직급 : " + grade);
	}
}


