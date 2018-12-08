package seleniumWDdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo7 {
	public static void main(String[] args) {
		/*
		 *explicit wait statement
		 *demo
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\primalla\\Desktop\\jar-files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/primalla/Desktop/App/hotelbooking.html");
		
		driver.findElement(By.id("txtFirstName")).sendKeys("Capgemini");
		driver.findElement(By.id("btnPayment")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());
		

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
}
