package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arrayQuestions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = {2,2,3,4,5,20};
		int c[] = {5,6,9,10};
		String d[] = {"Banana","Apple"};
		sumArray(a);
		//sumArray(c);
		findindex(c,6);
		intSort(a);
		strSort(d);

	}
	// To find sum of int array
	static int[] sumArray(int[] b)
	{
		int sum = 0;
		System.out.println("*****To find sum of int array****");
		for(int i=0;i<b.length;i++)
		{
			sum = sum+b[i];
		}
		System.out.println(sum);
		return b;
	}
	//To find the index value of an array
	static int[] findindex(int d[],int e)
	{
		System.out.println("*****To find the index value of an array****");
		for(int i=0;i<d.length;i++)
		{
			if(d[i] == e)
			{
				System.out.println("The index value of "+e+" is: "+i);
				break;
			}
		}
		return null;
	}
	//To sort the int values in array
	static int[] intSort(int f[])
	{
		System.out.println("*****To sort the int values in array****");
		
		int temp;
		System.out.print("Before sorting: ");
		for(int k=0;k<f.length;k++)
		{
			System.out.print(f[k]+" ");
		}
		for(int i=0;i<f.length;i++)
		{
			for(int j=i+1;j < f.length;j++)
			{
				if(f[i]<f[j])
				{
					temp = f[i];
					f[i] = f[j];
					f[j] = temp;
				}
			}
		}
		System.out.println("");
		System.out.print("After sorting: ");
		for(int k=0;k<f.length;k++)
		{
			System.out.print(f[k]+" ");
		}
		return null;
	}
	
	//To sort the string values in array
	static String[] strSort(String[] name)
	{
		System.out.println("");
		System.out.println("*****To sort the string values in array****");
		String temp;
		System.out.print("Unsorted string names are: ");
		for(int q = 0;q<name.length;q++)
		{
			System.out.print(name[q]+",");
		}
		for(int i=0;i<name.length;i++)
		{
			//System.out.println(name[i]);
			for(int j = i+1;j<name.length;j++)
			{
				if(name[i].compareTo(name[j]) > 0)
				{
					temp = name[i];
					name[i]=name[j];
					name[j] = temp;
				}
			}
		}
		System.out.println("");
		System.out.print("Sorted string names are: ");
		for(int r = 0;r<name.length;r++)
		{
			System.out.print(name[r]+",");
		}
		return name;
	}
}
