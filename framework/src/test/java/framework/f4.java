package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f4 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void parabank(String name,String lastName,String addressstreet,String addresscity,String addressstate,String addresszipCode,String phoneNumber,String customerssn,String username,String password,String repeatedPassword) {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\\\"\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.findElement(By.id("customer.firstName")).sendKeys(name);
		driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
		driver.findElement(By.id("customer.address.street")).sendKeys(addressstreet);
		driver.findElement(By.id("customer.address.city")).sendKeys(addresscity);
		driver.findElement(By.id("customer.address.state")).sendKeys(addressstate);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(addresszipCode);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.id("customer.ssn")).sendKeys(customerssn);
		driver.findElement(By.id("customer.username")).sendKeys(username);
		driver.findElement(By.id("customer.password")).sendKeys(password);
		driver.findElement(By.id("repeatedPassword")).sendKeys(repeatedPassword);
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		
	}
	@AfterTest
	public void parabank1() {
		driver.close();
	}
	@DataProvider(name="file")
	public Object[][]parabank2(){
		return new Object[][] {
			{"malu","V","jhhdhsb","gehfwf","ghhsfv","67890","90876532","89075","vdkdndb","ioplmn","ioplmn"},
			{"mnjk","n","hghshhg","gddfgffd","hgkhhjk","789087","98743245678","jhifjhg","sdfgfgh","sdfgfgh"}
		};
		
}
}
