package exam17;

public class Main {
	
	public static void main(String[] args) {
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 5;
		A.C.method2();
		
		A a = new A();
		
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		
		a.method();
		
	}

}
