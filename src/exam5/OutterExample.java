package exam5;

public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outter outter = new Outter();
		
		outter.method();
		
		Outter.Nested nested = outter.new Nested();
		
		nested.method();
		
		
		nested.print();
		
		
		nested.outterPrint();
		
	}

}
