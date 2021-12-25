package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
				
		driver.findElement(By.name("firstname")).sendKeys("raj");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9900990090");
		driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
		//Dropdown
		WebElement dayDrop = driver.findElement(By.id("day"));
		Select daySlct = new Select(dayDrop);
		daySlct.selectByIndex(8);
		
		WebElement monthDrop = driver.findElement(By.id("month"));
		Select monthSlct = new Select(monthDrop);
		monthSlct.selectByVisibleText("Mar");
		
		WebElement yrDrop = driver.findElement(By.id("year"));
		Select yrSlct = new Select(yrDrop);
		yrSlct.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//driver.close();

	}

}
