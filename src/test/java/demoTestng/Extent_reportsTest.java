package demoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_reportsTest {
	WebDriver driver;
	ExtentReports extent;
	@Test
	public  void methodtwo()
	{
    ExtentTest a=extent.createTest("testcreated");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	a.info("Browser launch");
	driver.get("https://www.amazon.in/");
	String title = driver.getTitle();
	a.info("title retrived");
	System.out.println(System.getProperty("user.dir"));
	a.fail("test failed");
	Assert.assertEquals(title,"nline Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}
	@AfterMethod
	public void close() {
		driver.close();
		extent.flush();

	}
	@BeforeMethod
	public void configss() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Test Results");
		reporter.config().setDocumentTitle("A Test Results title");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System","Windows 10");
		extent.setSystemInfo("Tested By","bhavya");
	}
}
