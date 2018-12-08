package seleniumWDdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	public static void main(String[] args) {

		/*
		 * Select demo
		 * selection boxes
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\primalla\\Desktop\\jar-files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/primalla/Desktop/App/hotelbooking.html");
		
		WebElement city = driver.findElement(By.name("city"));
		Select select = new Select(city);
		select.selectByValue("Hyderabad");
	
		WebElement state = driver.findElement(By.name("state"));
		Select select1 = new Select(state);
		select1.selectByVisibleText("Telangana");
		
		WebElement guests = driver.findElement(By.name("persons"));
		Select select2 = new Select(guests);
		select2.selectByIndex(4);
		
		//maximize window
		driver.manage().window().maximize();
		
		
	
	}

}
