package seleniumWDdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) {
	/*
	 *implicit wait statement
	 *demo
	 */
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\primalla\\Desktop\\jar-files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:/Users/primalla/Desktop/App/hotelbooking.html");

	/*
	 *implicit wait statement 
	 * set max time to download the webpage, waits for max of 20 seconds as described
	 */
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("txtFirstName")).sendKeys("Capgemini"); //disadvantage:conditions cannot be given
	
	
	}
}