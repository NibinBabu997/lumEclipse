package oops;
class Member{
	String name,address;
	int age,salary;
	public void printdetails()
	{
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Address: "+address);
		System.out.println("Salay  : "+salary);

	}
}
class Worker extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}

public class Company {

	public static void main(String[] args) {
	
	Worker w=new Worker();
	Manager m= new Manager();
	w.name="Nidhin";
	w.age=29;
	w.address="Kozhikkod";
	w.salary=20000;
	w.printdetails();
	System.out.println("Speciaalization: "+(w.specialization="Telecome Engineer")+"\n"); 
	
	m.name="Swathy";
	m.age=32;
	m.address="Kollam";
	m.salary=25000;
	m.printdetails();
	System.out.println("Department: "+(m.department="IT")); 
	
	
	}
}
