package control;

import java.util.Scanner;

public class Largestarray {

	public static void main(String[] args) {
		int ar[]=new int[5],large;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
					}
		large=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>large)
				large=ar[i];
					}
		System.out.println("Largest mumber is:"+large);
	}

}
 