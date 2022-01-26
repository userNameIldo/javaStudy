package exam7;

public class AnonymousExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous anony = new Anonymous();

		anony.field.wake();
		
		anony.method();
		
		anony.method2(new Person() {
			
			void study() {
				
				System.out.println("공부합니다.");
				
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("9시에 일어남");
				study();
			}
			
			
		});
		
	}

}
