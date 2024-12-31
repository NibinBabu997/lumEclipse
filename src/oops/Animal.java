package oops;

class Dog
{
	public void barking()
	{
		System.out.println("DOG BARKING");
	}
}
class Cat extends Dog
{
	public void sleeping()
	{
		System.out.println("CAT SLEEPING");
	}
}

public class Animal {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.barking();
		c.sleeping();

	}

}
