package kr.ac.kopo.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain05 {

	public static void write() {

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("iotest/data.dat");
			dos = new DataOutputStream(fos);
			char c = 'A';
			int num = 99;
			double f = 12.34;

			// 크기의 할당
			// 1바이트
			fos.write(c);
			// 2바이트
			dos.writeChar(c);
			// 4바이트
			dos.writeInt(num);
			// 8바이트
			dos.writeDouble(f);

			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
		System.out.println("파일저장 완료...");
	}

	// data필터를 사용했다면 잘 맞춰줘야함
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("iotest/data.dat");
			// data형태
			dis = new DataInputStream(fis);

			int i = dis.read();
			char c = dis.readChar();
			int i2 = dis.readInt();
			double d = dis.readDouble();

			System.out.println((char) i);
			System.out.println(c);
			System.out.println(i2);
			System.out.println(d);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read();
		// write();

	}
}
