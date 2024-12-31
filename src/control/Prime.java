package control;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,temp=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  numer : ");
		n= sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				
				temp++;
				break;
			}
			
		}
		if(temp>0)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("Prime");
		}

	}

}
