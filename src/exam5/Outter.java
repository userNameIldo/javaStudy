package exam5;

public class Outter {
	
	//��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
	
	String field = "Outter-filed";
	
	public void method() {
		
		System.out.println("Outter-method");
		
	}
	
	class Nested{
		
		String field = "Nested-filed";
		
		void method() {
			
			System.out.println("Nested-method");
			
		}
		
		void print() {
			
			//this�� ���̸� ���� Ŭ���� ������ ����
			System.out.println(this.field); 
			this.method();
				
		}
		
		void outterPrint() {
			
			//this �տ� �ٱ� Ŭ���� �̸��� ���̸� �ٱ� Ŭ���� ������ ����
			System.out.println(Outter.this.field);
			Outter.this.method();			
			
		}
		
	}
	
	

}
