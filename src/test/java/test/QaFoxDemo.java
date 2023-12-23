package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QaFoxDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		//driver.findElement(By.name("search")).sendKeys("Phone" +Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='iPhone']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone"+Keys.ENTER);

	}

}
