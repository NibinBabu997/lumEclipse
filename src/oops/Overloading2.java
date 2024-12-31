package oops;
class Addition1
{
	public void add(int a, int b,int x)
	{
		int c =a+b+x;
		System.out.println(c);
	}
	public void add(double a, double b)
	{
		double c =a+b;
		System.out.println(c);
	}
}


public class Overloading2 {
	public static void main(String[] args) {
		Addition1 a=new Addition1();
		a.add(4.556, 6.6555);
		a.add(4, 5,6);
	}


}
