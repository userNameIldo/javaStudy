package exam18;

public class Task implements Runnable{ //인터페이스 타입으로
    @Override
    public void run(){
          for(int i = 0; i <= 5; i++){
                System.out.println(i);
          }
    }
    
    public static void main(String[] args) {
    	//객체를 생성
    	Runnable task = new Task();
    	task.run();
    	
    }
    
}