package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("youtube" +Keys.ENTER);
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement link =wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("YouTube: Home")));
		link.click();
		//fluent wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		         fluentWait.until(ExpectedConditions.elementToBeSelected(By.xpath(null)));
		
	    Thread.sleep(2000);
		driver.close();
		driver.quit();

		
	}

}
