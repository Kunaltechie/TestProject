package Basics;

public class count 
{
	public static void main(String[]args)
	{
		String str = "#GeeKs01fOr@gEEks07";
		int lower =0 ,upper = 0, number = 0 , special = 0 ;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>= 'A' && ch<= 'Z')
				upper++;
			else if(ch>='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
				number++;
			else
				special++;
			
		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(number);
		System.out.println(special);


	}
}
