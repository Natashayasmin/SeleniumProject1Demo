package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*
		//find elements
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium"+Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		//findElement
		driver.get("https://trytestingthis.netlify.app/");
		List<WebElement> elements= driver.findElements(By.tagName("Select"));
		for(WebElement element: elements) {
			System.out.println("text:"+ element.getText());
		}
		*/
		/*
		//find element within element
		driver.get("https://www.google.com/");
		WebElement form = driver.findElement(By.tagName("form"));
		form.findElement(By.name("q")).sendKeys("ABCD"+ Keys.ENTER);
		*/
		/*
		//get active element
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		String title  =driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);
		*/
		/*
		//get tag name,css, text etc
		driver.get("https://www.google.com/");
		WebElement searchBox =driver.findElement(By.name("q"));
		String tagName=searchBox.getTagName();
		String text=searchBox.getText();
		String cssValue = searchBox.getCssValue("color");
		
		System.out.println(tagName+" - "+text+" - "+ cssValue);
		*/
		//Element check
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		
		Thread.sleep(3000);
		driver.quit();
		

		
	}

}
