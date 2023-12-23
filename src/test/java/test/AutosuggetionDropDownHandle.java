package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggetionDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amybd.com/index?v=202312191657481");
		driver.manage().window().maximize();
		
		//autosuggetion
		//from
		driver.findElement(By.xpath("//input[@id='jfrom']")).click();
		Thread.sleep(2000);
		WebElement from =driver.findElement(By.xpath("//input[@id='cityfindF']"));
		from.sendKeys("Chittagong");
		Thread.sleep(2000);
		from.findElement(By.xpath("(//a[@href='#'][normalize-space()='Chittagong - CGP - BANGLADESH'])[1]")).click();
		Thread.sleep(2000);
		

		
		//to
		 driver.findElement(By.xpath("//input[@id='jdest']")).click();
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//input[@id='cityfindT']"));
		to.sendKeys("Sylhet");
		Thread.sleep(2000);
		to.findElement(By.xpath(""));
		//read.sleep(2000);
		
	
		
		driver.close();

	}

}
