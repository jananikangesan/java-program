public class fib {
    public static void main(String [] args){
        int n1=0,n2=1,n3=1;
        System.out.print(n1+",");
        System.out.print(n2+",");
        for(int i=2;i<20;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+",");

        }

    }
}
