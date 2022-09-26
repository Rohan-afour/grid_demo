package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridNew2 {
	//Globally declaring variables
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;
	@Test
	public void test2() {
	try {
		 nodeUrl2 = "http://192.168.29.220:4444/wd/hub";
		
		//firefox browser options initialization
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("browserName","firefox"); 
		//passing options to the driver object
		driver=new RemoteWebDriver(new URL(nodeUrl2),options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//fetching the website
		driver.get("https://www.google.com");
		
		WebElement e =driver.findElement(By.name("q"));
	      e.sendKeys("software testing");
	    // Keys.ENTER with sendKeys
	      e.sendKeys(Keys.ENTER);
		System.out.println("Test succesful");
		
		
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}

	}
}
