package homework;

public class Work3 {
	public static void main(String[] args) {
		System.out.println("< ��°�� >");
		// �ð�
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
			System.out.printf("[%d�ð���] �����̰� �ö� �� ���� : %dM \n", hour, distance);

		}
	}
}