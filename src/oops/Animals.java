package oops;
interface Basicanimal
{
void cat();
void sleep();
}
class Monkey 
{
	public void jump()
	{
		System.out.println("jumping");
	}
	public void bite()
	{
		System.out.println("biting");
	}
}
class Human extends Monkey implements Basicanimal 
{
	public void speak()
	{
		System.out.println("speaking");
	}

	@Override
	public void cat() {
		System.out.println("cat");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
		
	}	
}
public class Animals {

	public static void main(String[] args) {
		Human h=new Human();
		h.bite();
		h.jump();
		h.cat();
		h.sleep();
		h.speak();

	}

}
