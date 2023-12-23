package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WordpressDemoPracticeNavigationCommand {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.navigate().to it shows immediately, it track the history of browser and can perform back & forth in the browser
		driver.navigate().to("https://wordpress.com/");
		
		driver.manage().window().maximize();
		
		//Click on get started
		driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		//refresh
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
