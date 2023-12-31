package test;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProxyDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Proxy proxy =new Proxy();
		proxy.setAutodetect(false);
		proxy.setHttpProxy("localhost.8080");
		proxy.setSslProxy("localhost.8080");
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("proxy", proxy);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
