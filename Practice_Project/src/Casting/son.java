package Casting;

public class son extends father
{

	public void mobile()
	{
		System.out.println("Son:Samsung");
	}
	public void house()
	{
		System.out.println("Son:3BHK");
	}
	public void car()
	{
		System.out.println("Son:1 Jaguar");
	}
	
	public static void main(String[] args) 
	{
	
		father f = new son();
		f.car();
		f.house();
		System.out.println("=======================================================================");
		
		
		Up_Cating_Son s1 = new Up_Cating_Son();
		s1.car();
		s1.home();
		s1.mobile();
		s1.money();
	
	}

	}
	

