package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chromeGridTest2 {
	//Globally declaring variables
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;

	

	// test to Add an item to cart and checkout on a demo web-site
	@Test
	public void test2() {
	try {
		nodeUrl2 = "http://192.168.29.220:4444/wd/hub";
		//Initializing the chrome options object
		ChromeOptions options = new ChromeOptions();
	
		//Initializing the desired capabilities object
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		//PAssing the capabilities object to driver object
		driver=new RemoteWebDriver(new URL(nodeUrl2),capabilities);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//Navigating to the website
		driver.get("https://www.saucedemo.com/");
		//Fetching the elements of the page
		driver.findElement(By.name("user-name")).sendKeys("standard_user");		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		
		driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.name("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Rohan");
		driver.findElement(By.id("last-name")).sendKeys("Mandavkar");
		driver.findElement(By.id("postal-code")).sendKeys("415612");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("finish")).click();
		System.out.println("Test succesful");
		
		
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}
	
	

}
}
