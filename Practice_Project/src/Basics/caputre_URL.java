package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caputre_URL 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/facebook.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
