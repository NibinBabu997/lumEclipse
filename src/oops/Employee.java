package oops;

public class Employee {
	
	String empname;
	int empid;
	String designation;
	int salary;
	
	public void display()
	{
		System.out.println("Employee Id  : "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Designation  : "+designation);
		System.out.println("Salary       : "+salary);
		

	}

	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.empid=1001;
		emp.empname="Nithin";
		emp.designation="Telecome engineer";
		emp.salary=25000;
		emp.display();
	}

}
