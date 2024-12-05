package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f19 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void swaglab(String name,String password) {
		System.setProperty("Webdriver.chrome.Driver","C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/v1/");
	    driver.findElement(By.id("user-name")).sendKeys(name);
	    driver.findElement(By.id("password")).sendKeys(password);
	    driver.findElement(By.id("login-button")).click();
	    driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
	    
	}
	@AfterTest
	public void swaglab1() {
		driver.close();
		
	}
	@DataProvider(name="file")
	public Object[][] swaglab2(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"}
		};
	}

}