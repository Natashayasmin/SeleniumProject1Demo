package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_Checkbo_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//check
		
	 driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
	    Thread.sleep(2000);
	    
	  driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
	    Thread.sleep(2000);
	    
	   driver.findElement(By.xpath("//label[normalize-space()='Music']")).click();
	   Thread.sleep(2000);
	   
	 //uncheck
	 
	 //reading.click();
	 
	    driver.close();
	

	}

}
