package seleniumWDdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\primalla\\Desktop\\jar-files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
//step2 Navigate to application
	
	driver.get("C:/Users/primalla/Desktop/App/hotelbooking.html");
	
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getPageSource());
	
	
}
}