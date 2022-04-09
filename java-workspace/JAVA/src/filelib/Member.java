package filelib;

public class Member {
	private String ID;
	private String PW;
	
	public Member() {
		
	}
	
	public Member(String ID, String PW) {
		this.ID = ID;
		this.PW = PW;
	}
	public String getId() {
		return ID;
	}
	public void setId(String ID) {
		this.ID = ID;
	}
	public String getPwd() {
		return PW;
	}
	public void setPwd(String PW) {
		this.PW = PW;
	}
}