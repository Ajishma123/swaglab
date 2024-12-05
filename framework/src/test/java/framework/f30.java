package framework;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class f30 {
	@Test
	public void xyzbank() {
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\User\\Downloads\\chromedriver-win64 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice-automation.com/");
		driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div[2]/div/div[1]/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-wrap\"]/section/div/nav/span/span[1]/a")).click();
		driver.get("https://practice-automation.com/slider/");
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slideMe\"]"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(slider,100,0).perform();
		driver.findElement(By.xpath("//*[@id=\"top-wrap\"]/section/div/nav/span/span[1]/a")).click();
//		driver.findElement(By.cssSelector("")).click();
		
	}
	
 
}
