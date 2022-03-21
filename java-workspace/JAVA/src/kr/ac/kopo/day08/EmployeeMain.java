package kr.ac.kopo.day08;

public class EmployeeMain {
	public static void main(String[] args) {
		
		//int totalEmployee = 0;
		//static으로 정의하면 클래스로 접근가능
		Employee.employeeCntInfo();
		
		Employee e = new Employee("홍길동", 3300, "사원");
		//totalEmployee++;
		Employee e2 = new Employee("강길동", 3800, "대리");
		//totalEmployee++;
		
		e.info();
		//int employeeCnt로 선언하면 독립적이라서 1명만 찍힘
		Employee.employeeCntInfo();
		e2.info();
		//nonstatic에서는 접근가능
		Employee.employeeCntInfo();
		
		//System.out.println("입사한 총 사원수 : " + totalEmployee + "명" );
	}
}
