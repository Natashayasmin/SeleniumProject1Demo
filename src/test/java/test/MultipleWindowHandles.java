package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//print parent window handle
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println("The parent window handle is "+parentwindowhandle);
		
		//click 3 times
		for(int i =1;i<=3;i++)
		{
			driver.findElement(By.xpath("//button[normalize-space()='New Window']")).click();
			Thread.sleep(2000);
			
		//print parent window handles
		Set<String>windowhandles =	driver.getWindowHandles();
		String lastwindowhandle="";
		for(String handle:windowhandles)
		{
			System.out.println("The window handles are "+handle);
			
			//switching window
			System.out.println("Switching window "+ handle);
			driver.switchTo().window(handle);
			//navigate to the google
			Thread.sleep(2000);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
		}
	//close parent window first
		Thread.sleep(2000);
		driver.switchTo().window(parentwindowhandle);
		driver.close();
		
		
		
		
		
		//Switch to the other window
		Thread.sleep(2000);
		driver.switchTo().window(lastwindowhandle);
		
		Thread.sleep(2000);
		driver.quit();		
		
		
		}
		
				

	}

}
