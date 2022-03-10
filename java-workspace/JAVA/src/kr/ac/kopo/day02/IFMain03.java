package kr.ac.kopo.day02;
//종속이 필요없는 경우

//else if

import java.util.Scanner;

public class IFMain03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("집에서 출발한 시간을 입력하세요(7시30분 : 730) => ");
		int time = sc.nextInt();

		if (time < 815) {
			if (time < 800) {
				System.out.println("걸어간다");
			} else {
				System.out.println("버스를 탄다");
			}
		} else {
			System.out.println("택시를 탄다");
		}

		//if문의 범위 잘 고려하기!
		//다중 if_종속되어 있지 않은 것처럼 보이도록 함, 수평처럼
		//해석은 다중if와 중첩if 같음
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else if (time < 815) {
			System.out.println("버스를 타고 학교에 간다");
		} else {
			System.out.println("택시를 타고 학교에 간다");
		}

		//중첩된 if
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else {
			if (time < 815) {
				System.out.println("버스를 타고 학교에 간다");
			} else {
				System.out.println("택시를 타고 학교에 간다");
			}
		}
	}

}
