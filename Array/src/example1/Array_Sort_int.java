package example1;

import java.util.Arrays;

public class Array_Sort_int 
{
	public static void main(String[]args)
	{
		int[] ar = new int[5];
		ar[0]=200;
		ar[1]=300;
		ar[2]=400;
		ar[3]=500;
		ar[4]=600;
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
