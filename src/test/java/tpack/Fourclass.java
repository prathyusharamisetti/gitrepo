package tpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fourclass {
	@Parameters({"URL"})
	@Test
	public  void methodfive(String url)
	{
		System.out.println("changed by sravani");
		System.out.println("method 5");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		System.out.println("changed by sravani");
		
	}
	@Parameters({"URL"})
	@Test
	public  void methodsix(String url)
	{
		System.out.println("changed by sravani");
		System.out.println("method 6");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	
		//driver.get("https://www.amazon.in/");
	}
	/*@BeforeMethod
	public  void beformethod()
	{
		System.out.println("beforemethod one");
		//driver.get("https://www.amazon.in/");
	}
	@AfterMethod
	public  void aftermethod()
	{
		System.out.println("after method one");
		//driver.get("https://www.amazon.in/");
	}
	@BeforeClass
	public  void beforeclass()
	{
		System.out.println("before class ");
		//driver.get("https://www.amazon.in/");
	}
	@AfterClass
	public  void afterclass()
	{
		System.out.println("after class ");
		//driver.get("https://www.amazon.in/");
	}*/

}
