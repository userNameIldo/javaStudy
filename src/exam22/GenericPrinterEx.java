package exam22;

public class GenericPrinterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powder = new GenericPrinter<>();
		powder.setMeterial(new Powder());
		Powder pd = powder.getMeterial();
		System.out.println(powder);

	}

}
