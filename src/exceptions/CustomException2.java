package exceptions;

import javax.swing.JOptionPane;

public class CustomException2 {
	
	public static void main(String[] args){
        int[] dividend = {4, 5, 8, 10};
        int[] divisor = {2, 4, 0, 2, 8};

        for (int i = 0; i < divisor.length; i++) {
            try {
                if (dividend[i] % 2 != 0) throw new InexactDivisionException("Inexact division!", dividend[i], divisor[i]);
                int result = dividend[i] / divisor[i];
                System.out.println(result);
            } catch (InexactDivisionException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("The program keeps on going...");
    }
}
