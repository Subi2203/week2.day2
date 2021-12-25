package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		String Url = driver.getCurrentUrl();
		String url2="http://leafground.com/pages/Image.html";
		if(Url.equals(url2)) 
		{
			
			System.out.println("Image is broken");
		}else 
			System.out.println("image is not broken");
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).sendKeys(Keys.ENTER);
		
		
	}

}