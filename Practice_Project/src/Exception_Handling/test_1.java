package Exception_Handling;

public class test_1 {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try {
			System.out.println(100/0);
		}catch(Exception e)
		{
			System.out.println("here is risk and exception is coming");
		}
           System.out.println("6");
           System.out.println("7");
           System.out.println("8");
	}

}
