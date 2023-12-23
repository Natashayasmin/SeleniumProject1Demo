package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRootBooksNavigateDemoPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.manage().window().maximize();
		//driver.get (after fully finish load it shows,it can't track the browser history
		driver.get("https://books-pwakit.appspot.com/");
		
		//title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
		
		//verified
		if(title.equals("Books"))
		{
			System.out.println("The title is verified");
		}
		else
		{
			System.out.println("The title is not verified");
		}
		
		//length of the title
		int titlelength = driver.getTitle().length();
		System.out.println("The length of the title is "+titlelength);
		
		//pageSource
		String ps = driver.getPageSource();
		System.out.println("The page source is"+ps);
		
		//length of page Source
		int pslength=driver.getPageSource().length();
		System.out.println("The length of the page source is "+pslength);
		
		/*Click this is the right syntax for click web element but it is not execute for this
		driver.findElement(By.xpath("//span[normalize-space()='Books']")).click();
		*/
		//host
		WebElement host = driver.findElement(By.tagName("book-app"));
		
		//shadow root
		//it will run using SearchContext only
		JavascriptExecutor j = (JavascriptExecutor)driver;
		SearchContext shadowdom = (SearchContext) j.executeScript("return arguments[0].shadowRoot", host);
		
		//app header
		//it will run using cssSelector
		WebElement appheader = shadowdom.findElement(By.cssSelector("app-header"));
		
		//app tool-bar
		WebElement apptool =appheader.findElement(By.className("toolbar-bottom"));
		
        //book-input
		WebElement book=apptool.findElement(By.tagName("book-input-decorator"));
		
		//input
		book.findElement(By.tagName("input")).sendKeys("Harry potter"+Keys.ENTER);
		
		//Refresh the browser
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Refresh the browser");
		
		//navigate the back button
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("The page is navigated the books page");
		
		//navigate the forward button
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("The page is navigated  forward");
		
		Thread.sleep(2000);
		driver.close();
	}

	
}
