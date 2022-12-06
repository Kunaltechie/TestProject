package p1;

public class Fibo 
{
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int n=100;
		System.out.print(a+" "+b+" ");
		while(c<=n)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}
