import java.util.*;
public class Number {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
//        int sum=0;
//        for(int i=0;i<=10;i++){
//            sum=sum+i;
//        }System.out.println(sum);
        /***************************/
//        System.out.println("enter number x=");
//        int x=in.nextInt();
//        int fact=1;
//        int i=1;
//        while(i<=x){
//            fact=fact*i;
//            i++;
//        }System.out.println(fact);
        /**********************************/
        int sum1=0;
        for(int i=1;i<=100;i+=2){
            sum1=sum1+i;
        }System.out.println(sum1);

        int sum2=0;
        for(int i=0;i<=100;i+=2){
            sum2=sum2+i;
        }System.out.println(sum2);

        /**********************************************/

        int i=1;
        do{
            System.out.print(i+",");
            i+=2;
        }while(i<=100);
        System.out.println(" ");
        int v=2;
        do{
            System.out.print(v+ ", ");
            v+=2;
        }while(v<=100);
        System.out.println(" ");
        int u=5;
        do{
            System.out.print(u+", ");
            u+=5;
        }while(u<=100);

    }
}
