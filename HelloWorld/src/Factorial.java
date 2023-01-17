import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int y=in.nextInt();
//        int n1=y;
//        int fact=1;
//        for(;n1>1;n1--){
//            fact=n1*fact;
//        }
        int a=1;
        int fact=1;
        while(a<=y){
            fact=fact*a;
            a++;
        }
        System.out.println("factorial:"+fact);
    }
}