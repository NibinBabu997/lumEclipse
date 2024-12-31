package control;

public class Calculator {
	public static void main(String[] args) {
		float a=2,b=22,ans=0;
		char  op='*';
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
		
		
		System.out.println("Your answer is: "+ans);
		
	}

}
