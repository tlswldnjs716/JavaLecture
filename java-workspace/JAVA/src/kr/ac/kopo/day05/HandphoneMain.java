package kr.ac.kopo.day05;

class Handphone{
	String name;
	String phonenumber;
	String company;
}
public class HandphoneMain {
	public static void main(String[] args) {
		Handphone hp = new Handphone();
		hp.name ="ȫ�浿";
		hp.phonenumber ="010-1111-2222";
		hp.company ="�Ｚ";
		
		Handphone hp2 = new Handphone();
		hp2.name ="���浿";
		hp2.phonenumber ="010-3333-4444";
		hp2.company ="����";
		
		Handphone hp3 = new Handphone();
		hp3.name ="���浿";
		hp3.phonenumber ="010-5555-6666";
		hp3.company ="ȭ����";
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone phone : hpArr) {
			System.out.println("����� : "+phone.name+" ��ȭ��ȣ : " +phone.phonenumber + " ������ : "+phone.company);
		}
		
		
	}
}
