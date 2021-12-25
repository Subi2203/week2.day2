package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_3 {
	//Duplicate Lead

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		String str = driver.findElement(By.xpath("(//div[@class='x-grid3-body']//a)[3]")).getText();
		System.out.println("First Name is : "+str);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-body']//a)[3]")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead"))
		{
			System.out.println("This is the title : "+title);
		}
		else
			System.out.println("Title is not present");

		driver.findElement(By.name("submitButton")).click();
		String name = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if (name.equals(str))
		{
			System.out.println(name+" name is verified");
		}
		else
			System.out.println("Name is not verified");

		driver.close();

	}

}
