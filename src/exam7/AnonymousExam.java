package exam7;

public class AnonymousExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous anony = new Anonymous();

		anony.field.wake();
		
		anony.method();
		
		anony.method2(new Person() {
			
			void study() {
				
				System.out.println("�����մϴ�.");
				
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("9�ÿ� �Ͼ");
				study();
			}
			
			
		});
		
	}

}
