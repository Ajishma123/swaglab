package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f5 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void form1(String name,String name2,String logiin,String mailid,String usspass,String comformpass,String afj) {
		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		 driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.findElement(By.id("first_name")).sendKeys(name);
		driver.findElement(By.id("last_name")).sendKeys(name2);
		driver.findElement(By.id("user_login")).sendKeys(logiin);
		driver.findElement(By.id("user_email")).sendKeys(mailid);
		driver.findElement(By.id("user_pass")).sendKeys(usspass);
		driver.findElement(By.id("user_confirm_password")).sendKeys(comformpass);
		driver.findElement(By.id("description")).sendKeys(afj);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();	
	}
	@AfterTest 
	public void form2() {
		driver.close();
		
	}
	@DataProvider(name="file")
	public Object[][]form3(){
		return new Object[][] {
			{"ajishma","v","ajishmav","ajishma234@gmail.com","gfggfdfg","gfggfdfg","LIC"}
			
		};
	}
}