import java.util.*;
public class Operators {
    public static void main(String [] args){
        char y=' ';
        char s=' ';
        first:
      do{
            Scanner in=new Scanner(System.in);
            System.out.print("enter num1:");
            int a=in.nextInt();
            System.out.print("enter num2:");
            int b=in.nextInt();
            System.out.print("enter operator:");
            String  c=in.next();

            while(!((c.equals("+"))||(c.equals("-"))||(c.equals("*"))||(c.equals("/")) ))
            {
                System.out.print("enter operator:");
                c=in.next();

            }

            if(c.equals("+")){
                System.out.println(a+"+"+b+"="+(a+b));
            }else if(c.equals("-")){
                System.out.println(a+"-"+b+"="+(a-b));
            }else if(c.equals("*")){
                System.out.println(a+"*"+b+"="+(a*b));
            }else if(c.equals("/")){
                System.out.println(a+"+"+b+"="+(a/b));
            }
           System.out.print("do you continue?");
           String d=in.next();

           while(true){

               if(d.equals("y") || d.equals("Y")){
                   continue first ;
               }else if (d.equals("n") || d.equals("N")){
                   break first;
               }else{
                   System.out.print("UNRECOGNIZED INPUT ENTER Y OR N:");
                   d=in.next();
                   //continue ;
               }


           }




        }while(true);
    }
}

