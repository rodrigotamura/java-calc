package br.com.calc.app;

import br.com.calc.factories.CalcFactory;
import br.com.calc.interfaces.MathCalculator;

public class App {

	public static void main(String[] args) {
		String signal = "^"; // <- change signal here
		int number1 = 8;	 // <- change number1 here
		int number2 = 2;	 // <- change number2 here
		
		// using factory
		CalcFactory factory = new CalcFactory();
		
		MathCalculator calc = factory.createCalc(number1, number2, signal);
		
		if (calc != null) {
			System.out.println(calc.calc());
		} else {
			System.out.println("Invalid calculation");
		}
	}

}
