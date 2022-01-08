package exam9;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dbmCellPhone = new DmbCellPhone("갤럭시", "블루", 20);
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dbmCellPhone.model);
		System.out.println("색상 : " + dbmCellPhone.color);
		
		//DmbCellPhone에 있는 필드
		System.out.println("채널 : " + dbmCellPhone.channel);
		
		//CellPhone인 부모로 부터 상속받은 메소드 호출 
		dbmCellPhone.powerOn();
		dbmCellPhone.hengOn();
		dbmCellPhone.sendVoice("안뇽");
		dbmCellPhone.reciveVoice("안뇽나도 반가워~");
		dbmCellPhone.hangOff();
		
		
		//DmbCellPhone에 있는 메소드 호출
		dbmCellPhone.turnOnDmb();
		dbmCellPhone.changeChannel(40);
		dbmCellPhone.turnOffDmb();
		
	}

}
