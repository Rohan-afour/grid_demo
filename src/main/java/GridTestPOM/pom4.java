package GridTestPOM;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import PageObjectModel.login;
import PageObjectModel.checkout;
import PageObjectModel.sort;
import PageObjectModel.form;
import PageObjectModel.google_test;

public class pom4 {
		//Globally declaring variables
		static WebDriver driver;
		static String nodeUrl1;
		static String nodeUrl2;

		// test to demonstrate sorting operation using selenium grid
		@Test
		public void test1() throws InterruptedException {
		try {
			nodeUrl2 = "http://192.168.29.220:4444/wd/hub";
			//Initializing the chrome options object
			//ChromeOptions options = new ChromeOptions();
		
			//Initializing the desired capabilities object
			DesiredCapabilities capabilities= new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			//PAssing the capabilities object to driver object
			driver=new RemoteWebDriver(new URL(nodeUrl2),capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			
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
			
			
			//Second test
			driver.get("https://www.google.co.in/");
			
			WebElement google=  google_test.enter(driver);
			google.sendKeys("Selenium grid");
			Thread.sleep(2000);
			//Pressing enter key
			google.sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			google_test.select(driver).click();
			Thread.sleep(2000);
			
			//third test
			driver.get("https://www.saucedemo.com/");
			//Login
			login.navigation(driver).sendKeys("standard_user");
			Thread.sleep(2000);
			login.password(driver).sendKeys("secret_sauce");
			Thread.sleep(2000);
			login.button(driver).click();
			
			//fourth test
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			//Login
			login.navigation(driver).sendKeys("standard_user");
			Thread.sleep(2000);
			login.password(driver).sendKeys("secret_sauce");
			Thread.sleep(2000);
			login.button(driver).click();
			
			Thread.sleep(3000);
			//sorting logic
			sort.sortbar(driver).click();
			Thread.sleep(2000);
			sort.actual_sort(driver).click();
			Thread.sleep(2000);
			
			//fifth test case
	
			driver.close();
					
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	}
