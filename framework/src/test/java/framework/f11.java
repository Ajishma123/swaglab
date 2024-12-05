package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f11 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/date-and-time-form/");
		driver.findElement(By.id("first_name")).sendKeys("Ammu");
		driver.findElement(By.id("last_name")).sendKeys("U");
		driver.findElement(By.id("user_email")).sendKeys("ammu.u@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Amnbu23@");
//		driver.findElement(By.id("date_box_1623131781")).sendKeys("00002022");
		driver.findElement(By.xpath("//*[@id=\"radio_1623131945_field\"]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1623131945_yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"textarea_1623132039\"]")).sendKeys("Sumnil");
		driver.findElement(By.xpath("//*[@id=\"timepicker_1641276686\"]")).click();
		driver.findElement(By.xpath("/html/body/div[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-336\"]/form/div[6]/button")).click();
	}
	

}
