package control;

public class Nested {

	public static void main(String[] args) {
		int age=23,weight=52;
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("You are Eligible");
			}
			else
			{
				System.out.println("You are Ineligile : Under weight");
			}
				
		}
		else
			System.out.println("You are Ineligible: Under age");
	}

}
