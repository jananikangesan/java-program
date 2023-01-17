import java.util.Scanner;
public class Days {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=in.nextInt();
        if(a==1)
            System.out.println("monday");
        if(a==2)
            System.out.println("tuesday");
        if(a==3)
            System.out.println("wednesday");
        if(a==4)
            System.out.println("thursday");
        if(a==5)
            System.out.println("friday");
        if(a==6)
            System.out.println("saturday");
        if(a==7)
            System.out.println("sunday");
    }
}
