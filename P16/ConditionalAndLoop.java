package P16;
import java.util.Scanner;

public class ConditionalAndLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println("\nNumbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
