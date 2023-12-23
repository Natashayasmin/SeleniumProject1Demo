package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    
	   
	    
	  //  WebElement searchBox = driver.findElement(By.name("q"));
	   // searchBox.sendKeys("Youtube",Keys.ENTER);
	    /*
	   driver.navigate().to("https://trytestingthis.netlify.app");
	   List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
	   
	   for (WebElement element : options) {
		   System.out.println(element.getText());
	   }
	    		
	    driver.findElement(By.cssSelector(("#frame"))).sendKeys("natasha"); 
	    */
	    driver.get("https://www.google.com/");
	    driver.navigate().to("https://www.orangehrm.com/");
	    WebElement loginbutton = driver.findElement(By.id("btnLogin"));
	    
	     ((WebElement) driver.findElements( RelativeLocator.with (By.tagName("Input")).above(loginbutton))).sendKeys("ABCD");
	    
	     Thread.sleep(3000);
	     driver.close();
	     driver.quit();

	}

}
