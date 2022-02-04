package exam22;

public class GenericPrinter<T> {

	private T meterial;
	
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	public T getMeterial() {
		return meterial;
	}
	
	public String toString() {
		return meterial.toString();
	}
	
}
