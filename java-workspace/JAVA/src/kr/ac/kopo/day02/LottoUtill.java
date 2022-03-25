package kr.ac.kopo.day02;

import java.util.Random;

//문서용 주석
/**
 * 로또와 관련된 여러가지 기능클래스
 * @author 홍길동
 *
 */
public class LottoUtill {
	/**
	 * 로또를 만드는 클래스
	 */
	public void todayProbability() {
		//random
		//Math.random
		Random r = new Random();
		//임의의 난수 추출
		r.nextInt(101);//0~100
		System.out.println("오늘의 로또 확률은" + "%입니다");
	}
}
