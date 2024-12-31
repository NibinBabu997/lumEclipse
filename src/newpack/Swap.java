package newpack;

public class Swap {

	public static void main(String[] args) {
      int a=25,b=23;
      
      System.out.println("value before swapping");
      System.out.println("value of a= "+a);
      System.out.println("value of b= "+b);
      
      //swapping without new variable
      /*b=a+b;
      a=b-a;
      b=b-a;*/
      
     
      //swapping with variable
     int c; 
     c=a;
     a=b;
     b=c;
     
     System.out.println("value After swapping");
     System.out.println("value of a= "+a);
     System.out.println("value of b= "+b);

	}

}
