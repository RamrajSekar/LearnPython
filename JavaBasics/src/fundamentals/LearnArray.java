package fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LearnArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*int a[] = new int[5];
		int[] b = {1,2,3,4,5};
		System.out.println("Length of a: "+a.length);
		System.out.println("Length of b: "+b.length);*/
		int TestCount;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of TestCases: ");
		TestCount = scn.nextInt();
		int tc[] = new int[TestCount];
		
		for(int x=1;x<=tc.length;x++)
		{
			LearnArray la = new LearnArray();
			//Using Scanner read and write array from arguments
			la.usingscan();
			//Using BufferReader read and write array from arguments
			la.usingbuff();
		}
	}
	
	public static int sumofarg(int[] a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
         {
         	//System.out.println("The arguments passed is: " + a[i]);
         	sum = sum + a[i];
         }
		 System.out.println("The sum of the arguments passed is " + sum);
		 return sum;
	}
	
	void usingscan()
	{
		try{
		//Using Scanner read and write array from arguments
				System.out.println("******Using Scanner****");
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter number of elements: ");
				int n;
				n = scn.nextInt();
				int a[] = new int[n];
				//int sum = 0;
					for (int j = 0; j <n; j++) 
					{
			            a[j] = scn.nextInt();
			        }
				sumofarg(a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void usingbuff()
	{
		try
		{
			System.out.println("******Using BufferReader****");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number of elements: ");
			int y = Integer.parseInt(br.readLine());
			int[] m = new int[y];
			System.out.print("Enter the arguments: ");
				for(int k=0;k<y;k++)
				{
					String b = br.readLine();
					m[k] = Integer.parseInt(b);	
				}
			sumofarg(m);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
