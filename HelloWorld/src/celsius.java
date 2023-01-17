import java.util.Scanner;
public class celsius {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        float  c=in.nextFloat();
        double f=((9.0*c)/5.0 )+32.0;
        System.out.println("temperature:"+f);
    }

}
