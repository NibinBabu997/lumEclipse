package control;

import java.util.Scanner;

public class Calculatorr {
	public static void main(String[] args) {
		float a,b,ans=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first value");
		a= sc.nextFloat();
		System.out.println("Enter the second value");
		b= sc.nextFloat();
		System.out.println("Enter your operation ( + , - , * , / , % )");
		char  op= sc.next().charAt(0);
		switch(op)
		{
		case '+' : //System.out.println("answer ="+ (a+b));
					ans=a+b;
					break;
		case '-' : //System.out.println("answer ="+ (a-b));
			        ans=a-b;
			        break;
		case '*' : //System.out.println("answer ="+ (a*b));
	                ans=a*b;
	                break;
		case '/' : //System.out.println("answer ="+ (a/b));
	                 ans=a/b;
	                 break;
		case '%' : //System.out.println("answer ="+ (a%b));
	                 ans=a%b;
	                 break;
		
		default: System.out.println("invalid operation");
		}
		
		
		
	}

}
