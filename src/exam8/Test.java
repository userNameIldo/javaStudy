package exam8;

public class Test {
	int a = 1;
	
	void test1() {
		
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
	}
	
	void test2() {
		
		int c = 3;
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test = new Test();
		
		test.test1();
		test.test2();
				
		
	}

}
