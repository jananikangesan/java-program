import java.util.Scanner;
public class LeapYear {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the year:");
        int y=in.nextInt();
//        if((y%4==0 && y%100!=0 ) || (y%4==0 && y%400==0 && y%100==0))
//            System.out.println("leap year");
//        else
//            System.out.println("not a leap year");
//        if(y%100==0){
//                if(y%400==0){
//                    System.out.println("leap year");
//                }else{
//                    System.out.println("not a leap year");
//                }
//        }
//        else if(y%4==0){
//                    System.out.println("leap year");
//        }else{
//                    System.out.println("not a leap year");
//        }

        if(y%4==0){
            if(y%400==0){
                System.out.println("leap year");
            }else{
                System.out.println("not a leap year");
            }
        }
//        else{
//            System.out.println("leap year");
//        }else{
//            System.out.println("not a leap year");
//        }


    }
}
