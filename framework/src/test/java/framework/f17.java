package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f17 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/recaptcha-registration-form/");
		driver.findElement(By.id("first_name")).sendKeys("lulu");
		driver.findElement(By.id("user_email")).sendKeys("lulu.ahjm@gmail.com");
		driver.findElement(By.id("display_name")).sendKeys("lulumm");
		driver.findElement(By.id("last_name")).sendKeys("V");
		driver.findElement(By.id("user_pass")).sendKeys("Afhb345#");
		driver.findElement(By.name("phone_1623134125")).sendKeys("(789) 056-7906");
	}
}
