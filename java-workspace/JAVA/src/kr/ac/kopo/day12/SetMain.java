package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		//treeset<>은 오름차순 형태
		Set<String> set = new HashSet<>();
		System.out.println("\"one\"입력성공여부 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		//중복을 허용하지 않기 때문에 원소 개수는 5라고 출력됨
		set.add("five");
		
		set.add("one");
		
		System.out.println("전체 원소 개수: "+set.size());
		
		/*
		 * 데이터 접근방법 3가지 
		 * 1. 1.5버전의 for문 이용 
		 * 2. toArray() 메소드 이용 
		 * 3. Iterator 객체 이용
		 */
		
		System.out.println("< 1.5 for문 이용 >");
		for(String str: set) {
			System.out.println(str);
		}
		
		System.out.println("< toArray() 이용한 출력 >");
		//set에 있는 정보들은 배열에 저장
		//어떤 객체를 받을지 모르니까 object로
		Object[] arr = set.toArray();
		for(int i = 0; i<arr.length; i++)
		{
			//tostring이 생략된 상태
			System.out.println(arr[i]);
			//오브젝트형이라서 형변환 안하면 길이 반환 불가능
			System.out.println(((String) arr[i]).length());
		}
		
		System.out.println("< Iterator 이용한 출력 >");
		//배열아님
		Iterator<String> ite = set.iterator();
		//hasNext()를 쓰고 next()를 써야함, next를 쓰지 않으면 접근 하는거 아님
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
	
}
