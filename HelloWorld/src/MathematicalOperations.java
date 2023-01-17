import java.util.Scanner;
public class MathematicalOperations {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=in.nextInt();
        System.out.println();
        System.out.print("enter the second number:");
        int b=in.nextInt();
        double c=(a+b)/2;
        System.out.println("sum of two integers: "+(a+b));
        System.out.println("difference of two integers: "+(a-b));
        System.out.println("product of two integers: "+(a*b));
        System.out.println("average of two integers: "+c);
        System.out.println("distance of two integers: "+Math.abs(a-b));
    }
}
