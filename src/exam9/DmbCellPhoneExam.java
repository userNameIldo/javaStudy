package exam9;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dbmCellPhone = new DmbCellPhone("������", "���", 20);
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dbmCellPhone.model);
		System.out.println("���� : " + dbmCellPhone.color);
		
		//DmbCellPhone�� �ִ� �ʵ�
		System.out.println("ä�� : " + dbmCellPhone.channel);
		
		//CellPhone�� �θ�� ���� ��ӹ��� �޼ҵ� ȣ�� 
		dbmCellPhone.powerOn();
		dbmCellPhone.hengOn();
		dbmCellPhone.sendVoice("�ȴ�");
		dbmCellPhone.reciveVoice("�ȴ����� �ݰ���~");
		dbmCellPhone.hangOff();
		
		
		//DmbCellPhone�� �ִ� �޼ҵ� ȣ��
		dbmCellPhone.turnOnDmb();
		dbmCellPhone.changeChannel(40);
		dbmCellPhone.turnOffDmb();
		
	}

}
