package br.com.calc.classes;

public class Sub extends MathematicalCalculation {

	public Sub(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	protected int doCalc() {
		return number1 - number2;
	}

}
