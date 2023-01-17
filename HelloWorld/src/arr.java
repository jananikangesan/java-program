import java.util.*;
public class arr {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        // int b=in.nextInt();
        int []a=new int[5];
        int num;
        for(int i=0;i<a.length;i++){
            System.out.print("enter the marks:");
            num=in.nextInt();
            a[i]=num;
        }
        int max=a[0]; int min=a[0];
        for(int i=0;i<4;i++){
            if(a[i]<max)
                continue;
            max=a[i];
        }
        System.out.println("max:"+max);
        //min=max;
        for(int i=0;i<4;i++){
            if(a[i]>max)
                continue;
            max=a[i];
            //System.out.println("min:"+i+":"+min);
        }

        System.out.println("min:"+max);


        //int max=0;
//        int min=a[0];
//        for(int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//            if(min>a[i] ){
//                min=a[i];
//            }
//        }

//        int j=1,k=0;
//        float []b=new float[10];
//        while(j<=10){
//            System.out.print("marks:");
//            b[j-1]=in.nextFloat();
//            j++;
//        }
//        float max=b[0],min=b[0];
//
//        while(k<10){
//            if(b[k]>max)
//                max=b[k];
//            if(b[k]<min)
//                min=b[k];
//            k++;
//        }
//        System.out.println("max:"+max);
//        System.out.println("min:"+min);










    }
}
