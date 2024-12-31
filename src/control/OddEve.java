package control;

import java.util.Scanner;

public class OddEve {

	public static void main(String[] args) {

		int ar[]=new int[5],temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraay element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
					}
		System.out.println("Even numbes");

		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				System.out.println(ar[i]);
					}
		System.out.println("Odd numbes");

		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
				System.out.println(ar[i]);
					}

	}

}
