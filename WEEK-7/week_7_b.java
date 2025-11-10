import java.util.Scanner;
public class week_7_b {
     public static int gcd(int a, int b) {
            if (b == 0) {
                return a; // base case
            }
            return gcd(b, a % b); // recursive call
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("GCD = " + gcd(num1, num2));
        }
    }
