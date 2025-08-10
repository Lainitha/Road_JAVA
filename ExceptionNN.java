public class ExceptionNN {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;
        int x = 0;

        int[] listu = new int[5];

        // Handle division by zero
        try {
            int j = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        // Handle array index out of bounds
        try {
            listu[5] = 10; // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }

        // Handle custom exception & avoid accidental divide-by-zero
        try {
            if (x == 0) {
                throw new LainithaException("Lainitha Exception Customized");
            }
            int y = denominator / x; // this will only run if x != 0
        } catch (LainithaException e) {
            System.out.println("Lainitha Exception occurred: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}

// Custom Exception class
class LainithaException extends Exception {
    public LainithaException(String eMessage) {
        super(eMessage);
    }
}
