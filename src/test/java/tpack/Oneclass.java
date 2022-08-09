package tpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Oneclass {
	@Test
	public  void methodOne()
	{
		
                   System.out.println("changed by prathyusha");
		System.out.println("method 1");
		//driver.get("https://www.amazon.in/");
	}
	@AfterTest
	public  void aftertest()
	{
		System.out.println("after test ");
		//driver.get("https://www.amazon.in/");
	}
	@BeforeTest
	public  void beforetest()
	{
		System.out.println("before test ");
		//driver.get("https://www.amazon.in/");
		 System.out.println("changed by vignesh");
	}


}
