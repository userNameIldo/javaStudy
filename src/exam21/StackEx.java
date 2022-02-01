package exam21;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<String> st = new Stack<String>();
		 
		 st.push("1");
		 st.push("2");
		 st.push("3");
		 st.push("4");
		 
		 while(!st.isEmpty()) {
			 
			 System.out.println(st.pop());
			 
		 }

	}

}
