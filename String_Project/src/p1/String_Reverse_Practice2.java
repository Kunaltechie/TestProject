package p1;

public class String_Reverse_Practice2 
{
	public static void main(String[]args)
	{
		String a ="Krishna";
		String b = "";
		int c =a.length();
		System.out.println(c);
		
		for(int i=0;i<a.length();i++)
		{
			b = a.charAt(i)+b;
		}
		System.out.println(b);
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("it is a palendrome");
		}else
		{
			System.out.println("it is not a palendrome");
		}
	}
}
