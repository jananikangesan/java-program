import java.util.Scanner;
class test{
	public static void main(String args[]){
		System.out.println("escape characters");
		System.out.println("----------------");
		System.out.println("\\b\t\"backspace\"\t\t|\t\\\\\t\"backslash\"\t|");
		System.out.println("\\n\t\"new line\"\t\t|\t\"\t\"double quote\"\t|");
		System.out.println("\\t\t\"tab\"\t\t\t|\t\'\t\"single quotes\"\t|");
		System.out.println("\\r\t\"carriage return\"\t|");
	}
}

class A{
	public static void main(String args[]){
		System.out.println("*");
		System.out.println("**");
		
	}
}

class B{
	public static void main(String args[]){
		System.out.println("       299");
		System.out.println("+      800");
		System.out.println("----------");
		System.out.println("      1099");
		System.out.println("----------");
		
	}
}

class C{
	public static void main(String args[]){
		System.out.println("\t299");
		System.out.println("+\t800");
		System.out.println("----------");
		System.out.println("      1099");
		System.out.println("----------");
		
	}
}

class test1{
	public static void main(String args[]){
		System.out.println("escape characters");
		System.out.println("----------------");
		System.out.println("\\b\t\t\"backspace\"\t\t\t|\t\t\\\\\t\t\"backslash\"\t|");
		System.out.println("\\n\t\t\"new line\"\t\t\t|\t\t\"\t\t\"double quote\"\t|");
		System.out.println("\\t\t\t\"tab\"\t\t\t\t|\t\t\'\t\t\"single quotes\"\t|");
		System.out.println("\\r\t\t\"carriage return\"\t\t|");
	}
}




class celsius {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        double  c=in.nextDouble();
        double f=((9*c)/5 )+32;
        System.out.println("temperature:"+f);
    }

}


