import java.util.Scanner;
public class week_4_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N=sc.nextInt();
        int sum=0;
for (int i=1;i<=N;i++){
    sum+=i;
}
        System.out.println("The sum of the series is : " +sum);
    }
}
