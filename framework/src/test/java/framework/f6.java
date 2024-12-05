package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f6 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void form2(String login,String mailid,String usspss,String cmpass) {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/bordered/");
		driver.findElement(By.id("user_login")).sendKeys(login);
		driver.findElement(By.id("user_email")).sendKeys(mailid);
		driver.findElement(By.id("user_pass")).sendKeys(usspss);
		driver.findElement(By.id("user_confirm_password")).sendKeys(cmpass);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-43\"]/form/div[2]/button")).click();
		
	}
	@AfterTest
	public void form2() {
		driver.close();
		
	}
	@DataProvider(name="file")
	public Object[][] form3(){
		return new Object[][] {
			{"athulp","athulmnm.gmail.com","dfghjkghj","dfghjkghj"}
		};
	}

}
