package net.franckbenault.testcatchexception;

public class Calculator {

	public double squareRoot(int x) throws IllegalArgumentException {
		
		if(x<0) {
			throw new IllegalArgumentException("Could not calculate the squareRoot of a negative number");
			
		} else {
			return Math.sqrt(x);
		}
	}
}
