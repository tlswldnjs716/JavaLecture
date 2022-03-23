package kr.ac.kopo.day10;

final class Super{
	private final double PI = 3.14;
	
	Super(){
		//final 수정불가능
		//PI = 3.141592;
	}
	final void call() {
		System.out.println("SUPER::call()");
	}
}

//final이라서 불가능 
/*class Sub extends Super{
	//void call() {
		
	}
}
*/

public class FinalMain {
	
}
