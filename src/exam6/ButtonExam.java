package exam6;

public class ButtonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button button = new Button();
		
		button.setOnClickListener(new CallListener());
		button.Click();
		
		button.setOnClickListener(new MessageListener());
		button.Click();
		
	}

}
