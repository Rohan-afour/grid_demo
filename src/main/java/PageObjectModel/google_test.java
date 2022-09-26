package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class google_test {
	
	private static WebElement enter= null;
	private static WebElement select= null;
	private static WebElement email= null;
	private static WebElement phone= null;
	private static WebElement address= null;
	private static WebElement city= null;
	private static WebElement state= null;
	
	public static WebElement enter(WebDriver driver) {
		enter= driver.findElement(By.name("q"));	
		
		return enter;
	}
	
	
	public static WebElement select(WebDriver driver) {
		select= driver.findElement(By.xpath("//*[@id=\"Odp5De\"]/div[1]/div[2]/div[1]/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/a/h3"));	
		
		return select;
	}
	

}
