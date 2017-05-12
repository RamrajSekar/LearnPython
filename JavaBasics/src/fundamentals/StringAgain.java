package fundamentals;

import java.util.Random;

public class StringAgain 
{
	public static void main(String[] args) 
	{
		String str1 = "abcde";
		//char[] a = str1.toCharArray();
		String str2 = "xyz";
		int bigLength = str1.length()>str2.length()?str1.length():str2.length();
		for(int i = 0; i<bigLength; i++)
		{
			if(i<str1.length())
			   System.out.print(str1.charAt(i));
			if(i<str2.length())
			   System.out.print(str2.charAt(i));
		}
		System.out.println("");
		System.out.println("<<<Using Random - Random Number>>>>>");
		int min = 5;
		int max = 10;
		
			Random rand = new Random();
			int result = min + rand.nextInt((max - min)+1);
			System.out.println(result);
		
		System.out.println("<<<Using Math - Random Number>>>>>");
			
			float random = (float) (Math.random() * (max + min));
			System.out.println(random);
		
		
			}
		
	}

