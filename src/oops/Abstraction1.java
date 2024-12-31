package oops;

abstract class  Abstractdata
{
	abstract  void message();
	public void display()

	{
		System.out.println("google search");
	}
}
class Allfiles extends Abstractdata
{
	@Override
	void message() {
		System.out.println("information search");
		
	}
	
}
class Imgsearch extends Abstractdata
{

	@Override
	void message() {
		System.out.println("image seach");
		
	}
	
}
class Vdosearch extends Abstractdata
{

	@Override
	void message() {
		System.out.println("vedio search");
		
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		Allfiles a=new Allfiles();
		Imgsearch i=new Imgsearch();
		Vdosearch v=new Vdosearch();
		a.message();
		a.display();
		i.message();
		i.display();
		v.message();
		v.display();
		
		
		

	}

}
