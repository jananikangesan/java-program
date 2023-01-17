import java.util.Scanner;
public class Vowel {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the single character:");
        String l=in.next();
        char ch=l.charAt(0);
       // System.out.println(ch);
       // if(ch=='a'||ch=='e' ||ch=='i'||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        if(ch==65||ch==69 ||ch==73||ch==79||ch==85 ||ch==97||ch==101||ch==105||ch==111||ch==117){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
