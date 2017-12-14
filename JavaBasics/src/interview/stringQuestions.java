package interview;

public class stringQuestions 
{
	public static void main(String[] args) 
	{
		
		
		revString("mamama");
		revString("mamam");
		//System.out.println("\n");
		splitString("madam");
	}
	
	static void revString(String a)
	{
		System.out.println("To reverse a string");
		System.out.println(a);
		String dummy = "";
		for(int j = a.length()-1;j>=0;j--)
		{
			dummy = dummy + a.charAt(j);
		}
		System.out.println("The reverse of a is: "+dummy);
		if(dummy.equals(a))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}
	
	static String splitString(String b)
	{
		System.out.println("To split chars from a string variable");
		
		for(int i=0;i<b.length();i++)
		{
			System.out.print(b.charAt(i)+" ");
		}
		
		return b;
	}
	
	
}
