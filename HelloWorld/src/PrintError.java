import java.util.Scanner;
public class PrintError {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the single character:");
        String l=in.next();
        char ch=l.charAt(0);
        //System.out.println(ch);
        if(ch>=65 & ch<=90){
            System.out.println("capital letter");
        }else if(ch>=97 && ch<=122){
            System.out.println("simple letter");
        }else{
            System.out.println("error");
        }
    }
}
