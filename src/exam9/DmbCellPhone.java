package exam9;

public class DmbCellPhone extends CellPhone{ //CellPhone�� ��ӹ���

	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		// �θ� Ŭ������ ���� ��ӹ��� �ʵ�
		this.model = model;
		this.color = color;
		
		this.channel = channel;
		
	}
	
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� ����� �����մϴ�.");
	}
	void changeChannel(int channel) {
		
		this.channel = channel;
		System.out.println("ä���� " + channel + "������ �����մϴ�.");
		
	}
	
	void turnOffDmb() {
		System.out.println("Dmb ����� �����մϴ�.");
	}
	
	
	
	
}
