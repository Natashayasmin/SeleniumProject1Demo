package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*
		//sendKeys
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.name("q")).sendKeys("games" + Keys.ENTER);
		*/
		//Keydown
		/*
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.name("q")).sendKeys("games" + Keys.ENTER);
		Actions actionProvider= new Actions(driver);
		Action Keydown =actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		Keydown.perform();
		*/
		//keyup
		driver.get("https://www.google.co.uk/");
		Actions actions =new Actions(driver);
		WebElement searchBbox= driver.findElement(By.name("q"));
		actions.keyDown(Keys.SHIFT).sendKeys(searchBbox, "games")
		.keyUp(Keys.SHIFT).sendKeys(" games").perform();
		Thread.sleep(2000);
		searchBbox.clear();
		Thread.sleep(2000);
		driver.quit();

	}

}
