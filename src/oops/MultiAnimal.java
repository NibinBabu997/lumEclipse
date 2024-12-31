package oops;
class Dogs
{
	public void barking()
	{
		System.out.println("DOG BARKING");
	}
}
class Cats extends Dogs
{
	public void sleeping()
	{
		System.out.println("SLEEPING");
	}
}
class Lion extends Cats
{
	public void roariing()
	{
		System.out.println("ROARING");
	}
}


public class MultiAnimal {

	public static void main(String[] args) {
		Cats c=new Cats();
		c.barking();
		c.sleeping();
		Lion l= new Lion();
		l.barking();
		l.sleeping();
		l.roariing();

	}

}
