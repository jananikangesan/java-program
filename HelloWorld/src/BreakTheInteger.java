import java.util.Scanner;
public class BreakTheInteger {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("input six non-negative digit:");
        int x=in.nextInt();
        int a=x/100000 %10;
        int b=x/10000 %10;
        int c=x/1000 %10;
        int d=x/100 %10;
        int e=x/10 %10;
        int f=x %10;

//        int na1=a/100000 ;
//        int na2=a% 100000;
//        //System.out.println(na1);
//        //System.out.println(na2);
//        int nb1=na2/10000;
//        int nb2=na2%10000;
//        int nc1=nb2/1000;
//        int nc2=nb2%1000;
//        int nd1=nc2/100;
//        int nd2=nc2%100;
//        int ne1=nd2/10;
//        int ne2=nd2%10;
//        int nf1=ne2/1;
//        int nf2=ne2%1;



        //System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
        //System.out.println(na1+" "+nb1+" "+nc1+" "+nd1+" "+ne1+" "+nf1);

        if(x>1000000 | x<1)
            System.out.println("enter a valid digit");
        else
            if(x>100000 & x<1000000)
                System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
            else if(x>10000 & x<100000)
                System.out.println(b+" "+c+" "+d+" "+e+" "+f);
            else if(x>1000 & x<10000)
                System.out.println(c+" "+d+" "+e+" "+f);
            else if(x>100 & x<1000)
                System.out.println(d+" "+e+" "+f);
            else if(x>10 & x<100)
                System.out.println(e+" "+f);
            else if(x>1 & x<10)
                System.out.println(f);
        System.out.println("thank you !");
    }
}
