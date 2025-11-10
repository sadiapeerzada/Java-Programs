import java.util.Scanner;
public class WEEK_4_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        while (n>=10){
            n/=2;
        }
        System.out.println("Result : "+n);
    }
}
