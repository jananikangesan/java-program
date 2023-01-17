import java.util.Scanner;
public class Print {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        float n=in.nextFloat();
        float a=Math.abs(n);
//        if(a<0)
//            System.out.print(a+"is a negative number");
//        else if(a>0 & a!=0)
//            System.out.print(a+"is a positive number");
//        else if(0<a & a<10)
//            System.out.print("and small number");
//        else if(a>1000000)
//            System.out.print("and large number");
//        else
//            System.out.print("zero");

//        String k=num+" is a";
//        if(num==0){
//            k=k+"zero";
//        }
//        else if(num>0){
//            k=k+"positive";
//        }else{
//            k=k+"negative";
//        }
//        float a=Math.abs(num);
//        if(a<10 & a!=0){
//            k=k+"and small";
//        }else if(a>1000000){
//            k=k+" and large";
//        }
//        System.out.println(k);


//        if(x==0){
//            System.out.println("zero");
//        }
//        else{
//            if(x>0) {
//                if (x < 10) {
//                    System.out.print(x + "is a positive number and small number");
//                } else {
//                    if (x > 1000000) {
//                        System.out.print(x + "is a positive number and large number");
//                    } else {
//                        System.out.print(x + "is a positive number");
//                    }
//                }
//            }
//            else{
//                System.out.print(x+"is a negative number");
//
//               // x=-x;
////                if(x<10){
////                    System.out.println(x+"is a negative number and small number");
////                }else{
////                    if(x>1000000){
////                        System.out.print(x+"is a negative number and large number");
////                    }else{
////                        System.out.print(x+"is a negative number");
////                    }
////                }
//            }
//        }

        if(n>0 && n<10)
            System.out.println(n+"is a positive number and small");
        else if(n>=10 && n<1000000)
            System.out.println(n+"is a positive number");
        else if(n>=1000000)
            System.out.println(n+"is a positive number");
        else if(n<0 && a<10)
            System.out.println(n+"is a negative number and small");
        else if(n<0 && a>=10 && a<1000000)
            System.out.println(n+"is a negative number ");
        else if(n<0 && a>=1000000)
            System.out.println(n+"is a negative number and large");
        else
            System.out.println(n+"is a zero");

    }
}
