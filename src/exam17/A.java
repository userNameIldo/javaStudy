package exam17;

public class A {

	A(){System.out.println("A ��ü�� ������");}
	
	class B{
		B(){System.out.println("B ��ü�� ������");}
		int field1;
		void method1(){System.out.println("B �ν��Ͻ� �޼ҵ�");}
	}
	
	static class C{
		C(){System.out.println("C ��ü�� ������");}
		int field1;
		static int field2;
		void method1() {System.out.println("C �ν��Ͻ� �޼ҵ�");}
		static void method2() {System.out.println("C ���� �޼ҵ�");} 
	}
	
	void method() {
		class D{
			D(){System.out.println("D ��ü�� ������");}
			int field1;
			void method1() {}
		}
		D d= new D();
		d.field1 = 3;
		d.method1();
	}
	
}
