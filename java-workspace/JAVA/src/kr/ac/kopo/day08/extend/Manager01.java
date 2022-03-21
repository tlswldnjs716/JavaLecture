package kr.ac.kopo.day08.extend;

public class Manager01 {
	String name;
	int salary;
	String grade;
	Employee[] empList; //관리사원목록
	
	Manager01(String name, int salary, String grade, Employee[] empList){
		//super(); 생략되어 있음
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;	
	}
	void info() {
		System.out.println("사원명: " + name+ ", 연봉 : "+ salary +"만원, 직급 : "+ grade);
		System.out.println("--------------------------------------------------------");
		System.out.println("\t관리사원 목록");
		for(Employee e: empList) {
			e.info();
		}
	}
}
