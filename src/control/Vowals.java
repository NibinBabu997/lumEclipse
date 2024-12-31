package control;

public class Vowals {

	public static void main(String[] args) {
		String st="luminar",s;
		int count=0;
		s=st.toLowerCase();
		char w[]=s.toCharArray();
		for(int i=0;i<w.length;i++)
		{
			if(w[i]=='a'||w[i]=='e'||w[i]=='i'||w[i]=='o'||w[i]=='u')
			{
			count++;
			
			}
			

		}
       System.out.println("number of vowels: "+count);

	}

}
