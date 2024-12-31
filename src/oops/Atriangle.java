package oops;


	public class Atriangle {
		public double area()
		{
			float b=5,h=.5f;
			double ar=0.5*(b*h);
			return ar;
			
			
		}

		public static void main(String[] args) {
			Atriangle are=new Atriangle();
			System.out.println(are.area());
		}
		

	}

