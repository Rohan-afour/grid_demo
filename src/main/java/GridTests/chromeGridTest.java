package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chromeGridTest {
	//Declaring the variables locally
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;
	
		
		//First Test(Login on a demo website)
		@Test
		public void test1() {
		try {
			nodeUrl1="http://192.168.29.220:4444/wd/hub";
			//Initializing the chrome options object
			ChromeOptions options = new ChromeOptions();
			//Initializing the desired capabilities object
			DesiredCapabilities capabilities= new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			//Passing capabilities object to driver object
			driver=new RemoteWebDriver(new URL(nodeUrl1),capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//Navigating to the web-site
			driver.get("https://www.saucedemo.com/");
			//Fetching the page elements
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			System.out.println("Test succesful");
			
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		}	

}

