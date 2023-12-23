package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    
    driver.get("https://www.google.com/");
    driver.findElement(By.id("APjFqb")).sendKeys("phone"+Keys.ENTER);
    
    driver.findElement(By.id("APjFqb")).clear();
    
    driver.getWindowHandle();
    
    //driver.navigate().to("https://www.linkedin.com/home");
    /*
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    
    driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().window(originalWindow);
	Thread.sleep(2000);
	 driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html");
    driver.switchTo().frame(0); 
    
    
    driver.manage().window().getSize().getWidth();
    driver.manage().window().getSize().getHeight();
    Dimension size = driver.manage().window().getSize();
    System.out.println(size.getWidth());
    System.out.println(size.getHeight());
    
    driver.manage().window().setSize(new Dimension(800,600));
    driver.manage().window().getPosition().getX();
    driver.manage().window().getPosition().getY();
    driver.manage().window().setPosition(new Point (500,100));
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.manage().window().minimize();
    Thread.sleep(2000);
    driver.manage().window().fullscreen();
    
    
    File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcfile, new File("./image.png"));
    
     WebElement element = driver.findElement(By.cssSelector(".InXdpd"));
     File srcfile1= element.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(srcfile1, new File("./image1.png"));
     
    JavascriptExecutor js =(JavascriptExecutor)driver;
    
    WebElement button = driver.findElement(By.name("btnI"));
    Thread.sleep(2000);
	js.executeScript("arguments[0].click();", button);
	Thread.sleep(2000);
    js.executeScript("console.log(' Hello world ..')");
    Thread.sleep(3000);
    */
    //driver.close();
	
    
	}

}
