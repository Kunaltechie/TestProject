package p1;

public class FabonacciSeries_Practice2 
{
	public static void main(String[]args)
	{
		int a=0,b=1,c=0,d=1000;
		System.out.print(a+" "+b+" ");
		
		while(c<d)
		{
			c=a+b;
			a=b;
			b=c;
		System.out.print(c+" ");	
		}
	}
}
