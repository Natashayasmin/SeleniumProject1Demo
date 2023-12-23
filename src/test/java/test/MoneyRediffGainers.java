package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoneyRediffGainers {

	public static void main(String[] args ) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//selfnode
		
		String selfnode = driver.findElement(By.xpath("//a[contains(.,'BAG Films & Media')]/self::a")).getText();
		System.out.println("The selfnode is "+ selfnode);
		//parentnode
		
		String parentnode = driver.findElement(By.xpath("//a[contains(.,'BAG Films & Media')]/parent::td")).getText();
		System.out.println("The parentnode is "+ parentnode);
        //childnode
		
		List<WebElement>childnode= driver.findElements(By.xpath("//a[contains(.,'BAG Films & Media')]/ancestor::tr/child::*"));
		System.out.println("The number of childnodes are "+ childnode.size());
		//ancestornode
		
		String ancestornode = driver.findElement(By.xpath("//a[contains(.,'BAG Films & Media')]/ancestor::tr")).getText();
		System.out.println("The ancestor node is"+ ancestornode);
		//following
		
		List<WebElement>followingtag = driver.findElements(By.xpath("//a[contains(.,'BAG Films & Media')]/following::*"));
		System.out.println("The no of following elements from the current HTML tag is"+ followingtag.size());
		
		
		//following-sibling
		
		List<WebElement>followingsib = driver.findElements(By.xpath("//a[contains(.,'BAG Films & Media')]/ancestor::tr/following-sibling::*"));
		System.out.println("The following siblings are followingsib"+ followingsib.size());
		
		//preceding
		List<WebElement>pre = driver.findElements(By.xpath("//a[contains(.,'BAG Films & Media')]/preceding::*"));
		System.out.println("The number of preceding nodes are- "+pre.size());
		
		
		
		//preceding sibling
		List<WebElement>presib = driver.findElements(By.xpath("//a[contains(.,'BAG Films & Media')]/ancestor::tr/preceding-sibling::*"));
		System.out.println("The number of preceding sibling are - "+presib.size());
		
		driver.quit();
	}
	
}

