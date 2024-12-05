package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class f20 {
	WebDriver driver;
	@Test(dataProvider="file")
	public void pet(String name,String name2,String name3,String name4,String name5,String name6,String name7,String name8,String name9,String name10,String name11,String name12,String name13,String lanh,String pet) throws InterruptedException {
		System.setProperty("Webdriver.chrome.Driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input")).sendKeys(name2);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys(name3);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys(name4);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys(name5);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input")).sendKeys(name6);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input")).sendKeys(name7);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input")).sendKeys(name8);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input")).sendKeys(name9);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input")).sendKeys(name10);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input")).sendKeys(name11);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input")).sendKeys(name12);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input")).sendKeys(name13);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select")).sendKeys(lanh);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select")).sendKeys(pet);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=1622C053456870B77E50320DFA0B0981?signonForm=");
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		driver.findElement(By.cssSelector("#Catalog > form > input[type=submit]")).click();
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		}
	@AfterTest
	public void form2() {
		driver.close();
		}
	@DataProvider(name="file")
	public Object[][]form3(){
		return new Object[][] {
			{"ammu","asdfghj","asdfghj","ammu","v","ammuss.gmail.com","9072814930","asdfghj","lkjhgfhjkhg","kjhguikj","ertyui","673631","india","english","Bird"}
		};
	}

}
