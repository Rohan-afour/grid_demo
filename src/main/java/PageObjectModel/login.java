package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {

	private static WebElement button= null;
	private static WebElement password= null;
	private static WebElement nav= null;
	private static WebElement bag= null;
	private static WebElement cart= null;
	private static WebElement checkout= null;
	private static WebElement text1= null;
	private static WebElement text2= null;
	private static WebElement text3= null;
	private static WebElement continue1= null;
	private static WebElement finish= null;
	
	
	
	public static WebElement navigation(WebDriver driver) {
		nav= driver.findElement(By.id("user-name"));		
		
		return nav;
	}
	
	public static WebElement password(WebDriver driver) {
		password= driver.findElement(By.id("password"));		
		
		return password;
	}
	

	
	public static WebElement button(WebDriver driver) {
		button= driver.findElement(By.id("login-button"));
		
		return button;
	}
	
	public static WebElement cart(WebDriver driver) {
		cart= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));	
		
		return cart;
	}
	
	public static WebElement checkout(WebDriver driver) {
		checkout= driver.findElement(By.name("checkout"));	
		
		return checkout;
	}
	
	public static WebElement text1(WebDriver driver) {
		text1= driver.findElement(By.id("first-name"));	
		
		return text1;
	}
	
	public static WebElement text2(WebDriver driver) {
		text2= driver.findElement(By.id("last-name"));	
		
		return text2;
	}
	
	public static WebElement text3(WebDriver driver) {
		text3= driver.findElement(By.id("postal-code"));	
		
		return text3;
	}
	
	public static WebElement continue1(WebDriver driver) {
		continue1= driver.findElement(By.id("continue"));	
		
		return continue1;
	}
	
	public static WebElement finish(WebDriver driver) {
		finish= driver.findElement(By.name("finish"));	
		
		return finish;
	}
	
	
	
	
	
}

