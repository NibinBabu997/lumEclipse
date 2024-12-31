package control;

import java.util.Scanner;

public class Stringq {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//1
		String s="jmeter";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));
		
		//2
		System.out.println("Enter a string");
		String s2=sc.nextLine();
		
		boolean b=s2.contains("langauge");
		if (b==true)
			System.out.println("pass");
		else 
			System.out.println("fail");
		//3
		String s3="selenium webdriver is used for webapplication testing";
		String words[]=s3.split(" ");
		for(String str:words)
		{
			System.out.println(str);

			if(str.equals("webapplication"))
				break;
			
		}
	}

}
