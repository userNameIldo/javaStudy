package exam21;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qu = new LinkedList<String>();
		qu.offer("1");
		qu.offer("2");
		qu.offer("3");
		qu.offer("4");
		
		while(!qu.isEmpty()) {
			 
			 System.out.println(qu.poll());
			 
		 }
		

	}

}
