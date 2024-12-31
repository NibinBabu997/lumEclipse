package oops;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		int n,rev=0,x;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  numer");
		n= sc.nextInt();
		while(n>0)
		{
			x=n%10;
			
			rev=rev*10+x;
			n=n/10;
			
		}
		System.out.println("reverse: "+rev);

	}

}
