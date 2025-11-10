import java.util.Scanner;
public class week_7_6 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter how many terms: ");
            int n = sc.nextInt();
            int a = 0, b = 1;
            System.out.print("Fibonacci series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
    }