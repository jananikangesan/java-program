import java.util.Scanner;
import java.lang.Math;
public class Area {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius(cm):");
        float r=in.nextFloat();
//        if(r<0){
//            System.out.println("Invalid Value");
//            System.out.println("Run again...");
//        }
//        else{
//            float a=(22*r*r/7);
//            System.out.println("Area="+a+"cm^2");
//            float c=(2*22*r/7);
//            System.out.println("Circumference="+c+"cm");
//        }

//        System.out.println("area:"+ (r*r*Math.PI));
//        System.out.println("circumference:"+(2*Math.PI*r));

        //float pi=22/7;
        System.out.println("area:"+ (22*r*r)/7);
        System.out.println("circumference:"+(2*22*r)/7);

    }
}
