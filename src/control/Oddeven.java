package control;

public class Oddeven {

	public static void main(String[] args) {
		int n=14,i=1;
		System.out.println("odd Numbers are :");
		/*while(i<=n)
		{
			if(i%2!=0)
				System.out.println(i);
			i++;
		}*/
		
		/*do
		{
			if(i%2!=0)
				System.out.println(i);
			i++;
		}while(i<=n);*/
		
		while(i<=n)
		{
			System.out.println(i);
			i=i+2;
		}

	}

}
