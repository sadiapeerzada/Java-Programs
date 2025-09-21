import java.util.Scanner;
public class WEEK_3_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}
