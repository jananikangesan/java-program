import java.util.Scanner;
public class PassOrFail {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("csc101s2:");
        float a=in.nextFloat();
        System.out.print("csc102s2:");
        float b=in.nextFloat();
        System.out.print("csc103s2:");
        float c=in.nextFloat();
        System.out.print("csc104s2:");
        float d=in.nextFloat();
        System.out.print("csc105s2:");
        float e=in.nextFloat();
        float avg;
        avg=(a+b+c+d+e)/5;
        if(avg>=50){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
