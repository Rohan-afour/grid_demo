package GridTestPOM;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import PageObjectModel.login;
import PageObjectModel.checkout;
import PageObjectModel.form;

public class pom2 {
	//Globally declaring variables
	static WebDriver driver;
	static String nodeUrl1;
	static String nodeUrl2;

	

	// test to Add an item to cart and checkout on a demo web-site
	@Test
	public void test2() throws InterruptedException {
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
		//Login
		login.navigation(driver).sendKeys("standard_user");
		Thread.sleep(3000);
		login.password(driver).sendKeys("secret_sauce");
		Thread.sleep(3000);
		login.button(driver).click();
		
		//Selecting and adding item to cart
		checkout.select(driver).click();
		Thread.sleep(3000);
		checkout.add_to_cart(driver).click();
		Thread.sleep(3000);
		checkout.checkout1(driver).click();
		
		
		checkout.f_name(driver).sendKeys("Rohan");
		Thread.sleep(2000);
		checkout.l_name(driver).sendKeys("Mandavkar");
		Thread.sleep(2000);
		checkout.zip_code(driver).sendKeys("415612");
		Thread.sleep(2000);
		checkout.continuee(driver).click();
		Thread.sleep(3000);
		checkout.finish(driver).click();
		System.out.println("Test succesful");
		
		

		//Navigating to the website
		driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
		
		form.f_name(driver).sendKeys("Rohan");
		Thread.sleep(1000);
		form.l_name(driver).sendKeys("Mandavkar");
		Thread.sleep(1000);
		form.email(driver).sendKeys("rmandavkar@gmail.com");
		Thread.sleep(1000);
		form.phone(driver).sendKeys("1234567890");
		Thread.sleep(1000);
		form.address(driver).sendKeys("Shivaji nagar");
		Thread.sleep(1000);
		form.city(driver).sendKeys("Ratnagiri");
		Thread.sleep(1000);
		form.state(driver).sendKeys("Maharashtra");
		Thread.sleep(1000);
		form.zip(driver).sendKeys("12345678");
		Thread.sleep(1000);
		form.website(driver).sendKeys("www.xyz.com");
		Thread.sleep(1000);
		form.comment(driver).sendKeys("This is a demo form for practice purpose");
		Thread.sleep(1000);
		form.hosting(driver).click();
		Thread.sleep(1000);
		form.send(driver).click();
		Thread.sleep(1000);
		
		driver.close();
		
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}
	
	

}
}