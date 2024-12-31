package control;

import java.util.Scanner;

public class Multiarray {

	public static void main(String[] args) {
		int ar[][]=new int[2][3],r,c,i,j;
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the no. of rows and column \nraws : ");
		r=sc.nextInt();
		System.out.println("column : ");
		c=sc.nextInt();*/
		System.out.println("Enter array elements");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Your array ");


		for(int a[] : ar)
		{
			for(int v:a)
			{
				System.out.print(v+" ");

			}
			System.out.println();

		}


	}

}
