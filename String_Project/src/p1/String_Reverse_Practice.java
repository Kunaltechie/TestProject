package p1;

public class String_Reverse_Practice 
{
	public static void main(String[] args) 
	{
		String a ="Naman";
		String b = "";
		for(int i=0;i<a.length();i++)
		{
			b=a.charAt(i)+b;
		}
		if(b.equalsIgnoreCase(a))
		{
			System.out.println("This is a Palendrome");
		}else
		{
			System.out.println("This is not a Palendrome");
		}
	}
}
