package exam6;

public class Button {

	OnClickListener listener; //인터페이스 타입 필드
	
	//필드의 다형성
	void setOnClickListener(OnClickListener listener) {//매개변수를 인터페이스 타입으로 선언
		
		this.listener = listener;
		
	}
	
	void Click() {
		
		listener.onClick(); // 구현 객체의 onClick()메소드 호출
		
	}
	
	static interface OnClickListener{//중첩 인터페이스
		
		void onClick();
		
	}
	
}
