package oops;

public class Paraconst {
	int empid,salary;
	String designation;
	public Paraconst(int id,int sal,String des)
	{
		empid=id;
		salary=sal;
		designation=des;
	}

	public static void main(String[] args) {
		Paraconst co=new Paraconst(101,30000,"Tester");
		System.out.println("Employee Id: "+co.empid);
		System.out.println("Salary     :"+co.salary);
		System.out.println("Designation:"+co.designation);

	}
}
