package exam15;

public class PhoneExample {
			public static void main(String[] args) {
				
				//Phone phone = new Phone("강감찬"); 추상 클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성 x
				//추상 클래스는 새로운 실체 클래스를 만들기 위해 부모 클래스로만 사용된다.
				
				SmartPhone smartPhone = new SmartPhone("홍길동");
				
				smartPhone.turnOn();
				smartPhone.turnOff();
				
			}
}
