public class marks {
    public static void main(String [] args){

      System.out.println("\nStudent \t ICA 1 \t ICA 2\tece \t final marks");
      String []p={"A","B","C"};
      int []x={90,60,70};
      int []y={70,80,80};
      int []z={75,65,95};


      for(int r=0;r<x.length;r++){
          System.out.println("\t"+p[r]+"\t"+x[r]+"\t"+y[r]+"\t"+z[r]+"\t"+((x[r]+y[r])*0.15+z[r]*0.7));
      }
      float b[]=new float[3];
      for(int i=0;i<=2;i++){
          b[i]=(float)((x[i]+y[i])*0.15+z[i]*0.7);
      }
      float max=b[0];
      for(int j=0;j<=2;j++){
          if(b[j]>max)
              max=b[j];
          else max=max;
      }
      System.out.println("\n highest final marks="+max);





    }
}
