package oops;
class A
{
	int a=10;
	void m1()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int a=20;
	void m1()
	{
		super.m1();
		System.out.println(a);
	}
}
public class Override1 {

	public static void main(String[] args) {
		B b=new B();
		b.m1();
	}

}
