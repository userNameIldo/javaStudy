package exam9;

public class DmbCellPhone extends CellPhone{ //CellPhone을 상속받음

	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		// 부모 클래스로 부터 상속받은 필드
		this.model = model;
		this.color = color;
		
		this.channel = channel;
		
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송을 수신합니다.");
	}
	void changeChannel(int channel) {
		
		this.channel = channel;
		System.out.println("채널을 " + channel + "번으로 변경합니다.");
		
	}
	
	void turnOffDmb() {
		System.out.println("Dmb 방송을 종료합니다.");
	}
	
	
	
	
}
