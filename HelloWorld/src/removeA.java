import java.util.*;
public class removeA {
    public static void main(String [] args){
       Scanner in=new Scanner(System.in);
       System.out.print("string:");
       String s=in.nextLine();
       int l=s.length();
        for(int i=0;i<l;i++){
            char b;
            b=s.charAt(i);
            if(b=='a'){
               continue;
            }
            //else{
                System.out.print(b);
            //}
        }

//        int j=0;
//        char c1;
//        while(l>0){
//            c1=s.charAt(j);
//            if(c1!='a')
//                System.out.print(c1);
//            j++;
//            l--;
//        }


    }
}
