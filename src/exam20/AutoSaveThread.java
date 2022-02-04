package exam20;

public class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("저장합니다.");
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
