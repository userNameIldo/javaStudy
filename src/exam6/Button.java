package exam6;

public class Button {

	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	//�ʵ��� ������
	void setOnClickListener(OnClickListener listener) {//�Ű������� �������̽� Ÿ������ ����
		
		this.listener = listener;
		
	}
	
	void Click() {
		
		listener.onClick(); // ���� ��ü�� onClick()�޼ҵ� ȣ��
		
	}
	
	static interface OnClickListener{//��ø �������̽�
		
		void onClick();
		
	}
	
}
