package demoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Learning_Project1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SaiPr\\eclipse-workspace\\mavenproject\\src\\test\\java\\demoTestng\\Learning_Project1.java");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		firstname.sendKeys("Sai");
		Thread.sleep(2000);
		WebElement Lastname=driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
		Lastname.sendKeys("Pallavi");
		Thread.sleep(2000);
		WebElement Address=driver.findElement(By.xpath("//*[@rows='3']"));
		Address.sendKeys("dno:1-2-3,    near Rama Hospital Road, Chaitanya nagar, Old Gajuwaka, Visakhapatnam");
		Thread.sleep(2000);
		WebElement Mail=driver.findElement(By.xpath("//*[@type='email']"));
		Mail.sendKeys("saipallavi02@gmail.com");
		Thread.sleep(2000);
		WebElement Phone=driver.findElement(By.xpath("//*[@type='tel']"));
		Phone.sendKeys("90000 80000");
		Thread.sleep(2000);
		WebElement Gender=driver.findElement(By.xpath("//*[@value='FeMale']"));
		Gender.click();
		Thread.sleep(2000);
		WebElement Hobbies=driver.findElement(By.xpath("//*[@id='checkbox3']"));
		Hobbies.click();
		if(Hobbies.isSelected())
		{
			Hobbies.click();
		}
		WebElement Movies=driver.findElement(By.id("checkbox2"));
		Movies.click();
		WebElement Skills=driver.findElement(By.id("Skills"));
		Select skill=new Select(Skills);
		skill.selectByValue("Adobe InDesign");
		Thread.sleep(2000);
		skill.selectByVisibleText("Adobe Photoshop");
		Thread.sleep(2000);
		skill.selectByValue("Corel Draw");
		Thread.sleep(2000);
		WebElement Country=driver.findElement(By.id("countries"));
		Select selectcountry=new Select(Country);
		selectcountry.selectByVisibleText("Select Country");
		WebElement Selectcountry=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Select country=new Select(Selectcountry);
		country.selectByVisibleText("Hong Kong");
		WebElement years=driver.findElement(By.id("yearbox"));
		Select year=new Select(years);
		year.selectByVisibleText("1990");
		WebElement months=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month=new Select(months);
		month.selectByVisibleText("September");
		WebElement days=driver.findElement(By.id("daybox"));
		Select day=new Select(days);
		day.selectByVisibleText("9");
		WebElement password=driver.findElement(By.xpath("//*[@id='firstpassword']"));
		password.sendKeys("Pallavi@02");
		WebElement confirmpassword=driver.findElement(By.xpath("//*[@id='secondpassword']"));
		confirmpassword.sendKeys("Pallavi@02");
	}	

}
