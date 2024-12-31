package oops;
class Schooldetails
{
	final String schoolname ="Luminar";
	static String dept="English";
}

public class Statifinal {

	public static void main(String[] args) {
		System.out.println(Schooldetails.dept);
		System.out.println(Schooldetails.dept="Malayalam");
		Schooldetails ob = new Schooldetails();
		System.out.println(ob.schoolname);
		//System.out.println(ob.schoolname="abc");

	

	}

}
