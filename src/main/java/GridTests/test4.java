package GridTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class test4 {
	//program to run different test cases in parallel over different browsers (without using selenium grid)
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;
	@Test
	public void test1() {
		//Test to sort items in ascending order on chrome browser
		  String baseUrl = "https://www.saucedemo.com/";					
	        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Rohan.M\\\\Downloads\\\\Desktop\\\\Desktop\\\\selenium programs\\\\selenium jars\\\\selenium jars\\\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	        		
	        driver.get(baseUrl);					
	        driver.manage().window().maximize();
			driver.findElement(By.name("user-name")).sendKeys("standard_user");		
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.name("login-button")).click();
			System.out.println("Test succesful");
			
			driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
			
			driver.findElement(By.xpath("//option[@value='za']")).click();
			
	        //driver.quit();
		
}
	@Test
	public void test2() {
		//Test to add item to cart and checkout using microsoft edge browser
		 String baseUrl = "https://www.saucedemo.com/";					
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Rohan.M\\Downloads\\Desktop\\Desktop\\selenium programs\\selenium jars\\selenium jars\\msedgedriver.exe");
	        WebDriver driver = new EdgeDriver();					
	        		
	        driver.get(baseUrl);					
	        driver.manage().window().maximize();
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
	        //driver.quit();	
}
}
