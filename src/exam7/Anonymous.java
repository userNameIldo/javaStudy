package exam7;

public class Anonymous {

	Person field = new Person() {
		
		void work() {
			System.out.println("�����");
		}

		@Override
		void wake() {
			// TODO Auto-generated method stub
			System.out.println("6�ÿ� �Ͼ");
			work();			
		}
		
	};
	
	void method() {
		
		Person local = new Person() {
			
			void walk() {
				System.out.println("��å��");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("8�ÿ� �Ͼ");
				walk();
				
			}
			
		};
		
		local.wake();
				
	}
	
	void method2(Person person) {
		
		person.wake();
	}
	
}
