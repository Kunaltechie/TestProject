package example1;

public class intArray
{
	public static void main (String[]args)
	{
		int[] ar = new int[5];
		ar[0]=200;
		ar[1]=300;
		ar[2]=400;
		ar[3]=500;
		ar[4]=600;
		System.out.println(ar[4]);
		
		System.out.println(ar[0]);
		System.out.println(ar.length);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
