package control;

import java.util.Scanner;

public class Revarray {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraay element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
					}
		System.out.println("Reversed arraay elements");
	
		for(int j= ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
					}
		
	}

}
