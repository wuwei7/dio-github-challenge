package exceptions;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		
		boolean keepGoing = true;
		do {
			String a = JOptionPane.showInputDialog("Dividend: ");
			String b = JOptionPane.showInputDialog("Divisor: ");
			
			try {
				int result = divide(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println("Result: " + result);
				keepGoing = false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Invalid input. Give a number. " + e.getMessage());
			} catch (ArithmeticException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "You cannot divide a number by 0. Please try again.");
			} finally {
				System.out.println("Finally, we're at finally.");
			}
		} while(keepGoing);
		
		System.out.println("The code keeps on going...");

	}
	
	public static int divide(int a, int b) {
		return a / b;
	}

}
