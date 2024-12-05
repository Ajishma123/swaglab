package framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class f32 {
	@Test
	public void swaglab() throws InterruptedException {
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\User\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://letcode.in/test");
//		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[1]")).click();
//		driver.findElement(By.id("name")).sendKeys("Aswiin");
//		driver.findElement(By.id("email")).sendKeys("aswin2089@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("jhgfdjhgfd");
//		driver.findElement(By.xpath("//*[@id=\"agree\"]")).click();
//		driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/div/div/form/div[5]/p/button")).click();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		driver.findElement(By.id("fullName")).sendKeys("Ramu");
		WebElement text=driver.findElement(By.id("join"));
		text.clear();
		text.sendKeys("i am not bad");
		WebElement text1 =driver.findElement(By.id("getMe"));
		text1.clear();
		text1.sendKeys("india");
		WebElement text2=driver.findElement(By.id("clearMe"));
		text2.clear();
		text2.sendKeys("remove");
//		driver.findElement(By.xpath("//*[@id=\"dontwrite\"]")).click();
		driver.navigate().to("https://letcode.in/test");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		driver.findElement(By.id("home")).click();
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("position")).click();
		WebElement button = driver.findElement(By.id("color"));
		String backgroundColor = button.getCssValue("background-color");
        System.out.println("Original Background Color: " + backgroundColor);
//		 Convert RGB/RGBA to Hex manually 
		String hexColor = convertColorToHex(backgroundColor); 
		System.out.println("Hex Color Code: " + hexColor); 
		driver.findElement(By.id("property")).click();
        driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
        System.out.println("it is disabled ");
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2")); // Replace with actual locator

        // Initialize Actions class and perform click-and-hold
        Actions actions = new Actions(driver);
        actions.clickAndHold(button).perform();

        // Hold for a few seconds (e.g., 5 seconds)
        Thread.sleep(5000);

        // Release the button
        actions.release().perform();
   
        // Close the browser
        driver.get("https://letcode.in/");
        driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("fruits")).sendKeys("Apple");
        driver.findElement(By.id("superheros")).sendKeys("Aquaman");
        driver.findElement(By.id("lang")).sendKeys("Java");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.get("https://letcode.in/test");
        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
        driver.findElement(By.id("accept")).click();
        

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get alert text and print it
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);

        // Accept the alert (click OK)
        alert.accept();
        driver.findElement(By.id("confirm")).click();
        Alert alert1 = driver.switchTo().alert();
        String alertText1 = alert1.getText();
        System.out.println("Alert text: " + alertText1);
        

        // Accept the alert (click OK)
        alert.accept();
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();

        // Get prompt text and print it
        String alertText2 = promptAlert.getText();
        System.out.println("Prompt alert text: " + alertText2);

        // Send text to the prompt
        promptAlert.sendKeys("AJU");

        // Accept the prompt (click OK)
        promptAlert.accept();

   driver.navigate().refresh();
    
       WebElement button3=  driver.findElement(By.xpath("//button[starts-with(@class,'button is-success')]"));
    		   button3.click();
        driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")).click();
        driver.get("https://letcode.in/test");
        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input")).sendKeys("athul");
        driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys("prsanth");
        driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input")).sendKeys("athul.1998@gmail.com");
        
        
        
//        driver.quit();
}
        
	




       
	
	public static String convertColorToHex(String color) {

        String[] values;



        // Handle RGB and RGBA

        if (color.startsWith("rgba")) {

            values = color.replace("rgba(", "").replace(")", "").split(",");

        } else if (color.startsWith("rgb")) {

            values = color.replace("rgb(", "").replace(")", "").split(",");

        } else {

            return "Invalid color format"; 

        }



        // Parse the red, green, and blue values

        int r = Integer.parseInt(values[0].trim());

        int g = Integer.parseInt(values[1].trim());

        int b = Integer.parseInt(values[2].trim());



        // Convert to Hex format

        return String.format("#82486f", r, g, b).toUpperCase();
        
		
		
		
		
		
		
		
		
}
}
	
	
	
	
