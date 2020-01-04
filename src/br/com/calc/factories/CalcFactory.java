package br.com.calc.factories;

import br.com.calc.classes.Divide;
import br.com.calc.classes.Multiply;
import br.com.calc.classes.Power;
import br.com.calc.classes.Sub;
import br.com.calc.classes.Sum;
import br.com.calc.interfaces.MathCalculator;

public class CalcFactory {
	// Factory pattern will decide which class the program ill choose based on main calling
	
	public MathCalculator createCalc(int number1, int number2, String signal) {
		if (signal.equals("+")) {
			return new Sum(number1, number2);
		} else if (signal.equals("-")) {
			return new Sub(number1, number2);
		} else if (signal.equals("*")) {
			return new Multiply(number1, number2);
		} else if (signal.equals("/")) {
			return new Divide(number1, number2);
		} else if (signal.equals("^")) {
			return new Power(number1, number2);
		} else {
			return null;
		}
	}

}
