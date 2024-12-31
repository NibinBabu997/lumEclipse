package oops;
class Parent
{
	String s="abc";
	void phone()
	{
		System.out.println("nokia");
	}
}
class Child extends Parent
{
	
	void phone()
	{
		System.out.println(super.s);
		super.phone();
		System.out.println("iphone");
	}
}

public class Override2 {

	public static void main(String[] args) {
		Child c=new Child();
		c.phone();

	}

}
