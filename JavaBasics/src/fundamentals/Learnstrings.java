package fundamentals;

public class Learnstrings {

	public static void main(String[] args) 
	{
		
		mergestr("abc","xyz");
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
				j++;
				i++;
			}
			
		}
	}

}
