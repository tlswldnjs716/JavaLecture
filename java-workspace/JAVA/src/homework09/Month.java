package homework09;

import java.util.Calendar;

public class Month {
	Calendar c = Calendar.getInstance();
	
	void print() {
			//1일 셋팅
			c.set(Choose.getyear, Choose.getmonth - 1, 1);
			System.out.printf("<%d년 %d월 >\n", Choose.getyear, Choose.getmonth);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			//마지막날짜
			int lastday = c.getActualMaximum(Calendar.DATE);
			//요일구하기
			int week =c.get(Calendar.DAY_OF_WEEK);
			
			//첫줄 처리 
			for(int hole = 1; hole < week; hole++) {
				System.out.print("\t");
			}
			int day1;
			for(day1 = 1; week <= 7; week++) {
				System.out.printf("%2d\t", day1);
				day1++;
			}
			System.out.println();
			int cnt = 0;
			for(int day = day1; day <= lastday; day++) {
				System.out.printf("%2d\t", day);
				cnt++;
				if(cnt % 7 == 0 || day == lastday)
					System.out.println();
			}
			System.out.println();
	}
}
