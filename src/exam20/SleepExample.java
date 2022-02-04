package exam20;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}

	}

}
