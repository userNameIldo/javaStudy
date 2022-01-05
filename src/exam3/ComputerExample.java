package exam3;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com1 = new Computer();//생성자 호출
		
		System.out.println("com1.company : " + com1.company);
		System.out.println();
		
		//생성자 오버로딩 매개변수의 타입, 개수가 다르게 선언
		
		Computer com2 = new Computer("노트북");
		
		System.out.println("com2.company : " + com2.company);
		System.out.println("com2.company : " + com2.model);
		System.out.println();
		
		Computer com3 = new Computer("노트북", "라이젠");
		
		System.out.println("com3.company : " + com3.company);
		System.out.println("com3.company : " + com3.model);
		System.out.println("com3.company : " + com3.core);
		System.out.println();

		Computer com4 = new Computer("노트북", "라이젠", 450);
		
		System.out.println("com4.company : " + com4.company);
		System.out.println("com4.company : " + com4.model);
		System.out.println("com4.company : " + com4.core);
		System.out.println("com4.company : " + com4.netSpeed);
		System.out.println();
		
	}

}
