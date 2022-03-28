package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
	
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			
			//listFiles()는 객체로 갖고 오기 때문에 편함
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "디렉토리" : "파일");
			}
			
//			String[] list = dirObj.list();
//			for(String data : list) {
//				System.out.println(data);
//				//getName은 파일이름
//				File fileObj = new File(dirObj.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() 
//						? "디렉토리" : "파일");
//			}
		}
		
		/*
		File dirObj = new File("iotest/강아지/리트리버");
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		
		if(!dirObj.exists()) {
			dirObj.mkdirs();
		}
		*/
	/*
		File fileObj = new File("iotest/a.txt");
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " + parent);
		
		System.out.println("파일 존재여부 : " + fileObj.exists());
		long fileSize = fileObj.length();
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = fileObj.lastModified();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정시간 : " 
					+ sdf.format(new Date(lastTime)));
	*/
	}
}




