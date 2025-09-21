import java.util.Scanner;
public class week_4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
