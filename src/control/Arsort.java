package control;

import java.util.Scanner;

public class Arsort {

	public static void main(String[] args) {
		int ar[]=new int[5],temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraay element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
					}
		 for (int i = 0; i < ar.length; i++) { 
	           for (int j = i+1; j < ar.length; j++) {
	        	   if(ar[i] > ar[j])
	        	   { 
	                 temp = ar[i]; 
	                 ar[i] = ar[j]; 
	                 ar[j] = temp; 
	              } 
	           } 
	       } 


			System.out.println("sorted arraay element");
		   for(int j:ar)
			{
				System.out.println(j);
						}
			
		}
	

}
