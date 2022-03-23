package kr.ac.kopo.day10.inter;

public interface TV {
	public static final int MIN_VOLUME_SIZE = 0;
	//public staitc final 생략가능
	public static final int MAX_VOLUME_SIZE = 50;
	
	//public abstract 생략
	void powerOn();
	void powerOff();
	void channelUp();
	void ChannelDown();
	void volumeUp();
	void volumeDown();
	void mute();
}
