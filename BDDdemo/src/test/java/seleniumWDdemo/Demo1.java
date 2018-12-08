package seleniumWDdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Step1 Launch Browser
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\primalla\\Desktop\\jar-files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//step2 Navigate to application
		
		driver.get("C:/Users/primalla/Desktop/App/login.html");
		
	//step3 Enter username(find the element and perform action)
	
		//driver.findElement(By.name("userName")).sendKeys("Capgemini");
		WebElement user = driver.findElement(By.xpath("//input[@name='userName']"));
		user.sendKeys("Capgemini");
		
	//step4 Enter password
	
		//driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		WebElement pass = driver.findElement(By.xpath("//input[@name='userPwd']"));
		pass.clear();
		pass.sendKeys("capg1234");
	//step5 Hit login button
	
		//driver.findElement(By.className("btn")).click();
		WebElement submit =driver.findElement(By.xpath("//input[@type='button']"));
		submit.click();
	//step6 close browser
	
		driver.close();
	}

}
