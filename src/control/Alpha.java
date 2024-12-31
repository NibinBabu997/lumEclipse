package control;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
	    char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		ch= Character.toLowerCase(ch);
	
		if(ch>='a' && ch<='z')
		{
			System.out.println("Alphabet");

		}
		else 
		{
			System.out.println("Not an Alphabet");

		}
	}
	
	

}
