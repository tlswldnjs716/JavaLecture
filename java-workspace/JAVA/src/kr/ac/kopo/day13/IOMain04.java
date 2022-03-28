package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

/*
 	Koala.jpg -> Koala2.jpg 복사 
 */

public class IOMain04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		// 필터를 씌워서 속도를 더 빠르게!
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		long start = System.currentTimeMillis();
		try {
			// 파일읽어오기
			fis = new FileInputStream("iotest/Koala.jpg");
			bis = new BufferedInputStream(fis);
			// 파일 복사 = 파일 쓰기
			fos = new FileOutputStream("iotest/Koala2.jpg");
			bos = new BufferedOutputStream(fos);

			// 파일 내용 복사
			// 버퍼를 쓰면 더 많이 저장
			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			fos.flush();
			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 근데 오류를 해결하지 못했는데 finally로 닫아버려도 괜찮아요?? -> 그래서 try catch
			// 일반적으로 순서 반대로 닫기
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
		}

		System.out.println("파일복사가 완료되었습니다");
	}
}
