package br.com.calc.classes;

public class Multiply extends MathematicalCalculation {

	public Multiply(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	protected int doCalc() {
		return number1 * number2;
	}

}
