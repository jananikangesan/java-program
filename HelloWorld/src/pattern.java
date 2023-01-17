import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
//        int i=1;
//        while(i<=5){
//            System.out.print(i +" "+i*5 + " ");
//            int j=4;
//            while(j<=8){
//                System.out.print(i *5+j + " ");
//                j+=4;
//            }
//            System.out.print("\n");
//            i++;
//        }

//        for(int j=1;j<=3;j++){
//            for(int i=1;i<=5;i++){
//                System.out.print(i+ " ");
//            }
//            System.out.print("\n");
//        }System.out.print("\n"+ "\n");


//        int k=0;
//        while((k/5)<3){
//            int l=1;
//            while(l<=5){
//                System.out.print((k+l)+" ");
//                l++;
//            }System.out.print("\n");
//            k+=5;

//        for(int r=1;r<5;r++){
//            for(int c=1;c<=r;c++){
//                System.out.print(c+" ");
//            }System.out.println();
//        }

//        String str1=in.nextLine();
//        System.out.println("output:");
//        char ch;
//        for(int i=str1.length()-1;i>=0;i--){
//            ch=str1.charAt(i);
//            System.out.print(ch);
//        }

//        int i=1;
//      while(i<=10){
//           System.out.print((int)Math.pow(i,2)+",");
//           i++;     }

//        for(int r=1;r<=5;r++){
//            for(int c=1;c<(r+1);c++){
//                System.out.print(c+"\t");
//            }System.out.println();
//        }

//        for(int r=5;r>=1;r--){
//            for(int c=1;c<=r;c++){
//                System.out.print(c+"\t");
//            }System.out.println();
//        }

        int sum=0;
        for(int num=1;num<=10;num++){
            sum=sum+num;
        }System.out.print(sum);

    }
}
