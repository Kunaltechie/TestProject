package p1;

public class Integer_Palendrome_Practice 
{
	public static void main(String[] args) 
	{
		int num = 123456789;
		int sum = 0;
		int remainder = 0;
		
		while(num>0)
		{
			remainder = num%10;
			sum= (sum*10)+remainder;
			num=num/10;
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("This is a Palendrome");
		}else
		{
			System.out.println("This is not a palendrome");
		}
	}
	}
