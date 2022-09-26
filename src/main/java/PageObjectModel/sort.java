package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sort {

	private static WebElement bar= null;
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
	
	
	
	public static WebElement sortbar(WebDriver driver) {
		bar= driver.findElement(By.className("product_sort_container"));		
		
		return bar;
	}
	
	public static WebElement actual_sort(WebDriver driver) {
		password= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));		
		
		return password;
	}
	


	
}

