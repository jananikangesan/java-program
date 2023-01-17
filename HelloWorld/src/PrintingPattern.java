import java.util.Scanner;
public class PrintingPattern {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
//        int nc1=5;
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=3;j++){
//                System.out.print((j-1)*nc1+i+"\t");
//            }
//            System.out.println();
//        }
        /**************/
        int nc=5;
        //int nr=5;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((i-1)*nc+j+"\t");
            }
            System.out.println();
        }
        /*************/

//        for(int i=1;i<10;i++){
//            int a=(int)Math.pow(i,2);
//            System.out.print(a+",");
//        }
//        System.out.print(100);
/***********************/
//        System.out.print("enter your string text:");
//        String t=in.next();
//        int x=t.length();
//        do{
//            char b=t.charAt(x-1);
//            System.out.print(b);
//            x--;
//        }
//        while(x>=1);
//        while(x>=0){
//            char a=t.charAt(x);
//            System.out.print(a);
//            x--;
//        }
//        for(int i=1;i<=x;i++){
//           char a=t.charAt(x-i) ;
//           System.out.print(a);
//        }
/*********************/
//        int sum=0;
//        int i=1;
//        do{
//            sum=sum+i;
//            i++;
//
//        }while(i<=100);
//        System.out.print("sum="+sum);
        /****************************/
      for(int i=1;i<=10;i++){
          System.out.print(Math.pow(i,2)+",");
      }
        /*************************/
//        int i=1;
//        do{
//            System.out.print((int)Math.pow(i,2)+",");
//            i++;
//        }while(i<=10);
    }
}
