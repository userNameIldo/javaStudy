package exam22;

public class GenericTest <T>{

	private T type;
	
	public void setType(T type) {
		this.type = type;
	}
	
	public T getType() {
		return type;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericTest<String> a = new GenericTest<>();
		a.setType("String Çü");
		System.out.println(a.getType());

	}

}
