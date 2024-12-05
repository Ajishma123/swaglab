package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f12 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/donation-form/");
		driver.findElement(By.id("user_email")).sendKeys("raamuj@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Rasdfg56@");
		driver.findElement(By.id("ur_file_1641275829")).click();
		driver.get("\"C:\\Users\\User\\Downloads\\Gutenberg_Bible,_Lenox_Copy,_New_York_Public_Library,_2009._Pic_01.jpg\"");
	}
	

}
