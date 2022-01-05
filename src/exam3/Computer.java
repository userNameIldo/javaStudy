package exam3;

public class Computer {

	String company = "삼성전자";
	String model;
	String core;
	int netSpeed;
	

	
	Computer(){	//생성자 선언
		
	}
	
	Computer(String model){
		
		this(model, "인텔", 250); //중복코드는 this로 처리 Computer(String model, String core, int netSpeed)불러오기
		
	}
	
	Computer(String model, String core){
		
		this(model, core , 250);
		
	}
	
	Computer(String model, String core, int netSpeed){
		
		this.model = model;
		this.core = core;
		this.netSpeed = netSpeed;
		
	}
	
}
