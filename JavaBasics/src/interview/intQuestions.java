package interview;

public class intQuestions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		revInt(2000001);
		intLen(20100);

	}
	// TO REVERSE AN INT VALUE
	static int revInt(int a)
	{
		System.out.println("Inside revInt function");
		int revNum = 0;
		for(int i = a;i !=0; i/=10)
		{
			revNum = revNum *10 + i%10;
		}
		System.out.println("The reversed value of "+a+" is :"+revNum);
		return a;
	}
	// TO GET THE LENGTH OF AN INT VALUE
	static int intLen(int b)
	{
		int len = String.valueOf(b).length();
		System.out.println("The length of given int value is: "+len);
		return b;
	}

}
