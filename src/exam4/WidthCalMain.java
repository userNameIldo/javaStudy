package exam4;

public class WidthCalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WidthCal cal = new WidthCal();
		
		//메소드 오버로드
		double area1 = cal.rectangle(5.5);
		double area2 = cal.rectangle(5.5, 4.5);
		
		System.out.println(area1);
		System.out.println(area2);
		
	}

}
