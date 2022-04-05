package org.CalculatorService;

public class CalculatorMath {

	
	
	public int doMath(int numOne, int numTwo, String symbol) {
		
		if (symbol.equals("+")) {	
			// add
			return numOne +numTwo;
		}

		if (symbol.equals("-")) {
			// subtract
			return numOne - numTwo;
		}

		if (symbol.equals("*")) {
			// multiply
			return numOne * numTwo;
		}

		if (symbol.equals("/")) {
			// divide
			return numOne / numTwo;
		}
		return 0;
	}
	
	
}
