package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f13 {
	@Test
	public void form6() {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/flat/");
		driver.findElement(By.id("user_login")).sendKeys("aniil");
		driver.findElement(By.id("user_email")).sendKeys("aniil.123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("Annjjukm12#");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Annjjukm12#");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-107\"]/form/div[8]/button[2]")).click();
		driver.findElement(By.id("first_name")).sendKeys("anil");
		driver.findElement(By.id("last_name")).sendKeys("R");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Bird#Further_reading");
		driver.findElement(By.name("radio_1569440596")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'phone_1569440626')]")).sendKeys("(890) 789-3456");
		driver.findElement(By.xpath("//*[@id=\"date_box_1569440641_field\"]/span/input[1]")).click();
		driver.findElement(By.cssSelector("body > div.flatpickr-calendar.animate.open.arrowBottom.arrowLeft > div.flatpickr-months > div > div > div > input")).sendKeys("0002014");
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")).sendKeys("October");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[18]")).click();
		driver.findElement(By.id("country_1569440636")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-44\"]/form/div[2]/button")).click();
	}

}
