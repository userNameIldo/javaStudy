package exam5;

public class Outter {
	
	//중첩 클래스에서 바깥 클래스 참조 얻기
	
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
			
			//this만 붙이면 로컬 클래스 참조를 얻음
			System.out.println(this.field); 
			this.method();
				
		}
		
		void outterPrint() {
			
			//this 앞에 바깥 클래스 이름을 붙이면 바깥 클래스 참조를 얻음
			System.out.println(Outter.this.field);
			Outter.this.method();			
			
		}
		
	}
	
	

}
