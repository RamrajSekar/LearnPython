package fundamentals;

public class Learnstrings {

	public static void main(String[] args) 
	{
		
		mergestr("abc","xyz");
		revstring("Hamam");
		revint(12345);
	}
	
	// TO MERGE TWO STRINGS
	static void mergestr(String str1,String str2)
	{
		
		System.out.println("****MERGING TWO STRINGS****");	
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		int i=0,j=0;
		for(char c:a)
		{
			System.out.print(c);
			if(j==i)
			{
				char d = str2.charAt(j);
				System.out.print(d);
				System.out.println();
				j++;
				i++;
			}
			
		}
	}
	
	// TO Reverse a String
	static String revstring(String a)
	{
		a = a.toLowerCase();
		char b;
		for(int i = a.length()-1;i>=0;i--)
		{
			b = a.charAt(i);
			System.out.print(b);
		}
		System.out.println();
		return "";
	}

	//To reverse an int
	static void  revint(int b)
	{
		int resultNumber = 0;
		for(int i = b; i !=0; i /= 10) 
		{
			resultNumber = resultNumber * 10 + i % 10;
		}
		System.out.println(resultNumber);
	}
}
