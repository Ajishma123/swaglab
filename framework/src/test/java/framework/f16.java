package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f16 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/profile-registration-form/");
		driver.findElement(By.id("user_email")).sendKeys("amvym123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Sh234$");
		driver.findElement(By.id("first_name")).sendKeys("Ammu");
		driver.findElement(By.id("last_name")).sendKeys("S");
		driver.findElement(By.id("number_box_1623120412")).sendKeys("26");
		driver.findElement(By.xpath("//*[@id=\"radio_1623120379_Female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"country_1629717450\"]")).sendKeys("India");
		driver.findElement(By.xpath("Primary Menu")).click();
	
	}
}
