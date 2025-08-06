import java.util.Scanner;
 
public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";
 
        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
 
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();
 
            System.out.print("Choose operation (+, -, *, /): ");
            char operator = input.next().charAt(0);
 
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid operator.");
            }
 
            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();
        }
 
        System.out.println("Thank you for using the calculator.");
    }
}