package exam18;

public class Task implements Runnable{ //�������̽� Ÿ������
    @Override
    public void run(){
          for(int i = 0; i <= 5; i++){
                System.out.println(i);
          }
    }
    
    public static void main(String[] args) {
    	//��ü�� ����
    	Runnable task = new Task();
    	task.run();
    	
    }
    
}