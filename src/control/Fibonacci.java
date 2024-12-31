package control;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,t,n2=1,l;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  numer  limit : ");
		l= sc.nextInt();
		for (int i=1;i<=l;i++)
		{
			System.out.print(n2+" ");
			t=n2;
			n2=n1+n2;
			n1=t;	
	
		}


	}
}
