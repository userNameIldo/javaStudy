package exam8;

public class ThrowsExample {

	//main�� ����ó�� �������� JVM�� ����ó���� ���ѱ�
	public static void main(String[] args) // throws ClassNotFoundException { 
	{	// TODO Auto-generated method stub
		try {
		
			findClass();
			
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
				
	}
	
	public static void findClass() throws ClassNotFoundException { //ȣ��� ������ ����ó�� ���ѱ��
		
		Class clazz = Class.forName("java.lang.String2");
		
	}
	
}
