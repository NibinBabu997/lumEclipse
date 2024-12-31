package control;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,s=0,x,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  numer : ");
		n= sc.nextInt();
		num=n;
		while(n>0)
		{
			x=n%10;
			s=s+(x*x*x);
			n=n/10;
			
		}
       if(s==num)
    	   System.out.println("Armstrong");
       else
    	   System.out.println("Not Armstrong");
	}

}
