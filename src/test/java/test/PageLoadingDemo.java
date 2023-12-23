package test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PageLoadingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//NORMAL,EAGER,NONE
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.quit();	}

}
