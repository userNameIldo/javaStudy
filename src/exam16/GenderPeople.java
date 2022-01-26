package exam16;

public class GenderPeople extends People{

	String gender;
	
	public GenderPeople(String name, String gender) {
		
		super(name);
		this.gender = gender;
		
	}
	
	void checkGender(String name, String gender) {
		
		System.out.println(name + "의 성별은 " + gender + "입니다."); 
		
	}
	
}
