package exam20;

public class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("�����մϴ�.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
