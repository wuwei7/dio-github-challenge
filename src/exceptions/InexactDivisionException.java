package exceptions;

public class InexactDivisionException extends Exception{

    private int dividend;
    private int divisor;

    public InexactDivisionException(String message, int dividend, int divisor) {
        super(message);
        this.dividend = dividend;
        this.divisor = divisor;
    }
}
