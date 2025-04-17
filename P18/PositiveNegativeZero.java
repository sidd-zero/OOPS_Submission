package P18;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("The number " + num + " is positive.");
        } else if (num < 0) {
            System.out.println("The number " + num + " is negative.");
        } else {
            System.out.println("The number " + num + " is zero.");
        }
        
        scanner.close();
    }
}
