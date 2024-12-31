package control;

import java.util.Scanner;

public class Arrayc {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraay element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
					}
		System.out.println("array elements are");

		for(int j:ar)
		{
			System.out.println(j);
					}
		
	} 

}
