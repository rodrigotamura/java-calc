package br.com.calc.classes;

public class Sum extends MathematicalCalculation {

	public Sum(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	protected int doCalc() {
		return number1 + number2;
	}

}
