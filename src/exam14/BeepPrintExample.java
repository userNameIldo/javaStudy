package exam14;

public class BeepPrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			
			try {
				
				thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

	}

}
