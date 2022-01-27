package exam19;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		A a = new A();
		a.setCalculator(calculator);
		a.start();
		
		B b = new B();
		b.setCalculator(calculator);
		b.start();
		
	}

}
