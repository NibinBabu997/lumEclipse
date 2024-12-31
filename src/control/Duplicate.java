package control;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
			int ar[]=new int[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array elements");
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=sc.nextInt();
						}
			
			for(int i=0;i<ar.length;i++)
			{
				for(int j=i+1;j<ar.length;j++)
				{
				if(ar[i]==ar[j]) {		
			System.out.println(ar[i]);
				break;
		}
				}
	}
}
}

