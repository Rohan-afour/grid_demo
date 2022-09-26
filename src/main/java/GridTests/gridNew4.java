package GridTests;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridNew4 {
	//Globally declaring variables
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;
	@Test
	public void test2() {
	try {
		 nodeUrl2 = "http://192.168.29.220:4444/wd/hub";
		//Initializing chromeoption object and passing browser properties
		ChromeOptions options = new ChromeOptions();
		options.setCapability("browserName","chrome"); 
		//passing capabilities object to driver object
		driver=new RemoteWebDriver(new URL(nodeUrl2),options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//navigating to the website
		driver.get("https://www.google.com");
		//fetching elements
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
