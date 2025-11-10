import java.util.Scanner;
public class week_4_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter num 2 : ");
        int n2=sc.nextInt();
        System.out.println("Enter num 3 : ");
        int n3=sc.nextInt();
if(n1>n2 && n1>n3){
    System.out.println(n1 + " is the largest number among "+ n1 +","+ n2 +" and" +n3);
}
else if(n2>n1 && n2>n3){
    System.out.println(n2 + " is the largest number among " + n1 +","+ n2 +" and " +n3);

}
else {
    System.out.println(n3+" is the largest number among "+ n1 + ","+ n2 +" and " +n3);
}
    }
}
