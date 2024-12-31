package oops;
class Classroom{
	int rollno;
	String name;
	int mark;
	
	public void store()
	{
		rollno=12;
		name="Nidhin";
		mark=50;
	}
	public void display()
	{
		System.out.println("Roll Number: "+rollno);
		System.out.println("Name       : "+name);
		System.out.println("Mark       : "+mark);
	}
}
public class Clss {

	public static void main(String[] args) {
		Classroom cr=new Classroom(); 
		cr.store();
		cr.display();
	}

}
