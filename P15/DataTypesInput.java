package P15;
import java.util.Scanner;

public class DataTypesInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();
        
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        
        
        
        System.out.println("\nValues entered by the user:");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
       
        
        scanner.close();
    }
}
