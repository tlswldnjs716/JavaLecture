package kr.ac.kopo.day02;

import java.util.Random;

//������ �ּ�
/**
 * �ζǿ� ���õ� �������� ���Ŭ����
 * @author ȫ�浿
 *
 */
public class LottoUtill {
	/**
	 * �ζǸ� ����� Ŭ����
	 */
	public void todayProbability() {
		//random
		//Math.random
		Random r = new Random();
		//������ ���� ����
		r.nextInt(101);//0~100
		System.out.println("������ �ζ� Ȯ����" + "%�Դϴ�");
	}
}
