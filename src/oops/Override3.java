package oops;
class Car
{
	
	public void speed()
	{
		System.out.println("car speed");
	}
	public void power()
	{
		System.out.println("car power");
	}
}
class Bmw extends Car
{

	@Override
	public void speed() {
		System.out.println("bmw power");
		super.speed();
	}

	@Override
	public void power() {
		System.out.println("bmw power");
		super.power();
	}
	
	
}

public class Override3 {

	public static void main(String[] args) {
	Bmw c=new Bmw();
	c.speed();
	c.power();

	}

}
