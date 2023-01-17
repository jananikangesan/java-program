import java.util.Scanner;
public class switchCondition {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("input1:");
        float n1=in.nextFloat();
        System.out.println("input2:");
        float n2=in.nextFloat();
        System.out.println("operator:");
        char op=in.next().charAt(0);
        String x="";
        // =in.next();
        float result=0;
        switch(op){
            case '+':x=(n1+"+"+n2+"="+(n1+n2));
            break;
            case '-':x=(n1+"-"+n2+"="+(n1-n2));
            break;
            case '*':x=(n1+"*"+n2+"="+(n1*n2));
            break;
            case '/':x=(n1+"/"+n2+"="+(n1/n2));
            break;
            default:
               // x="invalid";
                System.out.println("\n enter mathematical operations");
        }
        System.out.println("result:"+x);
    }
}
