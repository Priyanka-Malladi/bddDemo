package seleniumWDdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\primalla\\Desktop\\jar-files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//getText() demo
		driver.get("C:/Users/primalla/Desktop/App/hotelbooking.html");
		String str = driver.findElement(By.xpath("//h2")).getText();
		System.out.println(str);
		
		//getAttribute() demo
		driver.findElement(By.id("txtFirstName")).sendKeys("Capgemini");
		System.out.println(driver.findElement(By.id("txtFirstName")).getAttribute("name"));
		System.out.println(driver.findElement(By.id("txtFirstName")).getAttribute("value"));
		
		
		//alert boxes
		driver.findElement(By.id("btnPayment")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
	
	}
}
