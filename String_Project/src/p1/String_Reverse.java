package p1;

public class String_Reverse {

	public static void main(String[] args) 
	{
		String a = "NiTin";
		String b = "";
		for(int i=0;i<a.length();i++)
		{
			b=a.charAt(i)+b;
		}
		if(b.equalsIgnoreCase(a))
		{
			System.out.println("This is a palendrome");
		}else
		{
			System.out.println("this is not a palendrome");
		}
	}

}