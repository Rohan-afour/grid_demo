package GridTests;

	
	import java.net.MalformedURLException;
	import java.net.URL;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

	import org.openqa.selenium.remote.RemoteWebDriver;

	public class GridTest4 {
		//with grid for different browsers using java
	
		static WebDriver driver;
		static String nodeUrl1;
		static String nodeUrl2;
		public static void main(String[] args) throws MalformedURLException {
			
			//First Test(Login on a demo web-site)
			try {
				nodeUrl1="http://192.168.29.220:4444/wd/hub";
				
				//ChromeOptions options = new ChromeOptions();
			    EdgeOptions opt= new EdgeOptions();
				opt.setPlatformName("windows");
			
				//DesiredCapabilities capability = DesiredCapabilities.edge();
				DesiredCapabilities capabilities =new DesiredCapabilities();
//				capabilities.setBrowserName("MicrosoftEdge");
//				capabilities.setPlatform(Platform.WINDOWS);
				//capabilities.setBrowserName(BrowserType.EDGE);
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Rohan.M\\Downloads\\Desktop\\Desktop\\selenium programs\\selenium jars\\selenium jars\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();	
				driver=new RemoteWebDriver(new URL(nodeUrl1),opt);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				System.out.println("Test succesful");
				
				
			}catch(MalformedURLException e) {
				e.printStackTrace();
			}
			
//		---------------------------------------------------------------------------
	         //Second Test(Search a keyword on google)
			try {
				 nodeUrl2 = "http://192.168.29.220:8612/wd/hub";
				
				
				
				DesiredCapabilities capabilities= new DesiredCapabilities();
				capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WINDOWS);
				driver=new RemoteWebDriver(new URL(nodeUrl2),capabilities);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
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
