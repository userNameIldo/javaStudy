package Lamda;

import java.util.function.IntFunction;

public class test1 {

	public static void main(String[] args) {
		
		Math plusCalc = (num1, num2) -> num1 + num2;
		
		System.out.println(plusCalc.Calc(5, 6));
		
		Math manusCalc = (num1, num2) -> num1 - num2;
		
		System.out.println(manusCalc.Calc(7, 2));
		
		Math multiCalc = (num1, num2) -> num1 * num2;
		
		System.out.println(multiCalc.Calc(5, 2));
		
		IntFunction intSum = x -> x+1;
		
		System.out.println(intSum.apply(6));
		
	}

}
