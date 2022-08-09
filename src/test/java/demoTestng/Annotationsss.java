package demoTestng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationsss {
	/*
	 * BeforeMethod & afterMethod
	 * BeforeClass & afterClass
	 * BeforeTest & afterTest
	 * BeforeSuite & afterSuite */
	public static WebDriver driver;
	
	
	@BeforeClass
	public  void before()
	{
		System.out.println("before");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
	}
	@Test
	public  void methodOne()
	{
		System.out.println("method one");
		driver.get("https://www.amazon.in/");
	}
	@Test
	public  void methodTwo()
	{
		System.out.println("method two");
		driver.get("https://www.myntra.in/");
	}
   @AfterClass
	
	public  void after()
	{
		System.out.println("after");
	 driver.close();
	}
	

}
