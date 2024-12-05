package framework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f29 {
	@Test
	public void swaglab() {
		System.setProperty("Webdriver.chrome.Driver","C:\\Users\\User\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String expectedresult="https://www.saucedemo.com/v1/inventory.html";
		String actualresult=driver.getCurrentUrl();
		assertEquals(actualresult,expectedresult,"login not successfull");
        driver.findElement(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.pricebar > button")).click();
		String expectedresult2="https://www.saucedemo.com/v1/inventory.html";
		String actualresult2=driver.getCurrentUrl();
		assertEquals(actualresult2,expectedresult2,"not working");
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		String expectedresult3="https://www.saucedemo.com/v1/cart.html";
		String actualresult3=driver.getCurrentUrl();
		assertEquals(actualresult3,expectedresult3,"not working");
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		String expectedresult4="https://www.saucedemo.com/v1/checkout-step-one.html";
		String actualresult4=driver.getCurrentUrl();
		assertEquals(actualresult4,expectedresult4,"not working");
		driver.findElement(By.id("first-name")).sendKeys("ajishma");
		driver.findElement(By.id("last-name")).sendKeys("lulu");
		driver.findElement(By.id("postal-code")).sendKeys("673631");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		String expectedresult5="https://www.saucedemo.com/v1/checkout-step-two.html";
		String actualresult5=driver.getCurrentUrl();
		assertEquals(actualresult5,expectedresult5,"not working");
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		String expectedresult6="https://www.saucedemo.com/v1/checkout-complete.html";
		String actualresult6=driver.getCurrentUrl();
		assertEquals(actualresult6,expectedresult6,"not working");
		
		
			}

}
