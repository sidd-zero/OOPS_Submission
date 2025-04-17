package P11;
// Write a Java program that asks the user to input two integers and performs division (num1 / num2).
// If the second number (num2) is zero, the program should catch the ArithmeticException using a try-catch block
// and display an appropriate error message like "Cannot divide by zero."

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
