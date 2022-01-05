package exam3;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com1 = new Computer();
		
		System.out.println("com1.company : " + com1.company);
		System.out.println();
		
		Computer com2 = new Computer("≥Î∆Æ∫œ");
		
		System.out.println("com2.company : " + com2.company);
		System.out.println("com2.company : " + com2.model);
		System.out.println();
		
		Computer com3 = new Computer("≥Î∆Æ∫œ", "∂Û¿Ã¡®");
		
		System.out.println("com3.company : " + com3.company);
		System.out.println("com3.company : " + com3.model);
		System.out.println("com3.company : " + com3.core);
		System.out.println();

		Computer com4 = new Computer("≥Î∆Æ∫œ", "∂Û¿Ã¡®", 450);
		
		System.out.println("com4.company : " + com4.company);
		System.out.println("com4.company : " + com4.model);
		System.out.println("com4.company : " + com4.core);
		System.out.println("com4.company : " + com4.netSpeed);
		System.out.println();
		
	}

}
