import java.util.Scanner;
public class Sum {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number1:");
        int num1=in.nextInt();
        System.out.println("enter number2:");
        int num2=in.nextInt();
        System.out.println("enter number3:");
        int num3=in.nextInt();
        System.out.println("sum:"+(num1+num2+num3));
        System.out.println("average:"+(num1+num2+num3)/3);
        //System.out.println("sum:"+(a+b+c));
        //System.out.println("average:"+(a+b+c)/3);

//        if(a>b) {
//            if (c > a) {
//                System.out.println("max:" + c);
//                System.out.println("min:" + b);
//            } else {
//                if (c > b) {
//                    System.out.println("max:" + a);
//                    System.out.println("min:" + b);
//                } else {
//                    System.out.println("max:" + c);
//                    System.out.println("min:" + a);
//                }
//            }
//        }
//        else{
//                if(c>b){
//                    System.out.println("max:"+c);
//                    System.out.println("min:"+a);
//                }else{
//                    if(c>a){
//                        System.out.println("max:"+b);
//                        System.out.println("min:"+a);
//                    }
//                    else{
//                        System.out.println("max:"+b);
//                        System.out.println("min:"+c);
//                    }
//                }
//        }
//

//        if(a>b){
//            if(a>c){
//                System.out.println("max:"+a);
//            }
//            else{
//                System.out.println("max:"+c);
//            }
//        }
//        else{
//            if(b>c){
//                System.out.println("max:"+b);
//            }else{
//                System.out.println("max:"+c);
//            }
//        }
//
//
//        if(a<b){
//            if(a<c){
//                System.out.println("min:"+a);
//            }
//            else{
//                System.out.println("min:"+c);
//            }
//        }
//        else{
//            if(b<c){
//                System.out.println("min:"+b);
//            }else{
//                System.out.println("min:"+c);
//            }
//        }


//        {
//            if(a>b & a>c)
//                System.out.println("max:"+a);
//            else if(b>c)
//                System.out.println("max:"+b);
//            else
//                System.out.println("max:"+c);
//        }
//
//        {
//            if(a<b & a<c)
//                System.out.println("min:"+a);
//            else if(b<c)
//                System.out.println("min:"+b);
//            else
//                System.out.println("min:"+c);
//        }
//

        float max,min;
        if(num1>num2){
           if(num1>num3){
               max=num1;
               min=num2;
               System.out.println("max:"+max);
               System.out.println("min:"+min);
           }else{
               max=num3;
               min=num2;
               System.out.println("max:"+max);
               System.out.println("min:"+min);

           }
        }else{
            if(num2>num3){
                max=num2;
                min=num1;
                System.out.println("max:"+max);
                System.out.println("min:"+min);
            }else{
                max=num3;
                min=num1;
                System.out.println("max:"+max);
                System.out.println("min:"+min);

            }
        }








        //Maximum Number
       //float max;
//        if(num1>=num2 & num1>=num3)
//            max=num1;
//        else if (num2>=num1 &num2>=num3)
//            max=num2;
//        else if (num3>=num1 & num3>=num2)
//            max=num3;
//        System.out.println("maximum:"+max);

//        if(num1>num2){
//            max=num1;
//        }
//        else{
//            max=num2;
//        }
//
//        if(max>num3){
//            System.out.println("max:"+max);
//        }
//        else{
//            System.out.println("max:"+num3);
//        }



        //Minimum Number
      //  float min;
//        if(num1<=num2 & num1<=num3)
//            min=num1;
//        else if (num2<=num1 &num2<=num3)
//            min=num2;
//        else if (num3<=num1 & num3<=num2)
//            min=num3;
//        System.out.println("minimum:"+min);

//        if(num1>num2){
//            min=num2;
//        }
//        else{
//            min=num1;
//        }

//        if(min>num3){
//            System.out.println("min:"+num3);
//        }
//        else{
//            System.out.println("min:"+min);
//        }

    }
}
