package kr.ac.kopo.day01;
public class VariableMain {
	char b;//멤버변수, 자동초기화 
	public static void main(String[] args) {
		//랜메모리에 저장, 지역변수
		char a;
		a = 'A';
		System.out.println(a);
		double d1=0.1, d2=0.2, d3=0.3;
		System.out.printf("%.1f "+"%.1f "+"%.1f ", d1, d2, d3);
	}
}
