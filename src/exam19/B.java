package exam19;

public class B extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		
		this.setName("B");
		this.calculator = calculator;
		
	}

	@Override
	public void run() {
		calculator.setMemory(50);
	}
	
	
	
}
