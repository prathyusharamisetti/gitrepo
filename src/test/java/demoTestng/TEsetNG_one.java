package demoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TEsetNG_one {
	@Test(priority=1)
	public static void register()
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SaiPr\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				//WebDriverManager.chromedriver().setup();
				//WebDriver driver=new ChromeDriver();
				//driver.get("https://www.amazon.in/");  
				//driver.manage().window().maximize();
				//String title=driver.getTitle();
				//System.out.println(title);
				//Assert.assertEquals(title, "nline Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
                //SoftAssert.assertTrue("hi","hi");
				//Assert.assertFalse(5<8);
				//Assert.fail("this test is failed");
				//Assert.assertNotSame("passed", "hi", "hi");
		System.out.println("register");
	}
	@Test(priority=2)
	public static void login()
	{
		System.out.println("login");
	}

	@Test(priority=3)
	public static void homepage()
	{
		System.out.println("hompage");
	}
	
	

}
