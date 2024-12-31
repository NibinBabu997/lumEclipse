package oops;
class Additions
{
	public void add(int a, double b)
	{
		double c =a+b;
		System.out.println(c);
	}
	public void add(double a, int b)
	{
		double c =a+b;
		System.out.println(c);
	}
}
public class Overloadd {

	public static void main(String[] args) {
			Additions a=new Additions();
			a.add(4, 6.6555);
			a.add(5.76,6);

	}

}
