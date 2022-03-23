package kr.ac.kopo.day10.inter;

public class UserMain {
	public static void main(String[] args) {
		//인터페이스의 묵시적 형변환
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.ChannelDown();
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOff();
	}
}
