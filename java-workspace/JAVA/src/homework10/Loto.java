package homework10;

import java.util.Arrays;
import java.util.Scanner;

/*
로또 게임
게임수를 입력하세요 : 3
게임 1 : [2, 6, 13, 25, 20, 7]
게임 2 : [2, 9, 3, 7, 38, 13]
게임 3 : [40, 10, 38, 39, 42, 18]
*/

class LottoUtil {

   public void start() {
	//게임수 입력
	   Scanner sc = new Scanner(System.in);
	   int cnt = Integer.parseInt(sc.nextLine());
       for(int i = 0; i < cnt; i++) {
    	   System.out.println("게임1 : "+ Arrays.toString(getNumbers()));
       }
   }

   private int[] getNumbers() {
	return null;
	// 1 ~ 45 사이의 로또번호 6개 추출
   }
   

}