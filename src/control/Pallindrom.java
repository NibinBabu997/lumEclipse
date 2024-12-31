package control;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
	
			int n,rev=0,x,num;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter  numer : ");
			n= sc.nextInt();
			num=n;
			while(n>0)
			{
				x=n%10;
				
				rev=rev*10+x;
				n=n/10;
				
			}
			if (rev==num)
				System.out.println("Number is palindrome");
			else
				System.out.println("Number is not palindrome");


		}
	

}
