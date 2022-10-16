package oop.interfaces;

public class Calculator implements MathOperations {
	
	@Override
	public void sum(double operand1, double operand2) {
		System.out.println("Sum: " + (operand1 + operand2));
	}

	@Override
	public void subtraction(double operand1, double operand2) {
		System.out.println("Sum: " + (operand1 - operand2));
	}

	@Override
	public void multiplication(double operand1, double operand2) {
		System.out.println("Sum: " + (operand1 * operand2));
	}

	@Override
	public void division(double operand1, double operand2) {
		System.out.println("Sum: " + (operand1 / operand2));
	}
	
	

}
