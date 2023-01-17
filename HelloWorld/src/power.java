import java.util.Scanner;
public class power {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("base:");
        int a=in.nextInt();
        System.out.println("exponent:");
        int b=in.nextInt();

        //int i=1;


//        do{
//            i=i*a;
//            b--;
//        }while(b>=1);
//        System.out.print(i);
//        int power=1;
//        while(b>=i){
//            power=power*a;
//            ++i;
//        }
//        for(;b>0;b--){
//            c*=a;
//        }

        float m=1;
        for(int i=1;i<=b;i++){
            m=m*a;
        }
       System.out.println("result:"+m);
    }
}
