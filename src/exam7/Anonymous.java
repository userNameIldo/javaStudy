package exam7;

public class Anonymous {

	Person field = new Person() {
		
		void work() {
			System.out.println("출근함");
		}

		@Override
		void wake() {
			// TODO Auto-generated method stub
			System.out.println("6시에 일어남");
			work();			
		}
		
	};
	
	void method() {
		
		Person local = new Person() {
			
			void walk() {
				System.out.println("산책함");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("8시에 일어남");
				walk();
				
			}
			
		};
		
		local.wake();
				
	}
	
	void method2(Person person) {
		
		person.wake();
	}
	
}
