package test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeCodenAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.manage().window().maximize();
		//switch window
		
		/*
		Thread.sleep(2000);
		driver.findElement(By.id("nf-field-17")).sendKeys("ABC"+Keys.ENTER);
		Thread.sleep(2000);
		// Clear the text
		driver.findElement(By.id("nf-field-17")).clear();
		Thread.sleep(2000);
		//Re-enter text
		driver.findElement(By.id("nf-field-17")).sendKeys("ABC"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("nf-field-18")).sendKeys("ABC"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("nf-field-19")).sendKeys("ABC@gmail.com"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("nf-field-20")).sendKeys("01234567898"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.id("nf-field-22"));
		Select selectObject = new Select(dropdown1);
		selectObject.selectByVisibleText("Selenium Automation");
		
		Thread.sleep(2000);
		WebElement dropdown2 = driver.findElement(By.id("nf-field-24"));
		Select selectObject1 = new Select(dropdown2);
		selectObject1.selectByVisibleText("December");
		Thread.sleep(2000);
		driver.findElement(By.id("nf-label-class-field-23-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nf-field-15")).click();
		Thread.sleep(2000);
		*/
	    /*
		WebElement checkbox = driver.findElement(By.xpath("(//label[normalize-space()='LinkedIn'])[1]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		Thread.sleep(2000);
	     */
		

	     driver.close();
	     
	}

}
