package test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
