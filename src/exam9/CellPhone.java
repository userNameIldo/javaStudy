package exam9;

public class CellPhone {//�θ� �޼ҵ�

	String model;
	String color;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void  hengOn() {
		System.out.println("��ȭ�� �޽��ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("�ڱ� : " + message);
	}
	void reciveVoice(String message) {
		System.out.println("��� : " + message);
	}
	void hangOff() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
	
}
