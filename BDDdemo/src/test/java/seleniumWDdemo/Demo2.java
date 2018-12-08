package seleniumWDdemo;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static WebDriver driver;
	@BeforeClass
	public static void createDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\primalla\\Desktop\\jar-files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:/Users/primalla/Desktop/App/hotelbooking.html");
	}
	@Test
	public void testFirstName() {
		WebElement firstName=driver.findElement(By.id("txtFirstName"));
		firstName.sendKeys("John");
	}
	
	@Test
	public void testLastName() {
		WebElement lastName=driver.findElement(By.id("txtLastName"));
		lastName.sendKeys("Michael");
	}
	
	@Test
	public void testEmail() {
		WebElement email=driver.findElement(By.id("txtEmail"));
		email.sendKeys("john.michael@gmail.com");
	}
	
	@Test
	public void testMobile() {
		WebElement mobile = driver.findElement(By.name("Phone"));
		mobile.sendKeys("9966337744");
	}
	
	@Test
	public void testAddress() {
		WebElement address=driver.findElement(By.xpath("//textarea[@rows='5']"));
		address.sendKeys("12/55/9 park street");
	}
	
	@Test
	public void testCity() {
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("Hyderabad");
	}
	
	@Test
	public void testState() {
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("AP");
	}
	
	@Test
	public void testHolderName() {
		WebElement hName=driver.findElement(By.name("txtFN"));
		hName.sendKeys("John Michale");
	}
	@Test
	public void testCardNumber() {
		WebElement cardNo=driver.findElement(By.name("debit"));
		cardNo.sendKeys("1234567890");
	}
	@Test
	public void testCVV() {
		WebElement cvv=driver.findElement(By.name("cvv"));
		cvv.sendKeys("147");
	}
	@Test
	public void testMonth() {
		WebElement expMonth=driver.findElement(By.name("month"));
		expMonth.sendKeys("June");
	}
	@Test
	public void testYear() {
		WebElement year=driver.findElement(By.name("year"));
		year.sendKeys("2021");
	}
	@Test
	public void testButton() {
		WebElement state=driver.findElement(By.id("btnPayment"));
		state.submit();
	}
	
	@AfterClass
	public static void closeDriver() {
		driver.close();
	}

}
