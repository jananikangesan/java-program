import java.util.Scanner;
class UserInput {
 public static void main(String [] args){
     Scanner in=new Scanner(System.in);
     System.out.print("Enter your name:");
     String name=in.nextLine();
     System.out.println("Welcome"+name);
     System.out.println("Please enter two numbers:");
     System.out.print("\ta=");
     float a=in.nextFloat();
     System.out.print("\tb=");
     float b=in.nextFloat();
     System.out.println(a+"+"+b+"="+(a+b));
     System.out.println(a+"-"+b+"="+(a-b));
     System.out.println(a+"*"+b+"="+(a*b));
     System.out.println(a+"/"+b+"="+(a/b));



 }
}
