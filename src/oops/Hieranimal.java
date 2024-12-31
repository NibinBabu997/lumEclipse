package oops;
class Dogss
{
	public void barking()
	{
		System.out.println("DOG BARKING");
	}
}
class Catss extends Dogs
{
	public void sleeping()
	{
		System.out.println("SLEEPING");
	}
}
class Lions extends Dogs
{
	public void roariing()
	{
		System.out.println("ROARING");
	}
}



	


public class Hieranimal {
	public static void main(String[] args) {
		Catss c=new Catss();
		c.barking();
		c.sleeping();
		Lions l= new Lions();
		l.barking();
		l.roariing();

	}



}
