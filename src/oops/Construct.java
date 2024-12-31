package oops;

public class Construct {
	int empid,salary;
	String designation;
	public Construct()
	{
		empid=101;
		salary=3000;
		designation="Developer";
	}

	public static void main(String[] args) {
		Construct co=new Construct();
		System.out.println("Employee Id: "+co.empid);
		System.out.println("Salary     :"+co.salary);
		System.out.println("Designation:"+co.designation);

	}

}
