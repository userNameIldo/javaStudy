package exam13;

class SuperTest{
	
	public int a = 10, b = 20;
	
	public void write() {
		
		System.out.println("슈퍼클래스 write() 메소드...");
		
		
	}
	
	public int hap() {
		
		return a + b;
		
	}
	
	
}
class SubTest extends SuperTest{
	
	public int b = 100, c = 200;
	
	public void print(){
		
		System.out.println("서브클래스 print() 메소드...");
		
	}

	@Override
	public int hap() {
		// TODO Auto-generated method stub
		return a + b + c;
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubTest ob1 = new SubTest();
		System.out.println("ob1.b : " + ob1.b);
		
		//upcast
		SuperTest ob2 = ob1;
		//SuperTest ob2 = (SuperTest)ob1;
		
		System.out.println("ob2.b : " + ob2.b);
		
		System.out.println("합 : " + ob2.hap());
		
		ob2.write();
		
		//ob2.print(); 4.자식꺼는 자식꺼다.

		((SubTest)ob2).print();
		
	}

}
