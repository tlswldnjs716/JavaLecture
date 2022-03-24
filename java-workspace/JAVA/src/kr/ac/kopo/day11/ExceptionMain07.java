package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain07 {
	public static void main(String[] args) {
		try {
			b();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		a();
	}
	//b가 직접 처리안하고 main으로 떠넘김
	public static void b() throws FileNotFoundException{
		int [] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}
	public static void a() {
		try {
		String str = null;
		System.out.println(str.length());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
