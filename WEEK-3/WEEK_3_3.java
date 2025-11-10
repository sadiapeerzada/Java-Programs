import java.util.Scanner;
public class WEEK_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double cube = Math.pow(num,3);
        System.out.println("Cube of " + num + " is: " + cube);
    }
}
