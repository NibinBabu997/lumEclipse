package control;

import java.util.Scanner;

public class Matrixaddition {

	public static void main(String[] args) {
		int ar[][]=new int[3][3],br[][]=new int[3][3],cr[][]=new int[3][3],i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first array elements");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second array elements ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				br[i][j]=sc.nextInt();
			}
		}
		System.out.println("The result: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				cr[i][j]=ar[i][j]+br[i][j];
			}
		}
		for(int a[] : cr)
		{
			for(int v:a)
			{
				System.out.print(v+" ");

			}
			System.out.println();

		}

	}

}
