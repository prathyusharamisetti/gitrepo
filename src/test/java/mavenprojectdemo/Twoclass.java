package mavenprojectdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Twoclass {
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public  void methodtwo(String url)
	{
		System.out.println("method 2");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//driver.get("https://www.amazon.in/");
	}

}
