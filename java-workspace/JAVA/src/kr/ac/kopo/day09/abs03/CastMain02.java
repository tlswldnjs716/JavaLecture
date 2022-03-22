package kr.ac.kopo.day09.abs03;

public class CastMain02 {
	public static void main(String[] args) {
		//실행시 에러, 공간이 없으니까!, 공간이 부족
		//Child01 c = (Child01)new Parent();
		
		Parent p = new Child01();
		Child01 c =(Child01)p;
		c.print();
	}
}
