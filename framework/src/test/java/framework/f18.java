package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f18 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.wpeverest.com/user-registration/social-registration-form/");
	driver.findElement(By.id("first_name")).sendKeys("vays");
	driver.findElement(By.id("user_email")).sendKeys("vayas@gmail.com");
	driver.findElement(By.id("user_login")).sendKeys("vayasuttan");
	driver.findElement(By.id("last_name")).sendKeys("kuttan");
	driver.findElement(By.id("user_pass")).sendKeys("xfgkfddx");
	driver.findElement(By.name("phone_1623133256")).sendKeys("(345) 678-9076");
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-305\"]/form/div[2]/button")).click();

	}
}
