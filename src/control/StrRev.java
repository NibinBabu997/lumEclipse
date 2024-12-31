package control;

import java.util.Scanner;

public class StrRev1 {

	public static void main(String[] args) {
		String str,rstr="";
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str= sc.nextLine();
		for (int i=0; i<str.length(); i++)
	      {
			
	        ch= str.charAt(i); 
	        rstr= ch+rstr; 
			

	      }
	      System.out.println("Reversed String: "+ rstr);
	}

}
