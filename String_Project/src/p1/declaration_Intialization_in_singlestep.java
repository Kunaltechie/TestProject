package p1;

import java.util.Arrays;

public class declaration_Intialization_in_singlestep 
{
	public static void main(String[]args)
	{
		int[] ar = {10,50,80,20,40};
		System.out.println(ar.length);
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		String[] name= {"vishal","jay","Akhilesh","Rajesh","Manoj","kabir"};
		System.out.println(name.length);
		Arrays.sort(name);
		for(int j=0;j<=name.length-1;j++)
		{
			System.out.println(name[j]);
		}
	
	}
}
