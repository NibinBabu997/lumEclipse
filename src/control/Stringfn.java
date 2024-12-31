package control;

public class Stringfn {

	public static void main(String[] args) {
		String s1="hello";
		String s2=" Welcome";
		String s3="Hello Luminar";
		//String functions
		//length
		System.out.println("String length :"+s1.length());
		//concatination
		System.out.println(s1.concat(s2));
		//lower case
		System.out.println(s2.toLowerCase());
		//upper case
		System.out.println(s2.toUpperCase());
		// to check string start with a specific char
		System.out.println(s2.startsWith("l"));
		//ends with
		System.out.println(s2.endsWith("e"));
		//compare
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		// remove white space 
		System.out.println(s2.trim());
		//extract string
		System.out.println(s3.substring(6));
		System.out.println(s3.substring(0, 3));
		//check the presents of a string in another
		System.out.println(s3.contains("ello"));
		//replace
		System.out.println(s3.replace("lo", "om"));
		//find char at position
		System.out.println(s3.charAt(1));
		
		String s4="hello welcome to luminar";
		String words[]=s4.split(" ");
		for(String str:words)
		{
			System.out.println(str);

		}


		String s="luminar";
		char w[]=s.toCharArray();
		for(char c:w)
		{
			System.out.println(c);

		}


		




		
		//additional
		//System.out.println(s1+s2);
		//System.out.println(s1+1+2);
		//System.out.println(1+2+s1);


		

		


		
		


	}

}
