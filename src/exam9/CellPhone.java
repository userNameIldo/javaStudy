package exam9;

public class CellPhone {//부모 메소드

	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void  hengOn() {
		System.out.println("전화를 받습니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	void reciveVoice(String message) {
		System.out.println("상대 : " + message);
	}
	void hangOff() {
		System.out.println("전화를 끊습니다.");
	}
	
	
}
