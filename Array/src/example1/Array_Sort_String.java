package example1;

import java.util.Arrays;

public class Array_Sort_String 
{
	public static void main(String[]args)
	{
	String[] ar = new String[4];
	ar[0]="Radhe";
	ar[1]="Shyam";
	ar[2]="Mohan";
	ar[3]="Krishna";
	
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	}
}
