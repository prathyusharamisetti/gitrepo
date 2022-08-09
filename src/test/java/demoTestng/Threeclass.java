package demoTestng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Threeclass {
	@Test(groups= {"smoke"},dependsOnMethods= {"amethodthree"})
	public  void bfive()
	{
		System.out.println("method 5");
		//driver.get("https://www.amazon.in/");
	}

	@Test
	public  void amethodthree()
	{
		System.out.println("method 3");
		//driver.get("https://www.amazon.in/");
	}
	@Test
	public  void four()
	{
		System.out.println("method 4");
		driver.get("https://www.amazon.in/");
	}
	@Test
	public  void csix()
	{
		System.out.println("method 6");
		driver.get("https://www.amazon.in/");
	}
	
	@AfterSuite
	public  void aftertest()
	{
		System.out.println("after suite ");
		//driver.get("https://www.amazon.in/");
	}
	@BeforeSuite
	public  void beforesuite()
	{
		System.out.println("before suite");
		//driver.get("https://www.amazon.in/");
	}
}
