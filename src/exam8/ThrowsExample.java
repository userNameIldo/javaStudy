package exam8;

public class ThrowsExample {

	//main에 예외처리 했음으로 JVM에 예외처리를 떠넘김
	public static void main(String[] args) // throws ClassNotFoundException { 
	{	// TODO Auto-generated method stub
		try {
		
			findClass();
			
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		}
				
	}
	
	public static void findClass() throws ClassNotFoundException { //호출된 곳으로 예외처리 떠넘기기
		
		Class clazz = Class.forName("java.lang.String2");
		
	}
	
}
