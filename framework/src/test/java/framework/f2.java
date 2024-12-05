package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f2 {
	@Test
	public void parabank() {
		System.setProperty("Webdriver.Chromr.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	    driver.findElement(By.id("customer.firstName")).sendKeys("ammu");
		driver.findElement(By.id("customer.lastName")).sendKeys("V");
		driver.findElement(By.id("customer.address.street")).sendKeys("ajishma nivas puttekkade");
		driver.findElement(By.id("customer.address.city")).sendKeys("Kozhikode");
		driver.findElement(By.id("customer.address.state")).sendKeys("kerala");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("673631");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("7012766762");
		driver.findElement(By.id("customer.ssn")).sendKeys("23456790");
		driver.findElement(By.id("customer.username")).sendKeys("ammu.v");
		driver.findElement(By.id("customer.password")).sendKeys("234Abgf$");
		driver.findElement(By.id("repeatedPassword")).sendKeys("234Abgf$");
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/header/div/div/div/nav[1]/ul/li[1]/span")).click();
		driver.get("https://www.parasoft.com/products/parasoft-c-ctest/");
//		driver.findElement(By.xpath("/html/body/div[3]/header/div/div/div/nav[1]/ul/li[1]/div/div/div[2]/ul/li[1]/a")).click();
//		driver.findElement(By.xpath("/html/body")).click();
//		driver.findElement(By.xpath())
        
        
//		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
//    	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
//    	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("ammu.v");
//    	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("234Abgf$");
//     	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		driver.get("https://parabank.parasoft.com/parabank/admin.htm");
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/input")).click();
	}
	
	
	
	

}
