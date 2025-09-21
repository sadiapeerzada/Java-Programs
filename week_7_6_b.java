import java.util.Scanner;
public class week_7_6_b {
        public static int fibonacci(int n) {
            if (n == 0) return 0;   // base case
            if (n == 1) return 1;   // base case
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter how many terms: ");
            int n = sc.nextInt();

            System.out.print("Fibonacci series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

