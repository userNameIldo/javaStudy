package exam1;

public class referenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello"); //��ü ���� �����ڴ� �������� ���� ��ü�� �����Ͽ� �ּҰ��� �ٸ���
		
		System.out.println("str1==str2 : " + (str1==str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str3==str2 : "+ (str3==str2));
		System.out.println("str3.equals(str2) : " + str3.equals(str2));
		System.out.println("str3==str4 : "+ (str3==str4));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		System.out.println("str4 : " + str4.hashCode());
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4));

		
		
	}

}
