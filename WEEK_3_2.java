import java.util.Scanner;
public class WEEK_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float x = sc.nextFloat();
        System.out.print("Enter second float number: ");
        float y = sc.nextFloat();
        float product = x * y;
        System.out.println("The product is: " + product);
    }
}
