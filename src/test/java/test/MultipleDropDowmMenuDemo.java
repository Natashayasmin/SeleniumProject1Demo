package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDowmMenuDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		//select class
				//WebElement dropdown = driver.findElement(By.xpath("//select[contains(@country-data-region-id,'gds-cr-one')]"));
				//Select selectelement = new Select(dropdown);
				//or 
				Select selectelement = new Select(driver.findElement(By.xpath("//select[@multiple='owc']")));
				
				//find the options present in the dropdown menu
				List<WebElement>options = selectelement.getOptions();
				System.out.println(options.size());
				
				//print
				for(WebElement e:options)
				{
					System.out.println("The values are" + e.getText());
				}
				
				//isMultiple
				Boolean bool1 = selectelement.isMultiple();
				System.out.println(bool1);
				
				//select
				//selectindex
				Thread.sleep(2000);
				selectelement.selectByIndex(1);
				//selectbyvalue
				Thread.sleep(2000);
				selectelement.selectByValue("option 3");
				//selectbyvisibletext
				selectelement.selectByVisibleText("option 3");
				Thread.sleep(2000);
				//first selected value
				//System.out.println(selectelement.getFirstSelectedOption().getText());
				
				//deselect
				WebElement dropdown = driver.findElement(By.xpath("//select[@id='owc']//option[@value='option 3'][normalize-space()='Option 3']"));
				Select selectObject = new Select(dropdown);
				Thread.sleep(2000);
				selectObject.selectByValue("option 3");
	}

}
