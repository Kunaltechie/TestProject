package example1;

public class String_Array_Print_In_Acending_Order 
{
	public static void main(String[]args)
	{
		String[] ar = new String[5];
		ar[0]="Ganesh";
		ar[1]="Suresh";
		ar[2]="Ramesh";
		ar[3]="Mahesh";
		ar[4]="Rakesh";
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]+" ");
		}
	}
}
