package exam13;

class SuperTest{
	
	public int a = 10, b = 20;
	
	public void write() {
		
		System.out.println("����Ŭ���� write() �޼ҵ�...");
		
		
	}
	
	public int hap() {
		
		return a + b;
		
	}
	
	
}
class SubTest extends SuperTest{
	
	public int b = 100, c = 200;
	
	public void print(){
		
		System.out.println("����Ŭ���� print() �޼ҵ�...");
		
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
		
		System.out.println("�� : " + ob2.hap());
		
		ob2.write();
		
		//ob2.print(); 4.�ڽĲ��� �ڽĲ���.

		((SubTest)ob2).print();
		
	}

}
