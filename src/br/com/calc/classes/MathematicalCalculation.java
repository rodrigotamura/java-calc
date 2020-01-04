package br.com.calc.classes;

import br.com.calc.interfaces.MathCalculator;

public abstract class MathematicalCalculation implements MathCalculator {
	
	protected int number1;
	protected int number2;
	
	public MathematicalCalculation(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	@Override
	public Boolean validate() {
		// By default, it will not accept negative numbers
		return number1 >= 0 && number2 >= 0;
	}

	@Override
	public final int calc() { // in design pattern it is Template Method. Final cannot be override
		if (validate()) {
			// In Template Method Pattern, we always have doSomething()
			return doCalc();
		}else {
			return -1;
		}
	}
	
	protected abstract int doCalc();

}
