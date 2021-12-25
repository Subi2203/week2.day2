package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_2 {
	//Delete Lead

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("8056068650");
		String str = driver.findElement(By.xpath("(//div[@class='x-grid3-body']//a)[1]")).getText();
		System.out.println("First Lead Id is : "+str);
		driver.findElement(By.xpath("(//div[@class='x-grid3-body']//a)[1]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(str);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		String msg1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(msg1);
		
		if(msg1.contains("No records")) {

			System.out.println(str+" is successfully deleted");
		}
		else {
			System.out.println("Deletion is not successful");
		}
		
		//driver.close();


	}

}
