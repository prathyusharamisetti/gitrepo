package tpack;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleforListeners {
	@Test
	public static void register() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");  
		driver.manage().window().maximize();
	String title=driver.getTitle();
	int a=3;
	int b=3;
	int c=4;
	
	if(a==1) {
	Assert.assertTrue(b<c);
	}
	else if(a==2) {
		Assert.assertTrue(b>c);
		}
	else if(a==3) {
		throw new SkipException("test skipp");
		}
	}
}
