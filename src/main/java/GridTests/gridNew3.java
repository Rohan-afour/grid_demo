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

public class gridNew3 {
	//Globally declaring variables
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;
	
		
		//First Test(Login on a demo website)
	   @Test
		public void test1() {
		try {
			nodeUrl1="http://192.168.29.220:4444/wd/hub";
			
			ChromeOptions options = new ChromeOptions();
		    //initializing the desired capabilities object
			DesiredCapabilities capabilities= new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			//passing capabilities object to driver object
			driver=new RemoteWebDriver(new URL(nodeUrl1),capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//fetching the website
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			System.out.println("Test succesful");
			
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		}		     
}

