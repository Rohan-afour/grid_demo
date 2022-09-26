package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chromeGridTest3 {
//Run same tests in parallel on different browsers(without using selenium grid)
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;
	@Test
	public void test1() {
		//Login on saucedemo website
		DesiredCapabilities capabilities= new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan.M\\Downloads\\Desktop\\Desktop\\selenium programs\\selenium jars\\selenium jars\\chromedriver.exe");
		driver=new ChromeDriver();
		capabilities.setPlatform(Platform.WINDOWS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Test succesful");
	
}
	@Test
	public void test2() {
		//Login on saucedemo website
		DesiredCapabilities capabilities= new DesiredCapabilities();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Rohan.M\\Downloads\\Desktop\\Desktop\\selenium programs\\selenium jars\\selenium jars\\msedgedriver.exe");
		driver=new EdgeDriver();
		capabilities.setPlatform(Platform.WINDOWS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Test succesful");
		
		
	}
	
	
}
