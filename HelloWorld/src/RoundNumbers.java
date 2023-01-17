import java.util.Scanner;
//import java.lang.Math;
public class RoundNumbers {
    public static void main(String [] args){
        Scanner in=new Scanner (System.in);
        System.out.print("enter a number:");
        float a=in.nextFloat();
        int r=Math.round(a);
        System.out.println("closest integer:" + r);

    }
}
