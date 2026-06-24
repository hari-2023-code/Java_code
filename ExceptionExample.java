public class ExceptionExample {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot divide by zero.");
        }

        System.out.println("Program continues after exception handling.");
    }
}