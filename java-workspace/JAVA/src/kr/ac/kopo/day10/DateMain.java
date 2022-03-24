package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
	//private를 수정하고 볼 수 있게 하기위해 set, get을 사용
	public static void main(String[] args) {
		//date클래스보다 canlendar클래스를 이용하는 것이 좋음
		//getInstance를 사용해 GregorianCalendar객체를 리턴
		//묵시적 형변환
		Calendar c = Calendar.getInstance();
		//get(1)은 year
		//System.out.println(c.get(1));
		//int year = c.get(1);
		//System.out.println(year);
		//int month = c.get(2);
		//System.out.println(month);
		//Calendar에서 상수변수로 만들었음
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);//1~7
		String[] week = {" ","일", "월", "화", "수", "목", "금", "토"};
		 System.out.println("오늘은 "+year+"년"+month +"월"+ date +"일 "+week[day]);
		
		// 2020 5월 20일의 요일?
		// month는 범위가 0부터
		 c.set(2020, 5-1, 20);
		 day = c.get(Calendar.DAY_OF_WEEK);
		 System.out.println(week[day]);
		
		 int lastday = c.getActualMaximum(Calendar.DATE);
		 System.out.println(lastday);
		 
		 Date d = c.getTime();
		 System.out.println(d);
		 
		 String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		 //생성자 
		 SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		 //메소드
		 System.out.println(sdf.format(new Date()));
		 
		//오늘은 2022년 3월 23(수)입니다.
		//Date클래스
		//Date d = new Date();
		//주소값이 나와야 하는게 맞지만 toString()이 생략되어 있음
		//toString()은 object가 갖고 있는 것
		//Date의 toString()이 오버라이드
		//System.out.println(d);
		//왜 toString()이 생략가능하다고?? -->이유 없음, 약속임
		//System.out.println(d.toString());
		//setYear()
		/*
		 * int year = d.getYear()+1900; int month = d.getMonth()+1; int date =
		 * d.getDate(); int day = d.getDay();
		 * 
		 * String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		 * System.out.println("오늘은 "+year+"년"+month +"월"+ date +"일 "+week[day]);
		 */
	}
}
