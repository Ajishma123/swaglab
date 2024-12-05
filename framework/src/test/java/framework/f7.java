package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f7 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void form2(String login,String mailid,String uspss,String cnpss) {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-1/");
		driver.findElement(By.id("user_login")).sendKeys(login);
		driver.findElement(By.id("user_email")).sendKeys(mailid);
		driver.findElement(By.id("user_pass")).sendKeys(uspss);
		driver.findElement(By.id("user_confirm_password")).sendKeys(cnpss);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-47\"]/form/div[2]/button")).click();
	}
	@AfterTest
	public void form2() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]form3(){
		return new Object[][]{
		{"ammu","ahjms.gmail.com","kjhgfdghj","kjhgfdghj"}
		
	};

}}
