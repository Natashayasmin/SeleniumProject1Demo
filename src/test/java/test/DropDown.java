package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open url
		driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		driver.manage().window().maximize();
		
		//select class
		//WebElement dropdown = driver.findElement(By.xpath("//select[contains(@country-data-region-id,'gds-cr-one')]"));
		//Select selectelement = new Select(dropdown);
		//or 
		Select selectelement = new Select(driver.findElement(By.xpath("//select[contains(@country-data-region-id,'gds-cr-one')]")));
		
		List<WebElement>options = selectelement.getOptions();
		System.out.println(options.size());
		
		//print
		for(WebElement e:options)
		{
			System.out.println("The values are" + e.getText());
		}
		
		//select the options
		//select the value
		selectelement.selectByValue("Bangladesh");
		
		//isMultiple
		Boolean bool=selectelement.isMultiple();
		System.out.println(bool);
		
		//selectbyindex
		//selectelement.selectByIndex(19);
		//selectbyvisibletext
		//selectelement.selectByVisibleText("Bangladesh");
		Thread.sleep(2000);
		Select selectelement1 = new Select(driver.findElement(By.xpath("//select[contains(@id,'gds-cr-one')]")));
		List<WebElement>options1 = selectelement1.getOptions();
		System.out.println(options1.size());
		
		//select the options
				//select the value
				selectelement1.selectByValue("Dhaka");
				
				Boolean bool1=selectelement.isMultiple();
				System.out.println(bool1);
		
		
		
		
		
		
		/*
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		//checkbox
		Select selectelement = new Select(driver.findElement(By.xpath("//label[.='Choose applicable options:']")));
		selectelement.selectByValue("option 1");
	    selectelement.selectByIndex(1);
		selectelement.selectByVisibleText("option 1");
		
		/*
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);
		
		selectObject.selectByIndex(1);
		selectObject.selectByValue("option 2");
		selectObject.selectByVisibleText("option 3");
		
		List<WebElement> allAvailableOptions = selectObject.getOptions();
		
		List<WebElement>allOptions = driver.findElements(By.id("options"));
		
		
		for(WebElement option : allAvailableOptions ) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("option 3"))
				option.click();
			Thread.sleep(2000);
		}
		
		//Deselect
		/*
		WebElement dropdown = driver.findElement(By.id("owc"));
		Select selectObject = new Select(dropdown);
		
		selectObject.selectByIndex(1);
		Thread.sleep(2000);
		selectObject.selectByValue("option 2");
		Thread.sleep(2000);
		selectObject.selectByVisibleText("option 3");
		Thread.sleep(2000);
		selectObject.deselectByVisibleText("option 3");
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Done");
		*/

	}

}
