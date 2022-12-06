package p1;

import java.util.Arrays;

public class Array_Sort_String_Practice 
{
	public static void main(String[]args)
	{
		String []country=new String[5];
		country[0]="England";
		country[1]="New Zealand";
		country[2]="Australia";
		country[3]="India";
		country[4]="Sri Lanka";
		System.out.println(country.length);
		Arrays.sort(country);
		for(int i=0;i<=country.length-1;i++)
		{
			System.out.println(country[i]);
		}
		
		int[] salary =new int[4];
		salary[0]=12345;
		salary[1]=654321;
		salary[2]=415263;
		salary[3]=635241;
		System.out.println(salary.length);
		Arrays.sort(salary);
		for(int j = 0;j<=salary.length-1;j++)
		{
			System.out.println(salary[j]);
		}
				
		
	}
}
