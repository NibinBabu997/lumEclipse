package newpack;

public class Logical {

	public static void main(String[] args) {
		String uname="xyz";
		String password="abcd";
		System.out.println(uname=="xyz" || password=="abcd");
		System.out.println(uname=="xyz" && password=="abcdef");
		System.out.println(!(uname=="xyz") );
		
		boolean a= true;
		boolean b=false;
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(a);
		System.out.println(!a);




		


		

	}

}
