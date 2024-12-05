package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f8 {
	@Test
	public void form2() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-2/");
		driver.findElement(By.id("user_email")).sendKeys("roseey.234@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("Roseey");
		driver.findElement(By.id("first_name")).sendKeys("Rosuey");
		driver.findElement(By.id("last_name")).sendKeys("p");
		driver.findElement(By.id("user_pass")).sendKeys("Richum890@");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Richum890@");
		driver.findElement(By.id("nickname")).sendKeys("rosee");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Sun");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-16\"]/form/div[5]/button")).click();
	}
	

}
