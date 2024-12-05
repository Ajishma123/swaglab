package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test; 

public class f31 {
	@Test
	public void productpage() {
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\User\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.demoblaze.com/index.html");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
//		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
//	    driver.navigate().refresh();
//		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[1]")).click();
//        System.out.println("hello");
	WebElement username=driver.findElement(By.linkText("Contact"));
	   username.click();
	    driver.navigate().refresh();
	    WebElement username1=driver.findElement(By.linkText("Contact"));
		   username1.click();
	// driver.findElement(By.xpath("//input[starts_with(@id,'recipient-email')]")).sendKeys("ammas@gmail.com");
	  // driver.findElement(By.xpath("//input[starts_with(@id,'recipient-name')]")).sendKeys("ammukutity");
	   driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys("pass");
	   
	   
	
	}

}
