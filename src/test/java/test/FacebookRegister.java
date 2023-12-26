package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegister {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		System.out.println(" it is Updated");
		Thread.sleep(2000);
		 driver.findElement(By.name("firstname")).sendKeys("QA First Name");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("QA Last Name");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("01711111111");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		Thread.sleep(2000);
		WebElement Daydropdown = driver.findElement(By.id("day"));
		Select DayselectObject = new Select(Daydropdown);
		DayselectObject.selectByValue("15");
		Thread.sleep(2000);
		WebElement Monthdropdown = driver.findElement(By.id("month"));
		Select MonthselectObject = new Select(Monthdropdown);
		MonthselectObject.selectByValue("2");
		Thread.sleep(2000);
		WebElement Yeardropdown = driver.findElement(By.id("year"));
		Select YearselectObject = new Select(Yeardropdown);
		YearselectObject.selectByValue("1997");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[normalize-space()='Custom'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		 Thread.sleep(2000);
		 
		
			  
			  
		 driver.close();
	}

}
