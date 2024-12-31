package oops;

public class Acircle {
	public double area(double r)
	{
		float pi=3.14f ;
		double ar=pi*(r*r);
		return ar;
		
		
	}

	public static void main(String[] args) {
		Acircle are=new Acircle();
		System.out.println(are.area(6.6));
	}
	

}
