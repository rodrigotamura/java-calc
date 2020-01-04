package br.com.calc.classes;

public class Divide extends MathematicalCalculation {

	public Divide(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	protected int doCalc() {
		return number1 / number2;
	}
	
	@Override
	public Boolean validate() {
		return number1 > 0 && number2 > 0;
	}

}
