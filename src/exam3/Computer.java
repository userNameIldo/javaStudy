package exam3;

public class Computer {

	String company = "�Ｚ����";
	String model;
	String core;
	int netSpeed;
	
	Computer(){
		
	}
	
	Computer(String model){
		
		this(model, "����", 250);
		
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
