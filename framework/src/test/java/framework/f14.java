package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f14 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/payment-with-stripe-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("reeeja.anil189@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Ahgjklg@123");
		driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]")).click();
		driver.findElement(By.cssSelector("#user-registration-form-351 > form > div.ur-button-container > button")).click();
	}
	

}
