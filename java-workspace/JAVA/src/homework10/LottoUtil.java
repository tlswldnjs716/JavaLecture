package homework10;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

/*
로또 게임
게임수를 입력하세요 : 3
게임 1 : [2, 6, 13, 25, 20, 7]
게임 2 : [2, 9, 3, 7, 38, 13]
게임 3 : [40, 10, 38, 39, 42, 18]
*/

class LottoUtil {

	public void start() {
		// 게임수 입력
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i + 1) + ":" + Arrays.toString(getNumbers5()));
		}
	}

	// 방법1
	// 배열, 1 ~ 45 사이의 로또번호 6개 추출
	private int[] getNumbers() {
		int[] Nums = new int[6];
		for (int i = 0; i < 6; i++) {
			// 10을 곱하면 0~9
			Nums[i] = (int) (Math.random() * 45) + 1;
			// 중복제거
			for (int j = 0; j < i; j++) {
				if (Nums[i] == Nums[j]) {
					i--;
				}
			}
		}
		return Nums;
	}

	// 방법2
	// Set은 중복을 허용하지 않음, 순서없음
	// HashSet사용
	private Object[] getNumbers2() {
		Set<Integer> set = new HashSet<>();
		// 인덱스가 없으니까 사이즈로 개수 정하기
		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);
		}
		Object[] arr = set.toArray();
		return arr;
	}

	// 방법3
	// list
	// list는 중복이 있기 때문에 제거 필요
	private Object[] getNumbers3() {
		// 중복리스트
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; list.size() < 6; i++) {
			// 10을 곱하면 0~9
			int num = (int) (Math.random() * 45) + 1;
			// System.out.println(list);
			//중복제거
			if (!list.contains(num)) {
				list.add(num);
			} else {
				i--;
			}
		}
		Object[] numarr = list.toArray();
		return numarr;
	}
	
	// 방법4
	// map, Random클래스
	private Object[] getNumbers4() {
		// random 클래스 사용
		Random r = new Random();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; map.size() < 6; i++) {
			//키값은 같을 수 없음
			map.put(r.nextInt(46),i);
		}
		
		//key만 뽑아내는 메소드, keySet()
		Set<Integer> set = map.keySet();
		Object[] arr = set.toArray();
		return arr;
	}
	
	// 방법5
	// 순회하며 비교
	// try-catch 사용
	private Object[] getNumbers5() {
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; list.size() < 6; i++) {
			Integer Num = r.nextInt(45) + 1;
			list.add(Num);
			for (int j = 0; j < i; j++) {
				try {
					if (list.get(i) == list.get(j)) {
						throw new NumException("중복발생");
					}
				} catch (NumException e) {
					list.remove(j);
					i--;
				}
			}
		}
		Object[] arr = list.toArray();
		return arr;
	}
}

class NumException extends Exception{
	//기본 생성자
	//대체로 매개변수가 있는 생성자를 따로 정의한다면 써주기
	public NumException() {}
	public NumException(String msg){
		super(msg);
	}
}