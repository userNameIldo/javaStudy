package exam10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list  = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); //2�� �ε����� ������ �־ 2�� �ε����� �ִ� Servlet/JSP���� �Ѱ��� �ڷ� �и� 
		list.add("iBATIS");
		
		
		int size = list.size(); //list�� ������ �Ǿ��ִ� �� ���� ���
		System.out.println("�� ��ü�� : " + size);
		System.out.println();
		
		String skill = list.get(2); //2�� �ε����� ��ü ���
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) { //����� �� ��ü�� ��ŭ ����
			String str = list.get(i);
			System.out.println(i + " : " + str);			
		}
		
		System.out.println();
		
		list.remove(2); //2�� �ε����� ��ü ����
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);			
		}		
		
	}
}
