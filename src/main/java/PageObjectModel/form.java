package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class form {

	private static WebElement f_name= null;
	private static WebElement l_name= null;
	private static WebElement email= null;
	private static WebElement phone= null;
	private static WebElement address= null;
	private static WebElement city= null;
	private static WebElement state= null;
	private static WebElement zip= null;
	private static WebElement website= null;
	private static WebElement continue1= null;
	private static WebElement comment= null;
	private static WebElement send=null;
	private static WebElement hosting=null;
	
	public static WebElement f_name(WebDriver driver) {
		f_name= driver.findElement(By.name("first_name"));		
		
		return f_name;
	}
	
	public static WebElement l_name(WebDriver driver) {
		l_name= driver.findElement(By.name("last_name"));		
		
		return l_name;
	}
	
	
	public static WebElement email(WebDriver driver) {
		email= driver.findElement(By.name("email"));
		
		return email;
	}
	
	public static WebElement phone(WebDriver driver) {
		phone= driver.findElement(By.name("phone"));	
		
		return phone;
	}
//	
	public static WebElement address(WebDriver driver) {
		address= driver.findElement(By.name("address"));	
		
		return address;
	}
//	
	public static WebElement city(WebDriver driver) {
		city= driver.findElement(By.name("city"));	
		
		return city;
	}
//	
	public static WebElement state(WebDriver driver) {
		state= driver.findElement(By.name("state"));	
		
		return state;
	}
//	
	public static WebElement zip(WebDriver driver) {
		zip= driver.findElement(By.name("zip"));	
		
		return zip;
	}
//	
	public static WebElement website(WebDriver driver) {
		website= driver.findElement(By.name("website"));	
		
		return website;
	}
//	
	public static WebElement comment(WebDriver driver) {
		comment= driver.findElement(By.name("comment"));	
		
		return comment;
	}
	
	public static WebElement send(WebDriver driver) {
		send= driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));	
		
		return send;
	}
	
	public static WebElement hosting(WebDriver driver) {
		hosting= driver.findElement(By.name("hosting"));		
		
		return hosting;
	}
	
	
	

}
