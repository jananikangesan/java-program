import java.util.Scanner;
public class ConvertInchToMeter {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length in inches:");
        double l=in.nextDouble();
        double m=l/39.3701;
        System.out.println("length is "+m+"m");
    }
}
