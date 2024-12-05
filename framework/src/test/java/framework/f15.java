package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f15 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.findElement(By.id("first_name")).sendKeys("Arub");
		driver.findElement(By.id("last_name")).sendKeys("V");
		driver.findElement(By.id("display_name")).sendKeys("Arubb.V");
		driver.findElement(By.id("user_email")).sendKeys("adxffgg@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("asffghgh");
		driver.findElement(By.id("user_pass")).sendKeys("aasfgg988A@");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-329\"]/form/div[3]/button")).click();
	}

	

}
