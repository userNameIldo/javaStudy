package exam12;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			
		}
		
		System.out.println("���� ������ ����");
		
	}

}
