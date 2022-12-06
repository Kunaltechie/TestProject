package p1;

public class String_Reverse_Practice1 
{
	public static void main (String[]args)
	{
		String a = "Radhe";
		String b = "";
		for(int i =0;i<a.length();i++)
		{
			b=a.charAt(i)+b;
		}
		System.out.println(a);
		System.out.println(b);
		if(b.equalsIgnoreCase(a))
		{
			System.out.println("this is a palendrome");
		}
		else
		{
			System.out.println("this is not a palendrome");
		}
	}

}
