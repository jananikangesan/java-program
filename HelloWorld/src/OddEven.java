import java.util.Scanner;
public class OddEven {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=in.nextInt();
        int b;
        b=(a%2);
        if(b==0)
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");

    }
}
