package p1;

public class Count_Practice 
{
	public static void main(String[]args)
	{
		String a= "#GeeKs01fOr@gEEks07";
		int upper=0,lower=0,number=0,specialchar=0;
		for(int i=0;i<a.length();i++)
		{
			char bc =a.charAt(i);
			if(bc>='A' && bc<='Z')
				upper++;
			else if(bc>='a' && bc<='z')
				lower++;
			else if (bc>='0' && bc<='9')
				number++;
			else
				specialchar++;
		}
		System.out.println("Upper:"+upper);
		System.out.println("Lower:"+ lower);
		System.out.println("Number:"+number);
		System.out.println("Specialchar:"+ specialchar);
	}
}
