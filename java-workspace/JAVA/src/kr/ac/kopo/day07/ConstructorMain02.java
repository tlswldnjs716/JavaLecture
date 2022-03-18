package kr.ac.kopo.day07;

public class ConstructorMain02 {
	public static void main(String[] args) {
		Member m = new Member();
		m.info();
		//은닉성을 해치기 때문에 잘 사용하지 않음
		//m.name = "홍길동"
		Member m2 = new Member("홍길동");
		m2.info();
		Member m3 = new Member("윤길동", 22);
		m3.info();
		Member m4 = new Member("한길동", 30,"0");
		m4.info();
		
	}
}
