package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	Koala.jpg -> Koala2.jpg 복사 
 */

public class IOMain03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		long start = System.currentTimeMillis();
		try {
			//파일읽어오기
			fis = new FileInputStream("iotest/Koala.jpg");
			//파일 복사 = 파일 쓰기
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			//파일 내용 복사
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			fos.flush();
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : "+ (end-start)/1000. + "초");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//근데 오류를 해결하지 못했는데 finally로 닫아버려도 괜찮아요?? -> 그래서 try catch
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사가 완료되었습니다");
	}
}











