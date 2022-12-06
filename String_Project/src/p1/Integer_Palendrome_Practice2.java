package p1;

public class Integer_Palendrome_Practice2 
{
	public static void main(String[]args)
	{
		int number =753159;
		int remainder=0,sum = 0;
		while(number>0)
		{
			remainder=number%10;
			number=number/10;
			sum = (sum*10)+remainder;	
		}
		System.out.println(sum);
		if(sum==number)
		{
			System.out.println("it is a palendrome");
		}else
		{
			System.out.println("it is not a palendrome");
		}
	}
}
