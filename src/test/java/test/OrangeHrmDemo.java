package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		 WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  Thread.sleep(5000);
		  
	      driver.findElement(By.cssSelector("button[type='submit']")).click();
		  //tagname
	   String gettagname =    driver.findElement(By.tagName("input")).getTagName();
	   System.out.println(gettagname);
	   
	 // WebElementt the number of links
	  List<WebElement> links = (List<WebElement>) driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
	   
	   //check the login button display
	   Boolean bool1 = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
	   System.out.println(bool1);
		  
		  Thread.sleep(5000);
		  driver.close();
		  
		  
		/*  
		String act_url =  driver.getCurrentUrl();
		
		System.out.println(act_url);
		  String desired_url = "https://opensource-demo.orangehrmlive.com";
		  if (act_url.equals(desired_url))
		  {
			  System.out.println("Pass");
		  }
		  else {
			  System.out.println("Fail");
		  }
		  String act_title= driver.getTitle();
		  System.out.println(act_title);
		  String desired_title="OrangeHRM";
		  if (act_title.equals(desired_title))
		  {
			  System.out.println("Pass");
		  
		  }
		  else {
			  System.out.println("Fail");
		  }
		  String ps =driver.getPageSource();
		  System.out.println(ps);
		//button[@class='btn btn-default btn-lg']
		  Thread.sleep(2000);
		  driver.close();
		  */
	}

}
