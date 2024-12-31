package oops;

interface Bank1
{
	void deposit();
	void withdraw();
}
interface Bank2
{
	void interestrate();
	void balancedetails();
}
class ICIC implements Bank1,Bank2
{

	@Override
	public void interestrate() {
		System.out.println("interest rate increased");
	}

	@Override
	public void balancedetails() {
		System.out.println("Maintain minimum balance");
		
	}

	@Override
	public void deposit() {
		System.out.println("Amount credited");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Amount debited");
		
	}
	
}
public class Multipleinheri {

	public static void main(String[] args) {
		ICIC ob=new ICIC();
		ob.deposit();
		ob.withdraw();
		ob.balancedetails();
		ob.interestrate();

	}
	
}
