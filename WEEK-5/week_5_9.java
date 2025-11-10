import java.util.Scanner;
public class week_5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. Decimal to Hexadecimal");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Decimal to Hexadecimal
            System.out.print("Enter a decimal number: ");
            int decimal = sc.nextInt();
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("Hexadecimal: " + hex);

        } else if (choice == 2) {
            // Hexadecimal to Decimal
            System.out.print("Enter a hexadecimal number: ");
            String hex = sc.next();
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("Decimal: " + decimal);

        } else {
            System.out.println("Invalid choice.");
        }
    }
}