package Basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Window_Handle 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		Set<String>allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Object[] windows = allWindows.toArray();
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		driver.switchTo().window(window2);
		driver.findElement(By.linkText("Community")).click();
		driver.switchTo().window(window1);
		
	}
}
