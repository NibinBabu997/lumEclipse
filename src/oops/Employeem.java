package oops;

public class Employeem {
	int empid,salary;
	String designation;
	/*public void setvalues(int empid,int salary,String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}*/
	public void setvalues(int eid,int sal,String des)
	{
		empid=eid;
		salary=sal;
		designation=des;
	}
	public void display()
	{
		System.out.println("Employee Id: "+empid);
		System.out.println("Salary     :"+salary);
		System.out.println("Designation :"+designation);
	}

	public static void main(String[] args) {
		Employeem emp=new Employeem();
		emp.setvalues(101, 30000,"Tester");
		emp.display();

	}

}
