package Exception_Handling;

public class try_catch {

	public static void main(String[] args) throws Throwable {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		Thread.sleep(3000);
		try
		{
			System.out.println(100/0);
		}catch(Exception message)
		{
			System.out.println("There is risk and exception is coming"+message.getMessage());
			
		}
		finally {
			System.out.println("finally will always run no matter what");
			
		}
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");

	}

}
