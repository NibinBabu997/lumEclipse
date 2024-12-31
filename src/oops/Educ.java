package oops;

interface Principal{
	void resign();
	void rejoined();
}
class Student{
	public void mark() {
		System.out.println("student mark");
	}
	public void showdetails() {
		System.out.println("student details");
	}
}
class Teacher extends Student implements Principal
{

	@Override
	public void resign() {
		System.out.println("resigned");
		
	}

	@Override
	public void rejoined() {
		System.out.println("rejoined");
		
	}
	public void department(){
		System.out.println("teacher department");
		
	}
	
}

public class Educ {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.mark();
		t.showdetails();
		t.department();
		t.resign();
		t.rejoined();

	}

}
