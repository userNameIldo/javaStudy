package exam16;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenderPeople gp = new GenderPeople("�����", "����");
		
		System.out.println(gp.name);
		System.out.println(gp.gender);
		
		gp.checkPeople();
		
		gp.checkGender("����", "����");
		
		
		
	}

}
