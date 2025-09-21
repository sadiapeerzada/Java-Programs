import java.util.Scanner;
public class week_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        int smallest = a;
        if (b < a) {
            smallest = b;
        }
        if (c < a) {
            smallest = c;
        }
        if (d < a) {
            smallest = d;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}
