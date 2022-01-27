package exam19;

public class A extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		
		this.setName("A");
		this.calculator = calculator;
		
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
	
}
