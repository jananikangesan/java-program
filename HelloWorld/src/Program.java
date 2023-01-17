public class Program {
    public static void main(String [] args){
        //int rt=5;
       for(int i=0;i<5;i++){
           //row--;
           for(int j=i+1;j<=5;j++){
               System.out.print(j+" ");
           } System.out.println(" ");
       }
///*******************************************/
//int n=5;
       for(int r=1;r<=5;r++){
           for(int j=1;j<6-r;j++){

                System.out.print(" ");
           }for(int j=1;j<=r;j++){

               System.out.print("*");
           }

           System.out.println();
       }
//  /********************************************/
//int nr=5;
        for(int r=1;r<=5;r++){
            for(int j=1;j<6-r;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*r-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

/************************/


for(int a=1;a<5;a++){
    for(int b=a;b<=20;b=b+4){
        System.out.print(b+" ");
    }
    System.out.println();
}













/*************************/
//        int i=0;
//        while(i<4){
//            int j=4-i;
//            while(j>0){
//                System.out.print(" ");
//                j--;
//            }
//            int k=1+(2*i);
//            while(k>0){
//                System.out.print("*");
//                k--;
//            }System.out.print("\n");
//            i++;
//        }


    }
}
