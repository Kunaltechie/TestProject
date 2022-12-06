package p1;

public class IntegerPalendrome 
{
	public static void main(String[] args) {
		int num1=123;
		int remainder,sum=0;
		while(num1>0)
		{
			remainder=num1%10;
			sum=(sum*10)+remainder;
			num1=num1/10;
		}
		System.out.println(sum);
	}
}
