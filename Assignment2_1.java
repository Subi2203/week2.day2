package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_1 {
	//Create Contact

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Subburaj");
		driver.findElement(By.id("lastNameField")).sendKeys("Thangavel");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Subburaj");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Thangavel");
		driver.findElement(By.name("departmentName")).sendKeys("Department IT");
		driver.findElement(By.name("description")).sendKeys("Description");
		driver.findElement(By.xpath("//input[@id = 'createContactForm_primaryEmail']"));
		WebElement stateDrop = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select slct1 = new Select(stateDrop);
		slct1.selectByVisibleText("Hawaii");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note filled");
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);

	}

}
