package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeGridTest5 {
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;
	public static void main(String[] args) {
		
	
	//First test(Fill a form on a demo website)
	try {
		nodeUrl1="http://192.168.29.220:4444/wd/hub";
		
		ChromeOptions options = new ChromeOptions();
	
		
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeUrl1),capabilities);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		//driver.findElement(By.("Samsung galaxy s7")).click();
		driver.findElement(By.partialLinkText("btn btn-success btn-lg")).click();
//		driver.findElement(By.id("userName")).sendKeys("Rohan M");
//		driver.findElement(By.id("userName")).sendKeys("Rohan M");
//		driver.findElement(By.id("userName")).sendKeys("Rohan M");
//		driver.findElement(By.id("userName")).sendKeys("Rohan M");
//		driver.findElement(By.id("userName")).sendKeys("Rohan M");
//		driver.findElement(By.id("userName")).sendKeys("Rohan M");
//		driver.findElement(By.id("userName")).sendKeys("Rohan M");
		
		System.out.println("Test succesful");
		
		
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}
	
//	-------------------------------------------------------------------------------
	//Second test(Add an item to cart and checkout on a demo website)
	try {
		nodeUrl2 = "http://192.168.29.220:4444/wd/hub";
		
		ChromeOptions options = new ChromeOptions();
	
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeUrl2),capabilities);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");		
		
		System.out.println("Test succesful");
		
		
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}
	
	

}
}