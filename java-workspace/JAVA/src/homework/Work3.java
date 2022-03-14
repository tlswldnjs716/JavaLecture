package homework;

public class Work3 {
	public static void main(String[] args) {
		System.out.println("< 출력결과 >");
		// 시간
		int hour = 0;
		int distance = 0;
		while (distance < 100) {
			++hour;
			int snail = 5*hour;
			if (distance < 50) {
				distance = snail-1*hour;
			}
			if (distance >= 50) {
				distance = snail-2*hour;
			}
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM \n", hour, distance);

		}
	}
}