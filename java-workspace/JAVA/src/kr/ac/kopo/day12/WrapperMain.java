package kr.ac.kopo.day12;

/*
	기본자료형		Wrapper Class
	boolean		Boolean
	char		Character
	byte		Byte
	short		Short
	int			Integer
	long		Long
	float		Float
	double		Double
 */
public class WrapperMain {
	public static void main(String[] args) {
		int i = 100;
		Integer i2 = new Integer(100);
		Integer i5 = Integer.valueOf(100);
		//1.5버전 이후부터, auto boxing
		Integer i3 = 100;
		//객체에서 100을 풀어서 갖고옴, auto unboxing
		int i4 = new Integer(100);

		//기본자료형 int값
		System.out.println(Integer.parseInt("123") + 100);
		//wrapper class값
		System.out.println(Integer.valueOf("123")+100);
	}
}
