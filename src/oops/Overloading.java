package oops;
class Addition
{
	public void add(int a, int b)
	{
		int c =a+b;
		System.out.println(c);
	}
	public void add(double a, double b)
	{
		double c =a+b;
		System.out.println(c);
	}
}
public class Overloading {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(4.556, 6.6555);
		a.add(4, 5);
	}

}
