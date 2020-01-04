package br.com.calc.classes;

public class Power extends MathematicalCalculation {

	public Power(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	protected int doCalc() {
		return (int) Math.pow(number1, number2); 
	}
	
}
