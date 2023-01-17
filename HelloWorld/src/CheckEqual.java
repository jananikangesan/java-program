import java.util.Scanner;
public class CheckEqual {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number:");
        float a=in.nextFloat();
        System.out.println("enter the second number:");
        float b=in.nextFloat();

//        a=Math.round(a*1000);
//        a=a/1000;
//        b=Math.round(b*1000);
//        b=b/1000;

        int x=(int)(a*1000);
        int y=(int)(b*1000);

        x=Math.round(x);
        y=Math.round(y);

        System.out.println(x);
        System.out.println(y);
        if(x==y)
            System.out.println("the two numbers are same");
        else
            System.out.println("the two numbers are different");
    }
}
