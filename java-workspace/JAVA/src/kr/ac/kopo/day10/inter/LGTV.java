package kr.ac.kopo.day10.inter;

/*이미 상속되어 있다면 단일 상속에 위배
추상클래스끼리도 이미 상속관계가 있을 수 있음
따라서 기능 표준화, 인터페이스를 쓰는 것이 유리!
LG의 TV가 하나라도 특정짓고 만든 코드임*/
public class LGTV implements TV{
	
	private boolean power;
	private int volumeSize;
	private int channelNo;
	//protected를 쓰면 상속일때 확인가능
	protected static final int MAX_CHANNEL_SIZE = 100;
	
	public LGTV() {
		System.out.println("LGTV를 구매했습니다");
		power = false;
		volumeSize = 10;
		channelNo = 3;
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다");
		info();
	}

	@Override
	public void channelUp() {
		channelNo = ++channelNo % LGTV.MAX_CHANNEL_SIZE;
		System.out.println("채널을 올립니다");
		info();
	}

	@Override
	public void ChannelDown() {
		if(channelNo == 0) {
			channelNo = LGTV.MAX_CHANNEL_SIZE;
			channelNo--;
			System.out.println("채널을 내립니다");
			info();
		}
		
	}

	@Override
	public void volumeUp() {
		if(volumeSize < TV.MAX_VOLUME_SIZE) {
			volumeSize++;
		}
		System.out.println("음량을 높입니다");
		info();
		
	}

	@Override
	public void volumeDown() {
		if(volumeSize > TV.MIN_VOLUME_SIZE) {
			volumeSize--;
		}
		System.out.println("음량을 낮춥니다");
		info();
	}

	@Override
	public void mute() {
		//상수를 쓸때 클래스 이름을 생략하지 않음
		//final 변수를 쓸때는 어디에 속해있는지 표시하는 것이 좋음
		volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거 중입니다");
		info();
	}
	
	public void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}
	
}
