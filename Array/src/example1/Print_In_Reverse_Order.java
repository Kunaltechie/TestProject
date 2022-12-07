package example1;

public class Print_In_Reverse_Order 
{
	public static void main(String[]args)
	{
		int[] ar =new int[5];
		ar[0]=200;
		ar[1]=300;
		ar[2]=400;
		ar[3]=500;
		ar[4]=600;
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}
