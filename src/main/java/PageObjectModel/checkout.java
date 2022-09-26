package PageObjectModel;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkout {

	private static WebElement select= null;
	private static WebElement cart= null;
	private static WebElement checkout= null;
	private static WebElement firstname= null;
	private static WebElement lastname= null;
	private static WebElement zip= null;
	private static WebElement continuee= null;
	private static WebElement finish= null;
	
	
	
	
	public static WebElement select(WebDriver driver) {
		select= driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));		
		
		return select;
	}
	
	public static WebElement add_to_cart(WebDriver driver) {
		cart= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));		
		
		return cart;
	}
	

	
	public static WebElement checkout1(WebDriver driver) {
		checkout=driver.findElement(By.name("checkout"));
		
		return checkout;
	}
	
	public static WebElement f_name(WebDriver driver) {
		firstname=driver.findElement(By.id("first-name"));
		
		return firstname;
	}
	
	
	public static WebElement l_name(WebDriver driver) {
		lastname=driver.findElement(By.id("last-name"));
		
		return lastname;
	}
	
	
	public static WebElement zip_code(WebDriver driver) {
		zip=driver.findElement(By.id("postal-code"));
		
		return zip;
	}
	
	
	public static WebElement continuee(WebDriver driver) {
		continuee=driver.findElement(By.id("continue"));
		
		return continuee;
	}
	
	
	public static WebElement finish(WebDriver driver) {
		finish=driver.findElement(By.name("finish"));
		
		return finish;
	}
	
	
	
	
	
	
	
	
}

