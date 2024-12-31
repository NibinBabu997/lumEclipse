package oops;

class Bank
{
	public void deposit()
	{
		System.out.println("Money credited");
	}
	public void withdraw()
	{
		System.out.println("Money Debited");
	}
}
class Sbi extends Bank
{
	public void intrest()
	{
		System.out.println("Intrest credited");
	}
}
class Hdfc extends Bank
{
	public void loan()
	{
		System.out.println("HDFC loan approved");
	}


	



}


public class Transaction {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		Hdfc h=new Hdfc();
		System.out.println("SBI Transactions");
		s.deposit();
		s.withdraw();
		s.intrest();
		System.out.println("\nHDFC Transactions");
		h.deposit();
		h.withdraw();
		h.loan();
		
	}

}
