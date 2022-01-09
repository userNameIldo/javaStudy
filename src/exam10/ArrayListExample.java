package exam10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list  = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); //2번 인덱스에 강제로 넣어서 2번 인덱스에 있던 Servlet/JSP부터 한개씩 뒤로 밀림 
		list.add("iBATIS");
		
		
		int size = list.size(); //list에 저장이 되어있는 총 개수 얻기
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2); //2번 인덱스의 객체 얻기
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) { //저장된 총 객체수 만큼 돌림
			String str = list.get(i);
			System.out.println(i + " : " + str);			
		}
		
		System.out.println();
		
		list.remove(2); //2번 인덱스의 객체 삭제
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);			
		}		
		
	}
}
