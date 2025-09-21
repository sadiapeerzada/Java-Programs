import java.util.Scanner;
public class week_5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int reversed = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (number < 0) {
            reversed *= -1;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
