package kr.ac.kopo.day11;

import java.util.LinkedList;
import java.util.List;

/*
	List : 순서, 중복 허용
	- ArrayList
	- LinkedList
	
	add()
	get()
	size()
	remove()
	isEmpty()
 */
public class ListMain {
	public static void main(String[] args) {
		//List<String> list =new ArrayList<String>();
		//1.7부터는 생략가능
		//List<String> list =new ArrayList<>();
		//묵시적 형변환
		List<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");
		
		System.out.println("전체 원소의 개수 : " + list.size() +"개");
		System.out.println("< PRINT >");
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("< 1.5버전 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println( "\"one\" 삭제 : "+(list.remove("one")? "성공" : "실패"));
		System.out.println( "\"one\" 삭제 : "+(list.remove("one")? "성공" : "실패"));
		
		System.out.println("< 1.5버전>");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("0번지 문자열 : "+list.get(0));
		//삭제하는 문자열이 출력됨
		System.out.println("0번지 위치한 문자열 삭제 : "+list.remove(0));
		System.out.println("0번지 문자열 : " + list.get(0));
	}
}
